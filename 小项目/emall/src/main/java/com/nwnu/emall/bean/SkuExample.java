package com.nwnu.emall.bean;

import java.util.ArrayList;
import java.util.List;

public class SkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SkuExample() {
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

        public Criteria andProppathIsNull() {
            addCriterion("propPath is null");
            return (Criteria) this;
        }

        public Criteria andProppathIsNotNull() {
            addCriterion("propPath is not null");
            return (Criteria) this;
        }

        public Criteria andProppathEqualTo(String value) {
            addCriterion("propPath =", value, "proppath");
            return (Criteria) this;
        }

        public Criteria andProppathNotEqualTo(String value) {
            addCriterion("propPath <>", value, "proppath");
            return (Criteria) this;
        }

        public Criteria andProppathGreaterThan(String value) {
            addCriterion("propPath >", value, "proppath");
            return (Criteria) this;
        }

        public Criteria andProppathGreaterThanOrEqualTo(String value) {
            addCriterion("propPath >=", value, "proppath");
            return (Criteria) this;
        }

        public Criteria andProppathLessThan(String value) {
            addCriterion("propPath <", value, "proppath");
            return (Criteria) this;
        }

        public Criteria andProppathLessThanOrEqualTo(String value) {
            addCriterion("propPath <=", value, "proppath");
            return (Criteria) this;
        }

        public Criteria andProppathLike(String value) {
            addCriterion("propPath like", value, "proppath");
            return (Criteria) this;
        }

        public Criteria andProppathNotLike(String value) {
            addCriterion("propPath not like", value, "proppath");
            return (Criteria) this;
        }

        public Criteria andProppathIn(List<String> values) {
            addCriterion("propPath in", values, "proppath");
            return (Criteria) this;
        }

        public Criteria andProppathNotIn(List<String> values) {
            addCriterion("propPath not in", values, "proppath");
            return (Criteria) this;
        }

        public Criteria andProppathBetween(String value1, String value2) {
            addCriterion("propPath between", value1, value2, "proppath");
            return (Criteria) this;
        }

        public Criteria andProppathNotBetween(String value1, String value2) {
            addCriterion("propPath not between", value1, value2, "proppath");
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

        public Criteria andPricemoneyIsNull() {
            addCriterion("priceMoney is null");
            return (Criteria) this;
        }

        public Criteria andPricemoneyIsNotNull() {
            addCriterion("priceMoney is not null");
            return (Criteria) this;
        }

        public Criteria andPricemoneyEqualTo(Long value) {
            addCriterion("priceMoney =", value, "pricemoney");
            return (Criteria) this;
        }

        public Criteria andPricemoneyNotEqualTo(Long value) {
            addCriterion("priceMoney <>", value, "pricemoney");
            return (Criteria) this;
        }

        public Criteria andPricemoneyGreaterThan(Long value) {
            addCriterion("priceMoney >", value, "pricemoney");
            return (Criteria) this;
        }

        public Criteria andPricemoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("priceMoney >=", value, "pricemoney");
            return (Criteria) this;
        }

        public Criteria andPricemoneyLessThan(Long value) {
            addCriterion("priceMoney <", value, "pricemoney");
            return (Criteria) this;
        }

        public Criteria andPricemoneyLessThanOrEqualTo(Long value) {
            addCriterion("priceMoney <=", value, "pricemoney");
            return (Criteria) this;
        }

        public Criteria andPricemoneyIn(List<Long> values) {
            addCriterion("priceMoney in", values, "pricemoney");
            return (Criteria) this;
        }

        public Criteria andPricemoneyNotIn(List<Long> values) {
            addCriterion("priceMoney not in", values, "pricemoney");
            return (Criteria) this;
        }

        public Criteria andPricemoneyBetween(Long value1, Long value2) {
            addCriterion("priceMoney between", value1, value2, "pricemoney");
            return (Criteria) this;
        }

        public Criteria andPricemoneyNotBetween(Long value1, Long value2) {
            addCriterion("priceMoney not between", value1, value2, "pricemoney");
            return (Criteria) this;
        }

        public Criteria andPricetextIsNull() {
            addCriterion("priceText is null");
            return (Criteria) this;
        }

        public Criteria andPricetextIsNotNull() {
            addCriterion("priceText is not null");
            return (Criteria) this;
        }

        public Criteria andPricetextEqualTo(String value) {
            addCriterion("priceText =", value, "pricetext");
            return (Criteria) this;
        }

        public Criteria andPricetextNotEqualTo(String value) {
            addCriterion("priceText <>", value, "pricetext");
            return (Criteria) this;
        }

        public Criteria andPricetextGreaterThan(String value) {
            addCriterion("priceText >", value, "pricetext");
            return (Criteria) this;
        }

        public Criteria andPricetextGreaterThanOrEqualTo(String value) {
            addCriterion("priceText >=", value, "pricetext");
            return (Criteria) this;
        }

        public Criteria andPricetextLessThan(String value) {
            addCriterion("priceText <", value, "pricetext");
            return (Criteria) this;
        }

        public Criteria andPricetextLessThanOrEqualTo(String value) {
            addCriterion("priceText <=", value, "pricetext");
            return (Criteria) this;
        }

        public Criteria andPricetextLike(String value) {
            addCriterion("priceText like", value, "pricetext");
            return (Criteria) this;
        }

        public Criteria andPricetextNotLike(String value) {
            addCriterion("priceText not like", value, "pricetext");
            return (Criteria) this;
        }

        public Criteria andPricetextIn(List<String> values) {
            addCriterion("priceText in", values, "pricetext");
            return (Criteria) this;
        }

        public Criteria andPricetextNotIn(List<String> values) {
            addCriterion("priceText not in", values, "pricetext");
            return (Criteria) this;
        }

        public Criteria andPricetextBetween(String value1, String value2) {
            addCriterion("priceText between", value1, value2, "pricetext");
            return (Criteria) this;
        }

        public Criteria andPricetextNotBetween(String value1, String value2) {
            addCriterion("priceText not between", value1, value2, "pricetext");
            return (Criteria) this;
        }

        public Criteria andGoodsitemidIsNull() {
            addCriterion("goodsItemId is null");
            return (Criteria) this;
        }

        public Criteria andGoodsitemidIsNotNull() {
            addCriterion("goodsItemId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsitemidEqualTo(Long value) {
            addCriterion("goodsItemId =", value, "goodsitemid");
            return (Criteria) this;
        }

        public Criteria andGoodsitemidNotEqualTo(Long value) {
            addCriterion("goodsItemId <>", value, "goodsitemid");
            return (Criteria) this;
        }

        public Criteria andGoodsitemidGreaterThan(Long value) {
            addCriterion("goodsItemId >", value, "goodsitemid");
            return (Criteria) this;
        }

        public Criteria andGoodsitemidGreaterThanOrEqualTo(Long value) {
            addCriterion("goodsItemId >=", value, "goodsitemid");
            return (Criteria) this;
        }

        public Criteria andGoodsitemidLessThan(Long value) {
            addCriterion("goodsItemId <", value, "goodsitemid");
            return (Criteria) this;
        }

        public Criteria andGoodsitemidLessThanOrEqualTo(Long value) {
            addCriterion("goodsItemId <=", value, "goodsitemid");
            return (Criteria) this;
        }

        public Criteria andGoodsitemidIn(List<Long> values) {
            addCriterion("goodsItemId in", values, "goodsitemid");
            return (Criteria) this;
        }

        public Criteria andGoodsitemidNotIn(List<Long> values) {
            addCriterion("goodsItemId not in", values, "goodsitemid");
            return (Criteria) this;
        }

        public Criteria andGoodsitemidBetween(Long value1, Long value2) {
            addCriterion("goodsItemId between", value1, value2, "goodsitemid");
            return (Criteria) this;
        }

        public Criteria andGoodsitemidNotBetween(Long value1, Long value2) {
            addCriterion("goodsItemId not between", value1, value2, "goodsitemid");
            return (Criteria) this;
        }

        public Criteria andPropvaluesjsonIsNull() {
            addCriterion("propValuesJson is null");
            return (Criteria) this;
        }

        public Criteria andPropvaluesjsonIsNotNull() {
            addCriterion("propValuesJson is not null");
            return (Criteria) this;
        }

        public Criteria andPropvaluesjsonEqualTo(String value) {
            addCriterion("propValuesJson =", value, "propvaluesjson");
            return (Criteria) this;
        }

        public Criteria andPropvaluesjsonNotEqualTo(String value) {
            addCriterion("propValuesJson <>", value, "propvaluesjson");
            return (Criteria) this;
        }

        public Criteria andPropvaluesjsonGreaterThan(String value) {
            addCriterion("propValuesJson >", value, "propvaluesjson");
            return (Criteria) this;
        }

        public Criteria andPropvaluesjsonGreaterThanOrEqualTo(String value) {
            addCriterion("propValuesJson >=", value, "propvaluesjson");
            return (Criteria) this;
        }

        public Criteria andPropvaluesjsonLessThan(String value) {
            addCriterion("propValuesJson <", value, "propvaluesjson");
            return (Criteria) this;
        }

        public Criteria andPropvaluesjsonLessThanOrEqualTo(String value) {
            addCriterion("propValuesJson <=", value, "propvaluesjson");
            return (Criteria) this;
        }

        public Criteria andPropvaluesjsonLike(String value) {
            addCriterion("propValuesJson like", value, "propvaluesjson");
            return (Criteria) this;
        }

        public Criteria andPropvaluesjsonNotLike(String value) {
            addCriterion("propValuesJson not like", value, "propvaluesjson");
            return (Criteria) this;
        }

        public Criteria andPropvaluesjsonIn(List<String> values) {
            addCriterion("propValuesJson in", values, "propvaluesjson");
            return (Criteria) this;
        }

        public Criteria andPropvaluesjsonNotIn(List<String> values) {
            addCriterion("propValuesJson not in", values, "propvaluesjson");
            return (Criteria) this;
        }

        public Criteria andPropvaluesjsonBetween(String value1, String value2) {
            addCriterion("propValuesJson between", value1, value2, "propvaluesjson");
            return (Criteria) this;
        }

        public Criteria andPropvaluesjsonNotBetween(String value1, String value2) {
            addCriterion("propValuesJson not between", value1, value2, "propvaluesjson");
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