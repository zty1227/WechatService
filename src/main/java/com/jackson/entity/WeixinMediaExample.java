package com.jackson.entity;

import java.util.ArrayList;
import java.util.List;

public class WeixinMediaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeixinMediaExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTmpIsNull() {
            addCriterion("tmp is null");
            return (Criteria) this;
        }

        public Criteria andTmpIsNotNull() {
            addCriterion("tmp is not null");
            return (Criteria) this;
        }

        public Criteria andTmpEqualTo(String value) {
            addCriterion("tmp =", value, "tmp");
            return (Criteria) this;
        }

        public Criteria andTmpNotEqualTo(String value) {
            addCriterion("tmp <>", value, "tmp");
            return (Criteria) this;
        }

        public Criteria andTmpGreaterThan(String value) {
            addCriterion("tmp >", value, "tmp");
            return (Criteria) this;
        }

        public Criteria andTmpGreaterThanOrEqualTo(String value) {
            addCriterion("tmp >=", value, "tmp");
            return (Criteria) this;
        }

        public Criteria andTmpLessThan(String value) {
            addCriterion("tmp <", value, "tmp");
            return (Criteria) this;
        }

        public Criteria andTmpLessThanOrEqualTo(String value) {
            addCriterion("tmp <=", value, "tmp");
            return (Criteria) this;
        }

        public Criteria andTmpLike(String value) {
            addCriterion("tmp like", value, "tmp");
            return (Criteria) this;
        }

        public Criteria andTmpNotLike(String value) {
            addCriterion("tmp not like", value, "tmp");
            return (Criteria) this;
        }

        public Criteria andTmpIn(List<String> values) {
            addCriterion("tmp in", values, "tmp");
            return (Criteria) this;
        }

        public Criteria andTmpNotIn(List<String> values) {
            addCriterion("tmp not in", values, "tmp");
            return (Criteria) this;
        }

        public Criteria andTmpBetween(String value1, String value2) {
            addCriterion("tmp between", value1, value2, "tmp");
            return (Criteria) this;
        }

        public Criteria andTmpNotBetween(String value1, String value2) {
            addCriterion("tmp not between", value1, value2, "tmp");
            return (Criteria) this;
        }

        public Criteria andMediaidIsNull() {
            addCriterion("mediaId is null");
            return (Criteria) this;
        }

        public Criteria andMediaidIsNotNull() {
            addCriterion("mediaId is not null");
            return (Criteria) this;
        }

        public Criteria andMediaidEqualTo(String value) {
            addCriterion("mediaId =", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidNotEqualTo(String value) {
            addCriterion("mediaId <>", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidGreaterThan(String value) {
            addCriterion("mediaId >", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidGreaterThanOrEqualTo(String value) {
            addCriterion("mediaId >=", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidLessThan(String value) {
            addCriterion("mediaId <", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidLessThanOrEqualTo(String value) {
            addCriterion("mediaId <=", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidLike(String value) {
            addCriterion("mediaId like", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidNotLike(String value) {
            addCriterion("mediaId not like", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidIn(List<String> values) {
            addCriterion("mediaId in", values, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidNotIn(List<String> values) {
            addCriterion("mediaId not in", values, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidBetween(String value1, String value2) {
            addCriterion("mediaId between", value1, value2, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidNotBetween(String value1, String value2) {
            addCriterion("mediaId not between", value1, value2, "mediaid");
            return (Criteria) this;
        }

        public Criteria andSavepathIsNull() {
            addCriterion("savePath is null");
            return (Criteria) this;
        }

        public Criteria andSavepathIsNotNull() {
            addCriterion("savePath is not null");
            return (Criteria) this;
        }

        public Criteria andSavepathEqualTo(String value) {
            addCriterion("savePath =", value, "savepath");
            return (Criteria) this;
        }

        public Criteria andSavepathNotEqualTo(String value) {
            addCriterion("savePath <>", value, "savepath");
            return (Criteria) this;
        }

        public Criteria andSavepathGreaterThan(String value) {
            addCriterion("savePath >", value, "savepath");
            return (Criteria) this;
        }

        public Criteria andSavepathGreaterThanOrEqualTo(String value) {
            addCriterion("savePath >=", value, "savepath");
            return (Criteria) this;
        }

        public Criteria andSavepathLessThan(String value) {
            addCriterion("savePath <", value, "savepath");
            return (Criteria) this;
        }

        public Criteria andSavepathLessThanOrEqualTo(String value) {
            addCriterion("savePath <=", value, "savepath");
            return (Criteria) this;
        }

        public Criteria andSavepathLike(String value) {
            addCriterion("savePath like", value, "savepath");
            return (Criteria) this;
        }

        public Criteria andSavepathNotLike(String value) {
            addCriterion("savePath not like", value, "savepath");
            return (Criteria) this;
        }

        public Criteria andSavepathIn(List<String> values) {
            addCriterion("savePath in", values, "savepath");
            return (Criteria) this;
        }

        public Criteria andSavepathNotIn(List<String> values) {
            addCriterion("savePath not in", values, "savepath");
            return (Criteria) this;
        }

        public Criteria andSavepathBetween(String value1, String value2) {
            addCriterion("savePath between", value1, value2, "savepath");
            return (Criteria) this;
        }

        public Criteria andSavepathNotBetween(String value1, String value2) {
            addCriterion("savePath not between", value1, value2, "savepath");
            return (Criteria) this;
        }

        public Criteria andCreatatIsNull() {
            addCriterion("creatAt is null");
            return (Criteria) this;
        }

        public Criteria andCreatatIsNotNull() {
            addCriterion("creatAt is not null");
            return (Criteria) this;
        }

        public Criteria andCreatatEqualTo(Long value) {
            addCriterion("creatAt =", value, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatNotEqualTo(Long value) {
            addCriterion("creatAt <>", value, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatGreaterThan(Long value) {
            addCriterion("creatAt >", value, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatGreaterThanOrEqualTo(Long value) {
            addCriterion("creatAt >=", value, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatLessThan(Long value) {
            addCriterion("creatAt <", value, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatLessThanOrEqualTo(Long value) {
            addCriterion("creatAt <=", value, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatIn(List<Long> values) {
            addCriterion("creatAt in", values, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatNotIn(List<Long> values) {
            addCriterion("creatAt not in", values, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatBetween(Long value1, Long value2) {
            addCriterion("creatAt between", value1, value2, "creatat");
            return (Criteria) this;
        }

        public Criteria andCreatatNotBetween(Long value1, Long value2) {
            addCriterion("creatAt not between", value1, value2, "creatat");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openId is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openId is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openId =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openId <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openId >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openId >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openId <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openId <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openId like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openId not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openId in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openId not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openId between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openId not between", value1, value2, "openid");
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