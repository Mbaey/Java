package com.nwnu.emall.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Sku {
    private Long id;

    private String proppath;

    private String images;

    private Long pricemoney;

    private String pricetext;

    private Long goodsitemid;

    private String propvaluesjson;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProppath() {
        return proppath;
    }

    public void setProppath(String proppath) {
        this.proppath = proppath == null ? null : proppath.trim();
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public Long getPricemoney() {
        return pricemoney;
    }

    public void setPricemoney(Long pricemoney) {
        this.pricemoney = pricemoney;
    }

    public String getPricetext() {
        return pricetext;
    }

    public void setPricetext(String pricetext) {
        this.pricetext = pricetext == null ? null : pricetext.trim();
    }

    public Long getGoodsitemid() {
        return goodsitemid;
    }

    public void setGoodsitemid(Long goodsitemid) {
        this.goodsitemid = goodsitemid;
    }

    public String getPropvaluesjson() {
        return propvaluesjson;
    }

    public void setPropvaluesjson(String propvaluesjson) {
        this.propvaluesjson = propvaluesjson == null ? null : propvaluesjson.trim();
    }
}