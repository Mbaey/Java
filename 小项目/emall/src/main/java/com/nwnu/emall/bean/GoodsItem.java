package com.nwnu.emall.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class GoodsItem {
    private Long id;

    private Byte enable;

    private Long shopid;

    private String title;

    private String subtitle;

    private Integer price;

    private String images;

    private String vedios;

    private Long categoryid;

    private Long rootcategoryid;

    private String skutext;

    private Long favcount;

    private String tmalldescurl;

    private String extdata;

    private String props;

    private Long totalcommentcount;

    private Long monthsellcount;

    private String froms;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getEnable() {
        return enable;
    }

    public void setEnable(Byte enable) {
        this.enable = enable;
    }

    public Long getShopid() {
        return shopid;
    }

    public void setShopid(Long shopid) {
        this.shopid = shopid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public String getVedios() {
        return vedios;
    }

    public void setVedios(String vedios) {
        this.vedios = vedios == null ? null : vedios.trim();
    }

    public Long getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
    }

    public Long getRootcategoryid() {
        return rootcategoryid;
    }

    public void setRootcategoryid(Long rootcategoryid) {
        this.rootcategoryid = rootcategoryid;
    }

    public String getSkutext() {
        return skutext;
    }

    public void setSkutext(String skutext) {
        this.skutext = skutext == null ? null : skutext.trim();
    }

    public Long getFavcount() {
        return favcount;
    }

    public void setFavcount(Long favcount) {
        this.favcount = favcount;
    }

    public String getTmalldescurl() {
        return tmalldescurl;
    }

    public void setTmalldescurl(String tmalldescurl) {
        this.tmalldescurl = tmalldescurl == null ? null : tmalldescurl.trim();
    }

    public String getExtdata() {
        return extdata;
    }

    public void setExtdata(String extdata) {
        this.extdata = extdata == null ? null : extdata.trim();
    }

    public String getProps() {
        return props;
    }

    public void setProps(String props) {
        this.props = props == null ? null : props.trim();
    }

    public Long getTotalcommentcount() {
        return totalcommentcount;
    }

    public void setTotalcommentcount(Long totalcommentcount) {
        this.totalcommentcount = totalcommentcount;
    }

    public Long getMonthsellcount() {
        return monthsellcount;
    }

    public void setMonthsellcount(Long monthsellcount) {
        this.monthsellcount = monthsellcount;
    }

    public String getFroms() {
        return froms;
    }

    public void setFroms(String froms) {
        this.froms = froms == null ? null : froms.trim();
    }
}