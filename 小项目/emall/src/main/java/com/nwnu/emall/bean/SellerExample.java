package com.nwnu.emall.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SellerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SellerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNull() {
            addCriterion("shopName is null");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNotNull() {
            addCriterion("shopName is not null");
            return (Criteria) this;
        }

        public Criteria andShopnameEqualTo(String value) {
            addCriterion("shopName =", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotEqualTo(String value) {
            addCriterion("shopName <>", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThan(String value) {
            addCriterion("shopName >", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThanOrEqualTo(String value) {
            addCriterion("shopName >=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThan(String value) {
            addCriterion("shopName <", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThanOrEqualTo(String value) {
            addCriterion("shopName <=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLike(String value) {
            addCriterion("shopName like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotLike(String value) {
            addCriterion("shopName not like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameIn(List<String> values) {
            addCriterion("shopName in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotIn(List<String> values) {
            addCriterion("shopName not in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameBetween(String value1, String value2) {
            addCriterion("shopName between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotBetween(String value1, String value2) {
            addCriterion("shopName not between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopurlIsNull() {
            addCriterion("shopUrl is null");
            return (Criteria) this;
        }

        public Criteria andShopurlIsNotNull() {
            addCriterion("shopUrl is not null");
            return (Criteria) this;
        }

        public Criteria andShopurlEqualTo(String value) {
            addCriterion("shopUrl =", value, "shopurl");
            return (Criteria) this;
        }

        public Criteria andShopurlNotEqualTo(String value) {
            addCriterion("shopUrl <>", value, "shopurl");
            return (Criteria) this;
        }

        public Criteria andShopurlGreaterThan(String value) {
            addCriterion("shopUrl >", value, "shopurl");
            return (Criteria) this;
        }

        public Criteria andShopurlGreaterThanOrEqualTo(String value) {
            addCriterion("shopUrl >=", value, "shopurl");
            return (Criteria) this;
        }

        public Criteria andShopurlLessThan(String value) {
            addCriterion("shopUrl <", value, "shopurl");
            return (Criteria) this;
        }

        public Criteria andShopurlLessThanOrEqualTo(String value) {
            addCriterion("shopUrl <=", value, "shopurl");
            return (Criteria) this;
        }

        public Criteria andShopurlLike(String value) {
            addCriterion("shopUrl like", value, "shopurl");
            return (Criteria) this;
        }

        public Criteria andShopurlNotLike(String value) {
            addCriterion("shopUrl not like", value, "shopurl");
            return (Criteria) this;
        }

        public Criteria andShopurlIn(List<String> values) {
            addCriterion("shopUrl in", values, "shopurl");
            return (Criteria) this;
        }

        public Criteria andShopurlNotIn(List<String> values) {
            addCriterion("shopUrl not in", values, "shopurl");
            return (Criteria) this;
        }

        public Criteria andShopurlBetween(String value1, String value2) {
            addCriterion("shopUrl between", value1, value2, "shopurl");
            return (Criteria) this;
        }

        public Criteria andShopurlNotBetween(String value1, String value2) {
            addCriterion("shopUrl not between", value1, value2, "shopurl");
            return (Criteria) this;
        }

        public Criteria andShopiconIsNull() {
            addCriterion("shopIcon is null");
            return (Criteria) this;
        }

        public Criteria andShopiconIsNotNull() {
            addCriterion("shopIcon is not null");
            return (Criteria) this;
        }

        public Criteria andShopiconEqualTo(String value) {
            addCriterion("shopIcon =", value, "shopicon");
            return (Criteria) this;
        }

        public Criteria andShopiconNotEqualTo(String value) {
            addCriterion("shopIcon <>", value, "shopicon");
            return (Criteria) this;
        }

        public Criteria andShopiconGreaterThan(String value) {
            addCriterion("shopIcon >", value, "shopicon");
            return (Criteria) this;
        }

        public Criteria andShopiconGreaterThanOrEqualTo(String value) {
            addCriterion("shopIcon >=", value, "shopicon");
            return (Criteria) this;
        }

        public Criteria andShopiconLessThan(String value) {
            addCriterion("shopIcon <", value, "shopicon");
            return (Criteria) this;
        }

        public Criteria andShopiconLessThanOrEqualTo(String value) {
            addCriterion("shopIcon <=", value, "shopicon");
            return (Criteria) this;
        }

        public Criteria andShopiconLike(String value) {
            addCriterion("shopIcon like", value, "shopicon");
            return (Criteria) this;
        }

        public Criteria andShopiconNotLike(String value) {
            addCriterion("shopIcon not like", value, "shopicon");
            return (Criteria) this;
        }

        public Criteria andShopiconIn(List<String> values) {
            addCriterion("shopIcon in", values, "shopicon");
            return (Criteria) this;
        }

        public Criteria andShopiconNotIn(List<String> values) {
            addCriterion("shopIcon not in", values, "shopicon");
            return (Criteria) this;
        }

        public Criteria andShopiconBetween(String value1, String value2) {
            addCriterion("shopIcon between", value1, value2, "shopicon");
            return (Criteria) this;
        }

        public Criteria andShopiconNotBetween(String value1, String value2) {
            addCriterion("shopIcon not between", value1, value2, "shopicon");
            return (Criteria) this;
        }

        public Criteria andRatesumIsNull() {
            addCriterion("rateSum is null");
            return (Criteria) this;
        }

        public Criteria andRatesumIsNotNull() {
            addCriterion("rateSum is not null");
            return (Criteria) this;
        }

        public Criteria andRatesumEqualTo(Long value) {
            addCriterion("rateSum =", value, "ratesum");
            return (Criteria) this;
        }

        public Criteria andRatesumNotEqualTo(Long value) {
            addCriterion("rateSum <>", value, "ratesum");
            return (Criteria) this;
        }

        public Criteria andRatesumGreaterThan(Long value) {
            addCriterion("rateSum >", value, "ratesum");
            return (Criteria) this;
        }

        public Criteria andRatesumGreaterThanOrEqualTo(Long value) {
            addCriterion("rateSum >=", value, "ratesum");
            return (Criteria) this;
        }

        public Criteria andRatesumLessThan(Long value) {
            addCriterion("rateSum <", value, "ratesum");
            return (Criteria) this;
        }

        public Criteria andRatesumLessThanOrEqualTo(Long value) {
            addCriterion("rateSum <=", value, "ratesum");
            return (Criteria) this;
        }

        public Criteria andRatesumIn(List<Long> values) {
            addCriterion("rateSum in", values, "ratesum");
            return (Criteria) this;
        }

        public Criteria andRatesumNotIn(List<Long> values) {
            addCriterion("rateSum not in", values, "ratesum");
            return (Criteria) this;
        }

        public Criteria andRatesumBetween(Long value1, Long value2) {
            addCriterion("rateSum between", value1, value2, "ratesum");
            return (Criteria) this;
        }

        public Criteria andRatesumNotBetween(Long value1, Long value2) {
            addCriterion("rateSum not between", value1, value2, "ratesum");
            return (Criteria) this;
        }

        public Criteria andShoptypeIsNull() {
            addCriterion("shopType is null");
            return (Criteria) this;
        }

        public Criteria andShoptypeIsNotNull() {
            addCriterion("shopType is not null");
            return (Criteria) this;
        }

        public Criteria andShoptypeEqualTo(String value) {
            addCriterion("shopType =", value, "shoptype");
            return (Criteria) this;
        }

        public Criteria andShoptypeNotEqualTo(String value) {
            addCriterion("shopType <>", value, "shoptype");
            return (Criteria) this;
        }

        public Criteria andShoptypeGreaterThan(String value) {
            addCriterion("shopType >", value, "shoptype");
            return (Criteria) this;
        }

        public Criteria andShoptypeGreaterThanOrEqualTo(String value) {
            addCriterion("shopType >=", value, "shoptype");
            return (Criteria) this;
        }

        public Criteria andShoptypeLessThan(String value) {
            addCriterion("shopType <", value, "shoptype");
            return (Criteria) this;
        }

        public Criteria andShoptypeLessThanOrEqualTo(String value) {
            addCriterion("shopType <=", value, "shoptype");
            return (Criteria) this;
        }

        public Criteria andShoptypeLike(String value) {
            addCriterion("shopType like", value, "shoptype");
            return (Criteria) this;
        }

        public Criteria andShoptypeNotLike(String value) {
            addCriterion("shopType not like", value, "shoptype");
            return (Criteria) this;
        }

        public Criteria andShoptypeIn(List<String> values) {
            addCriterion("shopType in", values, "shoptype");
            return (Criteria) this;
        }

        public Criteria andShoptypeNotIn(List<String> values) {
            addCriterion("shopType not in", values, "shoptype");
            return (Criteria) this;
        }

        public Criteria andShoptypeBetween(String value1, String value2) {
            addCriterion("shopType between", value1, value2, "shoptype");
            return (Criteria) this;
        }

        public Criteria andShoptypeNotBetween(String value1, String value2) {
            addCriterion("shopType not between", value1, value2, "shoptype");
            return (Criteria) this;
        }

        public Criteria andCreditlevelIsNull() {
            addCriterion("creditLevel is null");
            return (Criteria) this;
        }

        public Criteria andCreditlevelIsNotNull() {
            addCriterion("creditLevel is not null");
            return (Criteria) this;
        }

        public Criteria andCreditlevelEqualTo(String value) {
            addCriterion("creditLevel =", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelNotEqualTo(String value) {
            addCriterion("creditLevel <>", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelGreaterThan(String value) {
            addCriterion("creditLevel >", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelGreaterThanOrEqualTo(String value) {
            addCriterion("creditLevel >=", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelLessThan(String value) {
            addCriterion("creditLevel <", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelLessThanOrEqualTo(String value) {
            addCriterion("creditLevel <=", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelLike(String value) {
            addCriterion("creditLevel like", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelNotLike(String value) {
            addCriterion("creditLevel not like", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelIn(List<String> values) {
            addCriterion("creditLevel in", values, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelNotIn(List<String> values) {
            addCriterion("creditLevel not in", values, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelBetween(String value1, String value2) {
            addCriterion("creditLevel between", value1, value2, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelNotBetween(String value1, String value2) {
            addCriterion("creditLevel not between", value1, value2, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andStartsIsNull() {
            addCriterion("starts is null");
            return (Criteria) this;
        }

        public Criteria andStartsIsNotNull() {
            addCriterion("starts is not null");
            return (Criteria) this;
        }

        public Criteria andStartsEqualTo(Date value) {
            addCriterion("starts =", value, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsNotEqualTo(Date value) {
            addCriterion("starts <>", value, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsGreaterThan(Date value) {
            addCriterion("starts >", value, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsGreaterThanOrEqualTo(Date value) {
            addCriterion("starts >=", value, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsLessThan(Date value) {
            addCriterion("starts <", value, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsLessThanOrEqualTo(Date value) {
            addCriterion("starts <=", value, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsIn(List<Date> values) {
            addCriterion("starts in", values, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsNotIn(List<Date> values) {
            addCriterion("starts not in", values, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsBetween(Date value1, Date value2) {
            addCriterion("starts between", value1, value2, "starts");
            return (Criteria) this;
        }

        public Criteria andStartsNotBetween(Date value1, Date value2) {
            addCriterion("starts not between", value1, value2, "starts");
            return (Criteria) this;
        }

        public Criteria andEncryptselleridIsNull() {
            addCriterion("encryptSellerId is null");
            return (Criteria) this;
        }

        public Criteria andEncryptselleridIsNotNull() {
            addCriterion("encryptSellerId is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptselleridEqualTo(String value) {
            addCriterion("encryptSellerId =", value, "encryptsellerid");
            return (Criteria) this;
        }

        public Criteria andEncryptselleridNotEqualTo(String value) {
            addCriterion("encryptSellerId <>", value, "encryptsellerid");
            return (Criteria) this;
        }

        public Criteria andEncryptselleridGreaterThan(String value) {
            addCriterion("encryptSellerId >", value, "encryptsellerid");
            return (Criteria) this;
        }

        public Criteria andEncryptselleridGreaterThanOrEqualTo(String value) {
            addCriterion("encryptSellerId >=", value, "encryptsellerid");
            return (Criteria) this;
        }

        public Criteria andEncryptselleridLessThan(String value) {
            addCriterion("encryptSellerId <", value, "encryptsellerid");
            return (Criteria) this;
        }

        public Criteria andEncryptselleridLessThanOrEqualTo(String value) {
            addCriterion("encryptSellerId <=", value, "encryptsellerid");
            return (Criteria) this;
        }

        public Criteria andEncryptselleridLike(String value) {
            addCriterion("encryptSellerId like", value, "encryptsellerid");
            return (Criteria) this;
        }

        public Criteria andEncryptselleridNotLike(String value) {
            addCriterion("encryptSellerId not like", value, "encryptsellerid");
            return (Criteria) this;
        }

        public Criteria andEncryptselleridIn(List<String> values) {
            addCriterion("encryptSellerId in", values, "encryptsellerid");
            return (Criteria) this;
        }

        public Criteria andEncryptselleridNotIn(List<String> values) {
            addCriterion("encryptSellerId not in", values, "encryptsellerid");
            return (Criteria) this;
        }

        public Criteria andEncryptselleridBetween(String value1, String value2) {
            addCriterion("encryptSellerId between", value1, value2, "encryptsellerid");
            return (Criteria) this;
        }

        public Criteria andEncryptselleridNotBetween(String value1, String value2) {
            addCriterion("encryptSellerId not between", value1, value2, "encryptsellerid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}