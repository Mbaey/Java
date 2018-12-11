package com.nwnu.emall.bean;

import java.util.ArrayList;
import java.util.List;

public class GoodsItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsItemExample() {
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

        public Criteria andEnableIsNull() {
            addCriterion("enable is null");
            return (Criteria) this;
        }

        public Criteria andEnableIsNotNull() {
            addCriterion("enable is not null");
            return (Criteria) this;
        }

        public Criteria andEnableEqualTo(Byte value) {
            addCriterion("enable =", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotEqualTo(Byte value) {
            addCriterion("enable <>", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThan(Byte value) {
            addCriterion("enable >", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThanOrEqualTo(Byte value) {
            addCriterion("enable >=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThan(Byte value) {
            addCriterion("enable <", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThanOrEqualTo(Byte value) {
            addCriterion("enable <=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableIn(List<Byte> values) {
            addCriterion("enable in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotIn(List<Byte> values) {
            addCriterion("enable not in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableBetween(Byte value1, Byte value2) {
            addCriterion("enable between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotBetween(Byte value1, Byte value2) {
            addCriterion("enable not between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andShopidIsNull() {
            addCriterion("shopId is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("shopId is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(Long value) {
            addCriterion("shopId =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(Long value) {
            addCriterion("shopId <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(Long value) {
            addCriterion("shopId >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(Long value) {
            addCriterion("shopId >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(Long value) {
            addCriterion("shopId <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(Long value) {
            addCriterion("shopId <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<Long> values) {
            addCriterion("shopId in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<Long> values) {
            addCriterion("shopId not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(Long value1, Long value2) {
            addCriterion("shopId between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(Long value1, Long value2) {
            addCriterion("shopId not between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNull() {
            addCriterion("subtitle is null");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNotNull() {
            addCriterion("subtitle is not null");
            return (Criteria) this;
        }

        public Criteria andSubtitleEqualTo(String value) {
            addCriterion("subtitle =", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotEqualTo(String value) {
            addCriterion("subtitle <>", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThan(String value) {
            addCriterion("subtitle >", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("subtitle >=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThan(String value) {
            addCriterion("subtitle <", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThanOrEqualTo(String value) {
            addCriterion("subtitle <=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLike(String value) {
            addCriterion("subtitle like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotLike(String value) {
            addCriterion("subtitle not like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleIn(List<String> values) {
            addCriterion("subtitle in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotIn(List<String> values) {
            addCriterion("subtitle not in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleBetween(String value1, String value2) {
            addCriterion("subtitle between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotBetween(String value1, String value2) {
            addCriterion("subtitle not between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andImagesIsNull() {
            addCriterion("images is null");
            return (Criteria) this;
        }

        public Criteria andImagesIsNotNull() {
            addCriterion("images is not null");
            return (Criteria) this;
        }

        public Criteria andImagesEqualTo(String value) {
            addCriterion("images =", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotEqualTo(String value) {
            addCriterion("images <>", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThan(String value) {
            addCriterion("images >", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThanOrEqualTo(String value) {
            addCriterion("images >=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThan(String value) {
            addCriterion("images <", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThanOrEqualTo(String value) {
            addCriterion("images <=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLike(String value) {
            addCriterion("images like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotLike(String value) {
            addCriterion("images not like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesIn(List<String> values) {
            addCriterion("images in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotIn(List<String> values) {
            addCriterion("images not in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesBetween(String value1, String value2) {
            addCriterion("images between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotBetween(String value1, String value2) {
            addCriterion("images not between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andVediosIsNull() {
            addCriterion("vedios is null");
            return (Criteria) this;
        }

        public Criteria andVediosIsNotNull() {
            addCriterion("vedios is not null");
            return (Criteria) this;
        }

        public Criteria andVediosEqualTo(String value) {
            addCriterion("vedios =", value, "vedios");
            return (Criteria) this;
        }

        public Criteria andVediosNotEqualTo(String value) {
            addCriterion("vedios <>", value, "vedios");
            return (Criteria) this;
        }

        public Criteria andVediosGreaterThan(String value) {
            addCriterion("vedios >", value, "vedios");
            return (Criteria) this;
        }

        public Criteria andVediosGreaterThanOrEqualTo(String value) {
            addCriterion("vedios >=", value, "vedios");
            return (Criteria) this;
        }

        public Criteria andVediosLessThan(String value) {
            addCriterion("vedios <", value, "vedios");
            return (Criteria) this;
        }

        public Criteria andVediosLessThanOrEqualTo(String value) {
            addCriterion("vedios <=", value, "vedios");
            return (Criteria) this;
        }

        public Criteria andVediosLike(String value) {
            addCriterion("vedios like", value, "vedios");
            return (Criteria) this;
        }

        public Criteria andVediosNotLike(String value) {
            addCriterion("vedios not like", value, "vedios");
            return (Criteria) this;
        }

        public Criteria andVediosIn(List<String> values) {
            addCriterion("vedios in", values, "vedios");
            return (Criteria) this;
        }

        public Criteria andVediosNotIn(List<String> values) {
            addCriterion("vedios not in", values, "vedios");
            return (Criteria) this;
        }

        public Criteria andVediosBetween(String value1, String value2) {
            addCriterion("vedios between", value1, value2, "vedios");
            return (Criteria) this;
        }

        public Criteria andVediosNotBetween(String value1, String value2) {
            addCriterion("vedios not between", value1, value2, "vedios");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNull() {
            addCriterion("categoryId is null");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("categoryId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(Long value) {
            addCriterion("categoryId =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(Long value) {
            addCriterion("categoryId <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(Long value) {
            addCriterion("categoryId >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(Long value) {
            addCriterion("categoryId >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(Long value) {
            addCriterion("categoryId <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(Long value) {
            addCriterion("categoryId <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<Long> values) {
            addCriterion("categoryId in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<Long> values) {
            addCriterion("categoryId not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(Long value1, Long value2) {
            addCriterion("categoryId between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(Long value1, Long value2) {
            addCriterion("categoryId not between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andRootcategoryidIsNull() {
            addCriterion("rootCategoryId is null");
            return (Criteria) this;
        }

        public Criteria andRootcategoryidIsNotNull() {
            addCriterion("rootCategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andRootcategoryidEqualTo(Long value) {
            addCriterion("rootCategoryId =", value, "rootcategoryid");
            return (Criteria) this;
        }

        public Criteria andRootcategoryidNotEqualTo(Long value) {
            addCriterion("rootCategoryId <>", value, "rootcategoryid");
            return (Criteria) this;
        }

        public Criteria andRootcategoryidGreaterThan(Long value) {
            addCriterion("rootCategoryId >", value, "rootcategoryid");
            return (Criteria) this;
        }

        public Criteria andRootcategoryidGreaterThanOrEqualTo(Long value) {
            addCriterion("rootCategoryId >=", value, "rootcategoryid");
            return (Criteria) this;
        }

        public Criteria andRootcategoryidLessThan(Long value) {
            addCriterion("rootCategoryId <", value, "rootcategoryid");
            return (Criteria) this;
        }

        public Criteria andRootcategoryidLessThanOrEqualTo(Long value) {
            addCriterion("rootCategoryId <=", value, "rootcategoryid");
            return (Criteria) this;
        }

        public Criteria andRootcategoryidIn(List<Long> values) {
            addCriterion("rootCategoryId in", values, "rootcategoryid");
            return (Criteria) this;
        }

        public Criteria andRootcategoryidNotIn(List<Long> values) {
            addCriterion("rootCategoryId not in", values, "rootcategoryid");
            return (Criteria) this;
        }

        public Criteria andRootcategoryidBetween(Long value1, Long value2) {
            addCriterion("rootCategoryId between", value1, value2, "rootcategoryid");
            return (Criteria) this;
        }

        public Criteria andRootcategoryidNotBetween(Long value1, Long value2) {
            addCriterion("rootCategoryId not between", value1, value2, "rootcategoryid");
            return (Criteria) this;
        }

        public Criteria andSkutextIsNull() {
            addCriterion("skuText is null");
            return (Criteria) this;
        }

        public Criteria andSkutextIsNotNull() {
            addCriterion("skuText is not null");
            return (Criteria) this;
        }

        public Criteria andSkutextEqualTo(String value) {
            addCriterion("skuText =", value, "skutext");
            return (Criteria) this;
        }

        public Criteria andSkutextNotEqualTo(String value) {
            addCriterion("skuText <>", value, "skutext");
            return (Criteria) this;
        }

        public Criteria andSkutextGreaterThan(String value) {
            addCriterion("skuText >", value, "skutext");
            return (Criteria) this;
        }

        public Criteria andSkutextGreaterThanOrEqualTo(String value) {
            addCriterion("skuText >=", value, "skutext");
            return (Criteria) this;
        }

        public Criteria andSkutextLessThan(String value) {
            addCriterion("skuText <", value, "skutext");
            return (Criteria) this;
        }

        public Criteria andSkutextLessThanOrEqualTo(String value) {
            addCriterion("skuText <=", value, "skutext");
            return (Criteria) this;
        }

        public Criteria andSkutextLike(String value) {
            addCriterion("skuText like", value, "skutext");
            return (Criteria) this;
        }

        public Criteria andSkutextNotLike(String value) {
            addCriterion("skuText not like", value, "skutext");
            return (Criteria) this;
        }

        public Criteria andSkutextIn(List<String> values) {
            addCriterion("skuText in", values, "skutext");
            return (Criteria) this;
        }

        public Criteria andSkutextNotIn(List<String> values) {
            addCriterion("skuText not in", values, "skutext");
            return (Criteria) this;
        }

        public Criteria andSkutextBetween(String value1, String value2) {
            addCriterion("skuText between", value1, value2, "skutext");
            return (Criteria) this;
        }

        public Criteria andSkutextNotBetween(String value1, String value2) {
            addCriterion("skuText not between", value1, value2, "skutext");
            return (Criteria) this;
        }

        public Criteria andFavcountIsNull() {
            addCriterion("favcount is null");
            return (Criteria) this;
        }

        public Criteria andFavcountIsNotNull() {
            addCriterion("favcount is not null");
            return (Criteria) this;
        }

        public Criteria andFavcountEqualTo(Long value) {
            addCriterion("favcount =", value, "favcount");
            return (Criteria) this;
        }

        public Criteria andFavcountNotEqualTo(Long value) {
            addCriterion("favcount <>", value, "favcount");
            return (Criteria) this;
        }

        public Criteria andFavcountGreaterThan(Long value) {
            addCriterion("favcount >", value, "favcount");
            return (Criteria) this;
        }

        public Criteria andFavcountGreaterThanOrEqualTo(Long value) {
            addCriterion("favcount >=", value, "favcount");
            return (Criteria) this;
        }

        public Criteria andFavcountLessThan(Long value) {
            addCriterion("favcount <", value, "favcount");
            return (Criteria) this;
        }

        public Criteria andFavcountLessThanOrEqualTo(Long value) {
            addCriterion("favcount <=", value, "favcount");
            return (Criteria) this;
        }

        public Criteria andFavcountIn(List<Long> values) {
            addCriterion("favcount in", values, "favcount");
            return (Criteria) this;
        }

        public Criteria andFavcountNotIn(List<Long> values) {
            addCriterion("favcount not in", values, "favcount");
            return (Criteria) this;
        }

        public Criteria andFavcountBetween(Long value1, Long value2) {
            addCriterion("favcount between", value1, value2, "favcount");
            return (Criteria) this;
        }

        public Criteria andFavcountNotBetween(Long value1, Long value2) {
            addCriterion("favcount not between", value1, value2, "favcount");
            return (Criteria) this;
        }

        public Criteria andTmalldescurlIsNull() {
            addCriterion("tmallDescUrl is null");
            return (Criteria) this;
        }

        public Criteria andTmalldescurlIsNotNull() {
            addCriterion("tmallDescUrl is not null");
            return (Criteria) this;
        }

        public Criteria andTmalldescurlEqualTo(String value) {
            addCriterion("tmallDescUrl =", value, "tmalldescurl");
            return (Criteria) this;
        }

        public Criteria andTmalldescurlNotEqualTo(String value) {
            addCriterion("tmallDescUrl <>", value, "tmalldescurl");
            return (Criteria) this;
        }

        public Criteria andTmalldescurlGreaterThan(String value) {
            addCriterion("tmallDescUrl >", value, "tmalldescurl");
            return (Criteria) this;
        }

        public Criteria andTmalldescurlGreaterThanOrEqualTo(String value) {
            addCriterion("tmallDescUrl >=", value, "tmalldescurl");
            return (Criteria) this;
        }

        public Criteria andTmalldescurlLessThan(String value) {
            addCriterion("tmallDescUrl <", value, "tmalldescurl");
            return (Criteria) this;
        }

        public Criteria andTmalldescurlLessThanOrEqualTo(String value) {
            addCriterion("tmallDescUrl <=", value, "tmalldescurl");
            return (Criteria) this;
        }

        public Criteria andTmalldescurlLike(String value) {
            addCriterion("tmallDescUrl like", value, "tmalldescurl");
            return (Criteria) this;
        }

        public Criteria andTmalldescurlNotLike(String value) {
            addCriterion("tmallDescUrl not like", value, "tmalldescurl");
            return (Criteria) this;
        }

        public Criteria andTmalldescurlIn(List<String> values) {
            addCriterion("tmallDescUrl in", values, "tmalldescurl");
            return (Criteria) this;
        }

        public Criteria andTmalldescurlNotIn(List<String> values) {
            addCriterion("tmallDescUrl not in", values, "tmalldescurl");
            return (Criteria) this;
        }

        public Criteria andTmalldescurlBetween(String value1, String value2) {
            addCriterion("tmallDescUrl between", value1, value2, "tmalldescurl");
            return (Criteria) this;
        }

        public Criteria andTmalldescurlNotBetween(String value1, String value2) {
            addCriterion("tmallDescUrl not between", value1, value2, "tmalldescurl");
            return (Criteria) this;
        }

        public Criteria andExtdataIsNull() {
            addCriterion("extData is null");
            return (Criteria) this;
        }

        public Criteria andExtdataIsNotNull() {
            addCriterion("extData is not null");
            return (Criteria) this;
        }

        public Criteria andExtdataEqualTo(String value) {
            addCriterion("extData =", value, "extdata");
            return (Criteria) this;
        }

        public Criteria andExtdataNotEqualTo(String value) {
            addCriterion("extData <>", value, "extdata");
            return (Criteria) this;
        }

        public Criteria andExtdataGreaterThan(String value) {
            addCriterion("extData >", value, "extdata");
            return (Criteria) this;
        }

        public Criteria andExtdataGreaterThanOrEqualTo(String value) {
            addCriterion("extData >=", value, "extdata");
            return (Criteria) this;
        }

        public Criteria andExtdataLessThan(String value) {
            addCriterion("extData <", value, "extdata");
            return (Criteria) this;
        }

        public Criteria andExtdataLessThanOrEqualTo(String value) {
            addCriterion("extData <=", value, "extdata");
            return (Criteria) this;
        }

        public Criteria andExtdataLike(String value) {
            addCriterion("extData like", value, "extdata");
            return (Criteria) this;
        }

        public Criteria andExtdataNotLike(String value) {
            addCriterion("extData not like", value, "extdata");
            return (Criteria) this;
        }

        public Criteria andExtdataIn(List<String> values) {
            addCriterion("extData in", values, "extdata");
            return (Criteria) this;
        }

        public Criteria andExtdataNotIn(List<String> values) {
            addCriterion("extData not in", values, "extdata");
            return (Criteria) this;
        }

        public Criteria andExtdataBetween(String value1, String value2) {
            addCriterion("extData between", value1, value2, "extdata");
            return (Criteria) this;
        }

        public Criteria andExtdataNotBetween(String value1, String value2) {
            addCriterion("extData not between", value1, value2, "extdata");
            return (Criteria) this;
        }

        public Criteria andPropsIsNull() {
            addCriterion("props is null");
            return (Criteria) this;
        }

        public Criteria andPropsIsNotNull() {
            addCriterion("props is not null");
            return (Criteria) this;
        }

        public Criteria andPropsEqualTo(String value) {
            addCriterion("props =", value, "props");
            return (Criteria) this;
        }

        public Criteria andPropsNotEqualTo(String value) {
            addCriterion("props <>", value, "props");
            return (Criteria) this;
        }

        public Criteria andPropsGreaterThan(String value) {
            addCriterion("props >", value, "props");
            return (Criteria) this;
        }

        public Criteria andPropsGreaterThanOrEqualTo(String value) {
            addCriterion("props >=", value, "props");
            return (Criteria) this;
        }

        public Criteria andPropsLessThan(String value) {
            addCriterion("props <", value, "props");
            return (Criteria) this;
        }

        public Criteria andPropsLessThanOrEqualTo(String value) {
            addCriterion("props <=", value, "props");
            return (Criteria) this;
        }

        public Criteria andPropsLike(String value) {
            addCriterion("props like", value, "props");
            return (Criteria) this;
        }

        public Criteria andPropsNotLike(String value) {
            addCriterion("props not like", value, "props");
            return (Criteria) this;
        }

        public Criteria andPropsIn(List<String> values) {
            addCriterion("props in", values, "props");
            return (Criteria) this;
        }

        public Criteria andPropsNotIn(List<String> values) {
            addCriterion("props not in", values, "props");
            return (Criteria) this;
        }

        public Criteria andPropsBetween(String value1, String value2) {
            addCriterion("props between", value1, value2, "props");
            return (Criteria) this;
        }

        public Criteria andPropsNotBetween(String value1, String value2) {
            addCriterion("props not between", value1, value2, "props");
            return (Criteria) this;
        }

        public Criteria andTotalcommentcountIsNull() {
            addCriterion("totalCommentCount is null");
            return (Criteria) this;
        }

        public Criteria andTotalcommentcountIsNotNull() {
            addCriterion("totalCommentCount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcommentcountEqualTo(Long value) {
            addCriterion("totalCommentCount =", value, "totalcommentcount");
            return (Criteria) this;
        }

        public Criteria andTotalcommentcountNotEqualTo(Long value) {
            addCriterion("totalCommentCount <>", value, "totalcommentcount");
            return (Criteria) this;
        }

        public Criteria andTotalcommentcountGreaterThan(Long value) {
            addCriterion("totalCommentCount >", value, "totalcommentcount");
            return (Criteria) this;
        }

        public Criteria andTotalcommentcountGreaterThanOrEqualTo(Long value) {
            addCriterion("totalCommentCount >=", value, "totalcommentcount");
            return (Criteria) this;
        }

        public Criteria andTotalcommentcountLessThan(Long value) {
            addCriterion("totalCommentCount <", value, "totalcommentcount");
            return (Criteria) this;
        }

        public Criteria andTotalcommentcountLessThanOrEqualTo(Long value) {
            addCriterion("totalCommentCount <=", value, "totalcommentcount");
            return (Criteria) this;
        }

        public Criteria andTotalcommentcountIn(List<Long> values) {
            addCriterion("totalCommentCount in", values, "totalcommentcount");
            return (Criteria) this;
        }

        public Criteria andTotalcommentcountNotIn(List<Long> values) {
            addCriterion("totalCommentCount not in", values, "totalcommentcount");
            return (Criteria) this;
        }

        public Criteria andTotalcommentcountBetween(Long value1, Long value2) {
            addCriterion("totalCommentCount between", value1, value2, "totalcommentcount");
            return (Criteria) this;
        }

        public Criteria andTotalcommentcountNotBetween(Long value1, Long value2) {
            addCriterion("totalCommentCount not between", value1, value2, "totalcommentcount");
            return (Criteria) this;
        }

        public Criteria andMonthsellcountIsNull() {
            addCriterion("monthSellCount is null");
            return (Criteria) this;
        }

        public Criteria andMonthsellcountIsNotNull() {
            addCriterion("monthSellCount is not null");
            return (Criteria) this;
        }

        public Criteria andMonthsellcountEqualTo(Long value) {
            addCriterion("monthSellCount =", value, "monthsellcount");
            return (Criteria) this;
        }

        public Criteria andMonthsellcountNotEqualTo(Long value) {
            addCriterion("monthSellCount <>", value, "monthsellcount");
            return (Criteria) this;
        }

        public Criteria andMonthsellcountGreaterThan(Long value) {
            addCriterion("monthSellCount >", value, "monthsellcount");
            return (Criteria) this;
        }

        public Criteria andMonthsellcountGreaterThanOrEqualTo(Long value) {
            addCriterion("monthSellCount >=", value, "monthsellcount");
            return (Criteria) this;
        }

        public Criteria andMonthsellcountLessThan(Long value) {
            addCriterion("monthSellCount <", value, "monthsellcount");
            return (Criteria) this;
        }

        public Criteria andMonthsellcountLessThanOrEqualTo(Long value) {
            addCriterion("monthSellCount <=", value, "monthsellcount");
            return (Criteria) this;
        }

        public Criteria andMonthsellcountIn(List<Long> values) {
            addCriterion("monthSellCount in", values, "monthsellcount");
            return (Criteria) this;
        }

        public Criteria andMonthsellcountNotIn(List<Long> values) {
            addCriterion("monthSellCount not in", values, "monthsellcount");
            return (Criteria) this;
        }

        public Criteria andMonthsellcountBetween(Long value1, Long value2) {
            addCriterion("monthSellCount between", value1, value2, "monthsellcount");
            return (Criteria) this;
        }

        public Criteria andMonthsellcountNotBetween(Long value1, Long value2) {
            addCriterion("monthSellCount not between", value1, value2, "monthsellcount");
            return (Criteria) this;
        }

        public Criteria andFromsIsNull() {
            addCriterion("froms is null");
            return (Criteria) this;
        }

        public Criteria andFromsIsNotNull() {
            addCriterion("froms is not null");
            return (Criteria) this;
        }

        public Criteria andFromsEqualTo(String value) {
            addCriterion("froms =", value, "froms");
            return (Criteria) this;
        }

        public Criteria andFromsNotEqualTo(String value) {
            addCriterion("froms <>", value, "froms");
            return (Criteria) this;
        }

        public Criteria andFromsGreaterThan(String value) {
            addCriterion("froms >", value, "froms");
            return (Criteria) this;
        }

        public Criteria andFromsGreaterThanOrEqualTo(String value) {
            addCriterion("froms >=", value, "froms");
            return (Criteria) this;
        }

        public Criteria andFromsLessThan(String value) {
            addCriterion("froms <", value, "froms");
            return (Criteria) this;
        }

        public Criteria andFromsLessThanOrEqualTo(String value) {
            addCriterion("froms <=", value, "froms");
            return (Criteria) this;
        }

        public Criteria andFromsLike(String value) {
            addCriterion("froms like", value, "froms");
            return (Criteria) this;
        }

        public Criteria andFromsNotLike(String value) {
            addCriterion("froms not like", value, "froms");
            return (Criteria) this;
        }

        public Criteria andFromsIn(List<String> values) {
            addCriterion("froms in", values, "froms");
            return (Criteria) this;
        }

        public Criteria andFromsNotIn(List<String> values) {
            addCriterion("froms not in", values, "froms");
            return (Criteria) this;
        }

        public Criteria andFromsBetween(String value1, String value2) {
            addCriterion("froms between", value1, value2, "froms");
            return (Criteria) this;
        }

        public Criteria andFromsNotBetween(String value1, String value2) {
            addCriterion("froms not between", value1, value2, "froms");
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