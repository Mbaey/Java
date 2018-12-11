package com.nwnu.emall.controller;

import com.github.pagehelper.PageHelper;
import com.nwnu.emall.bean.GoodsItem;
import com.nwnu.emall.bean.PropValue;
import com.nwnu.emall.bean.Props;
import com.nwnu.emall.bean.Sku;
import com.nwnu.emall.service.ProductService;
import com.nwnu.emall.service.PropService;
import com.nwnu.emall.service.PropValueService;
import com.nwnu.emall.service.SkuService;
import com.nwnu.emall.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class ForeController {
    @Autowired
    private ProductService   productService;
    @Autowired
    private SkuService       skuService;
    @Autowired
    private PropValueService porpValueService;
    @Autowired
    private PropService      propService;


    /**
     * 首页访问方法，给首页的JSP页面添加以下数据：
     *
     * @param model
     * @return
     */
    @RequestMapping("/index.html")
    public String index(Model model) {
        return "index";
    }
    @RequestMapping("/home")
    public String home(Model model) {
        return "index";
    }
    @RequestMapping("/searchProduct")
    public String searchProduct(Model model, String keyword) {

        PageHelper.offsetPage(0, 20);
        if(StringUtil.isNotBlank(keyword)){
            List<GoodsItem> products = productService.search(keyword);
            model.addAttribute("products", products);
            return "searchResult";
        }else
            return "index";
    }
    @RequestMapping("/showProduct")
    public String showProduct(Model model, Long product_id) throws Exception {
        GoodsItem goodsItem= productService.get(product_id);
        List<Sku> skus= skuService.getAllByFk(product_id);
        List<PropValue> propValues = porpValueService.getAllByFk(product_id);
        Set<Long> pids = new HashSet<>();
        propValues.forEach(i-> pids.add(i.getPid()));

        List<Props> propsList = propService.getIn(new ArrayList<Long>(pids));
        //一对多处理
        for (PropValue propValue : propValues) {
            for (Props props : propsList) {
                if(props.getId() == propValue.getPid()){
                    List<PropValue> propValuesIn = props.getPropValues();
                    propValuesIn.add(propValue);
                    props.setPropValues(propValuesIn);
                }
            }
        }
        model.addAttribute("product", goodsItem);
        model.addAttribute("skus", skus);

        model.addAttribute("props", propsList);

        System.out.println(propsList);
//        System.out.println(goodsItem);
//        if(true){
//            throw new Exception("some exception");
//        }
        return "product";
    }
}