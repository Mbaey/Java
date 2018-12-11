package com.nwnu.emall.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Seller {
    private Long id;

    private Long userid;

    private String shopname;

    private String shopurl;

    private String shopicon;

    private Long ratesum;

    private String shoptype;

    private String creditlevel;

    private Date starts;

    private String encryptsellerid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public String getShopurl() {
        return shopurl;
    }

    public void setShopurl(String shopurl) {
        this.shopurl = shopurl == null ? null : shopurl.trim();
    }

    public String getShopicon() {
        return shopicon;
    }

    public void setShopicon(String shopicon) {
        this.shopicon = shopicon == null ? null : shopicon.trim();
    }

    public Long getRatesum() {
        return ratesum;
    }

    public void setRatesum(Long ratesum) {
        this.ratesum = ratesum;
    }

    public String getShoptype() {
        return shoptype;
    }

    public void setShoptype(String shoptype) {
        this.shoptype = shoptype == null ? null : shoptype.trim();
    }

    public String getCreditlevel() {
        return creditlevel;
    }

    public void setCreditlevel(String creditlevel) {
        this.creditlevel = creditlevel == null ? null : creditlevel.trim();
    }

    public Date getStarts() {
        return starts;
    }

    public void setStarts(Date starts) {
        this.starts = starts;
    }

    public String getEncryptsellerid() {
        return encryptsellerid;
    }

    public void setEncryptsellerid(String encryptsellerid) {
        this.encryptsellerid = encryptsellerid == null ? null : encryptsellerid.trim();
    }
}