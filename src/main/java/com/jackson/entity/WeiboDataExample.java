package com.jackson.entity;

import java.util.ArrayList;
import java.util.List;

public class WeiboDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeiboDataExample() {
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

        public Criteria andContentidIsNull() {
            addCriterion("contentId is null");
            return (Criteria) this;
        }

        public Criteria andContentidIsNotNull() {
            addCriterion("contentId is not null");
            return (Criteria) this;
        }

        public Criteria andContentidEqualTo(String value) {
            addCriterion("contentId =", value, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidNotEqualTo(String value) {
            addCriterion("contentId <>", value, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidGreaterThan(String value) {
            addCriterion("contentId >", value, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidGreaterThanOrEqualTo(String value) {
            addCriterion("contentId >=", value, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidLessThan(String value) {
            addCriterion("contentId <", value, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidLessThanOrEqualTo(String value) {
            addCriterion("contentId <=", value, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidLike(String value) {
            addCriterion("contentId like", value, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidNotLike(String value) {
            addCriterion("contentId not like", value, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidIn(List<String> values) {
            addCriterion("contentId in", values, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidNotIn(List<String> values) {
            addCriterion("contentId not in", values, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidBetween(String value1, String value2) {
            addCriterion("contentId between", value1, value2, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentidNotBetween(String value1, String value2) {
            addCriterion("contentId not between", value1, value2, "contentid");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNull() {
            addCriterion("imgUrl is null");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNotNull() {
            addCriterion("imgUrl is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlEqualTo(String value) {
            addCriterion("imgUrl =", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotEqualTo(String value) {
            addCriterion("imgUrl <>", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThan(String value) {
            addCriterion("imgUrl >", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("imgUrl >=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThan(String value) {
            addCriterion("imgUrl <", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThanOrEqualTo(String value) {
            addCriterion("imgUrl <=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLike(String value) {
            addCriterion("imgUrl like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotLike(String value) {
            addCriterion("imgUrl not like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlIn(List<String> values) {
            addCriterion("imgUrl in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotIn(List<String> values) {
            addCriterion("imgUrl not in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlBetween(String value1, String value2) {
            addCriterion("imgUrl between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotBetween(String value1, String value2) {
            addCriterion("imgUrl not between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andZanIsNull() {
            addCriterion("zan is null");
            return (Criteria) this;
        }

        public Criteria andZanIsNotNull() {
            addCriterion("zan is not null");
            return (Criteria) this;
        }

        public Criteria andZanEqualTo(Integer value) {
            addCriterion("zan =", value, "zan");
            return (Criteria) this;
        }

        public Criteria andZanNotEqualTo(Integer value) {
            addCriterion("zan <>", value, "zan");
            return (Criteria) this;
        }

        public Criteria andZanGreaterThan(Integer value) {
            addCriterion("zan >", value, "zan");
            return (Criteria) this;
        }

        public Criteria andZanGreaterThanOrEqualTo(Integer value) {
            addCriterion("zan >=", value, "zan");
            return (Criteria) this;
        }

        public Criteria andZanLessThan(Integer value) {
            addCriterion("zan <", value, "zan");
            return (Criteria) this;
        }

        public Criteria andZanLessThanOrEqualTo(Integer value) {
            addCriterion("zan <=", value, "zan");
            return (Criteria) this;
        }

        public Criteria andZanIn(List<Integer> values) {
            addCriterion("zan in", values, "zan");
            return (Criteria) this;
        }

        public Criteria andZanNotIn(List<Integer> values) {
            addCriterion("zan not in", values, "zan");
            return (Criteria) this;
        }

        public Criteria andZanBetween(Integer value1, Integer value2) {
            addCriterion("zan between", value1, value2, "zan");
            return (Criteria) this;
        }

        public Criteria andZanNotBetween(Integer value1, Integer value2) {
            addCriterion("zan not between", value1, value2, "zan");
            return (Criteria) this;
        }

        public Criteria andZhuanfaIsNull() {
            addCriterion("zhuanFa is null");
            return (Criteria) this;
        }

        public Criteria andZhuanfaIsNotNull() {
            addCriterion("zhuanFa is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanfaEqualTo(Integer value) {
            addCriterion("zhuanFa =", value, "zhuanfa");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNotEqualTo(Integer value) {
            addCriterion("zhuanFa <>", value, "zhuanfa");
            return (Criteria) this;
        }

        public Criteria andZhuanfaGreaterThan(Integer value) {
            addCriterion("zhuanFa >", value, "zhuanfa");
            return (Criteria) this;
        }

        public Criteria andZhuanfaGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhuanFa >=", value, "zhuanfa");
            return (Criteria) this;
        }

        public Criteria andZhuanfaLessThan(Integer value) {
            addCriterion("zhuanFa <", value, "zhuanfa");
            return (Criteria) this;
        }

        public Criteria andZhuanfaLessThanOrEqualTo(Integer value) {
            addCriterion("zhuanFa <=", value, "zhuanfa");
            return (Criteria) this;
        }

        public Criteria andZhuanfaIn(List<Integer> values) {
            addCriterion("zhuanFa in", values, "zhuanfa");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNotIn(List<Integer> values) {
            addCriterion("zhuanFa not in", values, "zhuanfa");
            return (Criteria) this;
        }

        public Criteria andZhuanfaBetween(Integer value1, Integer value2) {
            addCriterion("zhuanFa between", value1, value2, "zhuanfa");
            return (Criteria) this;
        }

        public Criteria andZhuanfaNotBetween(Integer value1, Integer value2) {
            addCriterion("zhuanFa not between", value1, value2, "zhuanfa");
            return (Criteria) this;
        }

        public Criteria andPinglunIsNull() {
            addCriterion("pingLun is null");
            return (Criteria) this;
        }

        public Criteria andPinglunIsNotNull() {
            addCriterion("pingLun is not null");
            return (Criteria) this;
        }

        public Criteria andPinglunEqualTo(Integer value) {
            addCriterion("pingLun =", value, "pinglun");
            return (Criteria) this;
        }

        public Criteria andPinglunNotEqualTo(Integer value) {
            addCriterion("pingLun <>", value, "pinglun");
            return (Criteria) this;
        }

        public Criteria andPinglunGreaterThan(Integer value) {
            addCriterion("pingLun >", value, "pinglun");
            return (Criteria) this;
        }

        public Criteria andPinglunGreaterThanOrEqualTo(Integer value) {
            addCriterion("pingLun >=", value, "pinglun");
            return (Criteria) this;
        }

        public Criteria andPinglunLessThan(Integer value) {
            addCriterion("pingLun <", value, "pinglun");
            return (Criteria) this;
        }

        public Criteria andPinglunLessThanOrEqualTo(Integer value) {
            addCriterion("pingLun <=", value, "pinglun");
            return (Criteria) this;
        }

        public Criteria andPinglunIn(List<Integer> values) {
            addCriterion("pingLun in", values, "pinglun");
            return (Criteria) this;
        }

        public Criteria andPinglunNotIn(List<Integer> values) {
            addCriterion("pingLun not in", values, "pinglun");
            return (Criteria) this;
        }

        public Criteria andPinglunBetween(Integer value1, Integer value2) {
            addCriterion("pingLun between", value1, value2, "pinglun");
            return (Criteria) this;
        }

        public Criteria andPinglunNotBetween(Integer value1, Integer value2) {
            addCriterion("pingLun not between", value1, value2, "pinglun");
            return (Criteria) this;
        }

        public Criteria andWeibonameIsNull() {
            addCriterion("weiboName is null");
            return (Criteria) this;
        }

        public Criteria andWeibonameIsNotNull() {
            addCriterion("weiboName is not null");
            return (Criteria) this;
        }

        public Criteria andWeibonameEqualTo(String value) {
            addCriterion("weiboName =", value, "weiboname");
            return (Criteria) this;
        }

        public Criteria andWeibonameNotEqualTo(String value) {
            addCriterion("weiboName <>", value, "weiboname");
            return (Criteria) this;
        }

        public Criteria andWeibonameGreaterThan(String value) {
            addCriterion("weiboName >", value, "weiboname");
            return (Criteria) this;
        }

        public Criteria andWeibonameGreaterThanOrEqualTo(String value) {
            addCriterion("weiboName >=", value, "weiboname");
            return (Criteria) this;
        }

        public Criteria andWeibonameLessThan(String value) {
            addCriterion("weiboName <", value, "weiboname");
            return (Criteria) this;
        }

        public Criteria andWeibonameLessThanOrEqualTo(String value) {
            addCriterion("weiboName <=", value, "weiboname");
            return (Criteria) this;
        }

        public Criteria andWeibonameLike(String value) {
            addCriterion("weiboName like", value, "weiboname");
            return (Criteria) this;
        }

        public Criteria andWeibonameNotLike(String value) {
            addCriterion("weiboName not like", value, "weiboname");
            return (Criteria) this;
        }

        public Criteria andWeibonameIn(List<String> values) {
            addCriterion("weiboName in", values, "weiboname");
            return (Criteria) this;
        }

        public Criteria andWeibonameNotIn(List<String> values) {
            addCriterion("weiboName not in", values, "weiboname");
            return (Criteria) this;
        }

        public Criteria andWeibonameBetween(String value1, String value2) {
            addCriterion("weiboName between", value1, value2, "weiboname");
            return (Criteria) this;
        }

        public Criteria andWeibonameNotBetween(String value1, String value2) {
            addCriterion("weiboName not between", value1, value2, "weiboname");
            return (Criteria) this;
        }

        public Criteria andZoneIsNull() {
            addCriterion("zone is null");
            return (Criteria) this;
        }

        public Criteria andZoneIsNotNull() {
            addCriterion("zone is not null");
            return (Criteria) this;
        }

        public Criteria andZoneEqualTo(String value) {
            addCriterion("zone =", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotEqualTo(String value) {
            addCriterion("zone <>", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneGreaterThan(String value) {
            addCriterion("zone >", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneGreaterThanOrEqualTo(String value) {
            addCriterion("zone >=", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneLessThan(String value) {
            addCriterion("zone <", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneLessThanOrEqualTo(String value) {
            addCriterion("zone <=", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneLike(String value) {
            addCriterion("zone like", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotLike(String value) {
            addCriterion("zone not like", value, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneIn(List<String> values) {
            addCriterion("zone in", values, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotIn(List<String> values) {
            addCriterion("zone not in", values, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneBetween(String value1, String value2) {
            addCriterion("zone between", value1, value2, "zone");
            return (Criteria) this;
        }

        public Criteria andZoneNotBetween(String value1, String value2) {
            addCriterion("zone not between", value1, value2, "zone");
            return (Criteria) this;
        }

        public Criteria andIscheckIsNull() {
            addCriterion("isCheck is null");
            return (Criteria) this;
        }

        public Criteria andIscheckIsNotNull() {
            addCriterion("isCheck is not null");
            return (Criteria) this;
        }

        public Criteria andIscheckEqualTo(Boolean value) {
            addCriterion("isCheck =", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotEqualTo(Boolean value) {
            addCriterion("isCheck <>", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckGreaterThan(Boolean value) {
            addCriterion("isCheck >", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isCheck >=", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckLessThan(Boolean value) {
            addCriterion("isCheck <", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckLessThanOrEqualTo(Boolean value) {
            addCriterion("isCheck <=", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckIn(List<Boolean> values) {
            addCriterion("isCheck in", values, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotIn(List<Boolean> values) {
            addCriterion("isCheck not in", values, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckBetween(Boolean value1, Boolean value2) {
            addCriterion("isCheck between", value1, value2, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isCheck not between", value1, value2, "ischeck");
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