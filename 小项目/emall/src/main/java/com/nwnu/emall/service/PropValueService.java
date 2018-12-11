package com.nwnu.emall.service;

import com.nwnu.emall.bean.PropValue;
import com.nwnu.emall.bean.PropValueExample;
import com.nwnu.emall.dao.PropValueMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PropValueService {
    @Autowired
    private PropValueMapper propValueMapper;
    public List<PropValue> getAllByFk(Long product_id) {
        PropValueExample propValueExample = new PropValueExample();
        propValueExample.or().andGoodsidEqualTo(product_id);
        return propValueMapper.selectByExample(propValueExample);
    }
}