package com.nwnu.db;

import com.alibaba.fastjson.JSONObject;
import com.nwnu.emall.EmallApplication;
import com.nwnu.emall.bean.*;
import com.nwnu.emall.dao.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Random;

/**
 * Created by lcy on 2018/7/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmallApplication.class)
public class GoodsChange {
//    1.goods_item 加入产地。销量，评论
//    2.sku 加入 prop and value
//    3.
    @Autowired
    private GoodsItemMapper goodsItemMapper;
    private Random random=new Random();
    String[] froms={"广州广东", "浙江杭州","天津","河北", "山东济南","广东深圳","浙江义乌"};
    @Test
    public void fun1(){
//        List<Long> allPk = goodsItemMapper.selectAllPk();
//        for(Long pk : allPk){
//            goodsItemMapper.updateByExample()??
//        }
        List<GoodsItem> goodsItems = goodsItemMapper.selectByExample(new GoodsItemExample());
        for (GoodsItem goodsItem : goodsItems){
            int sale = random.nextInt(50000);
            goodsItem.setMonthsellcount((long) sale);
            goodsItem.setTotalcommentcount((long) (sale*random.nextFloat()));
            int length = froms.length;
            goodsItem.setFroms(froms[random.nextInt(length)]);
            goodsItemMapper.updateByPrimaryKey(goodsItem);
        }
        System.out.println(goodsItems.size());

    }
    @Autowired
    PaymethodMapper paymethodMapper;
    @Test
    public void testupdateByExample(){
        Paymethod paymethod = new Paymethod((byte) 2, "微信");
        PaymethodExample paymethodExample = new PaymethodExample();
        paymethodExample.or().andIdEqualTo((byte) 2);
        paymethodMapper.updateByExample(paymethod,paymethodExample);
    }

    @Test
    public void testRandom(){
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(1));
        }
    } @Test
    public void testJson(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("aa",1);
        jsonObject.put("aa",2);
        System.out.println(jsonObject.toString());
        System.out.println(jsonObject.toJSONString());
    }
    @Autowired
    SkuMapper skuMapper;
    @Autowired
    PropsMapper propsMapper;
    @Autowired
    PropValueMapper propValueMapper;

    @Test
    public void testChangeSku(){
        List<Sku> skus = skuMapper.selectByExample(new SkuExample());
        for (Sku sku : skus) {
            Long goodsitemid = sku.getGoodsitemid();
            String proppath = sku.getProppath();
            String[] split = proppath.split(";");
            JSONObject jsonObject = new JSONObject();
            for (String s : split) {
                String[] propAndValue = s.split(":");
                String propStr = propAndValue[0];
                String propValueStr = propAndValue[1];
                long prop = Long.parseLong(propStr);
                long propVal = Long.parseLong(propValueStr);
                String key = null;
                String value= null;
                try {
                    key = propsMapper.selectByPrimaryKey(prop).getName();
                    PropValueExample propValueExample = new PropValueExample();
                    value = propValueMapper.selectByPrimaryKey(new PropValueKey(propVal, goodsitemid)).getName();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println(sku);
                }
                jsonObject.put(key, value);
            }
            System.out.println(jsonObject);
            sku.setPropvaluesjson(jsonObject.toJSONString());
            skuMapper.updateByPrimaryKey(sku);
        }
    }
}