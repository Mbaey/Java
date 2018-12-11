package com.nwnu.emall.service;

import com.nwnu.emall.bean.Props;
import com.nwnu.emall.bean.PropsExample;
import com.nwnu.emall.dao.PropsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PropService {
    @Autowired
    private PropsMapper propsMapper;
    public List<Props> getIn(ArrayList<Long> longs) {
        PropsExample propsExample = new PropsExample();
        propsExample.or().andIdIn(longs);
        return propsMapper.selectByExample(propsExample);
    }
}