package com.nwnu.emall.service;

import com.nwnu.emall.bean.Sku;
import com.nwnu.emall.bean.SkuExample;
import com.nwnu.emall.dao.SkuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SkuService {
    @Autowired
    private SkuMapper skuMapper;
    public List<Sku> getAllByFk(Long product_id) {
        SkuExample skuExample = new SkuExample();
        skuExample.or().andGoodsitemidEqualTo(product_id);
        return skuMapper.selectByExample(skuExample);
    }
}
