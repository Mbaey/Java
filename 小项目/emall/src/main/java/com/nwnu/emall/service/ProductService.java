package com.nwnu.emall.service;

import com.nwnu.emall.bean.GoodsItem;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {
    List<GoodsItem> search(String keyword);

    GoodsItem get(Long product_id);
}