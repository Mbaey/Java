package com.nwnu.emall.service.impl;

import com.nwnu.emall.bean.GoodsItem;
import com.nwnu.emall.bean.GoodsItemExample;
import com.nwnu.emall.dao.GoodsItemMapper;
import com.nwnu.emall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {
    @Autowired
    GoodsItemMapper goodsItemMapper;
    @Override
    public List<GoodsItem> search(String keyword) {
        GoodsItemExample example = new GoodsItemExample();
//        GoodsItemExample.Criteria criteria = example.createCriteria();
//        criteria.andTitleLike("%"+keyword+"%");
        example.or().andTitleLike("%"+keyword+"%");
        return goodsItemMapper.selectByExample(example);
    }

    @Override
    public GoodsItem get(Long product_id) {
        return goodsItemMapper.selectByPrimaryKey(product_id);
    }
}