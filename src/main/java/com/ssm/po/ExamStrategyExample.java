package com.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class ExamStrategyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamStrategyExample() {
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

        public Criteria andQuestionCountIsNull() {
            addCriterion("question_count is null");
            return (Criteria) this;
        }

        public Criteria andQuestionCountIsNotNull() {
            addCriterion("question_count is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionCountEqualTo(Short value) {
            addCriterion("question_count =", value, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountNotEqualTo(Short value) {
            addCriterion("question_count <>", value, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountGreaterThan(Short value) {
            addCriterion("question_count >", value, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountGreaterThanOrEqualTo(Short value) {
            addCriterion("question_count >=", value, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountLessThan(Short value) {
            addCriterion("question_count <", value, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountLessThanOrEqualTo(Short value) {
            addCriterion("question_count <=", value, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountIn(List<Short> values) {
            addCriterion("question_count in", values, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountNotIn(List<Short> values) {
            addCriterion("question_count not in", values, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountBetween(Short value1, Short value2) {
            addCriterion("question_count between", value1, value2, "questionCount");
            return (Criteria) this;
        }

        public Criteria andQuestionCountNotBetween(Short value1, Short value2) {
            addCriterion("question_count not between", value1, value2, "questionCount");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNull() {
            addCriterion("total_score is null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNotNull() {
            addCriterion("total_score is not null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreEqualTo(Short value) {
            addCriterion("total_score =", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotEqualTo(Short value) {
            addCriterion("total_score <>", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThan(Short value) {
            addCriterion("total_score >", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThanOrEqualTo(Short value) {
            addCriterion("total_score >=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThan(Short value) {
            addCriterion("total_score <", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThanOrEqualTo(Short value) {
            addCriterion("total_score <=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIn(List<Short> values) {
            addCriterion("total_score in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotIn(List<Short> values) {
            addCriterion("total_score not in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreBetween(Short value1, Short value2) {
            addCriterion("total_score between", value1, value2, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotBetween(Short value1, Short value2) {
            addCriterion("total_score not between", value1, value2, "totalScore");
            return (Criteria) this;
        }

        public Criteria andCutoffScoreIsNull() {
            addCriterion("cutoff_score is null");
            return (Criteria) this;
        }

        public Criteria andCutoffScoreIsNotNull() {
            addCriterion("cutoff_score is not null");
            return (Criteria) this;
        }

        public Criteria andCutoffScoreEqualTo(Short value) {
            addCriterion("cutoff_score =", value, "cutoffScore");
            return (Criteria) this;
        }

        public Criteria andCutoffScoreNotEqualTo(Short value) {
            addCriterion("cutoff_score <>", value, "cutoffScore");
            return (Criteria) this;
        }

        public Criteria andCutoffScoreGreaterThan(Short value) {
            addCriterion("cutoff_score >", value, "cutoffScore");
            return (Criteria) this;
        }

        public Criteria andCutoffScoreGreaterThanOrEqualTo(Short value) {
            addCriterion("cutoff_score >=", value, "cutoffScore");
            return (Criteria) this;
        }

        public Criteria andCutoffScoreLessThan(Short value) {
            addCriterion("cutoff_score <", value, "cutoffScore");
            return (Criteria) this;
        }

        public Criteria andCutoffScoreLessThanOrEqualTo(Short value) {
            addCriterion("cutoff_score <=", value, "cutoffScore");
            return (Criteria) this;
        }

        public Criteria andCutoffScoreIn(List<Short> values) {
            addCriterion("cutoff_score in", values, "cutoffScore");
            return (Criteria) this;
        }

        public Criteria andCutoffScoreNotIn(List<Short> values) {
            addCriterion("cutoff_score not in", values, "cutoffScore");
            return (Criteria) this;
        }

        public Criteria andCutoffScoreBetween(Short value1, Short value2) {
            addCriterion("cutoff_score between", value1, value2, "cutoffScore");
            return (Criteria) this;
        }

        public Criteria andCutoffScoreNotBetween(Short value1, Short value2) {
            addCriterion("cutoff_score not between", value1, value2, "cutoffScore");
            return (Criteria) this;
        }

        public Criteria andDifficultySettingIsNull() {
            addCriterion("difficulty_setting is null");
            return (Criteria) this;
        }

        public Criteria andDifficultySettingIsNotNull() {
            addCriterion("difficulty_setting is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultySettingEqualTo(String value) {
            addCriterion("difficulty_setting =", value, "difficultySetting");
            return (Criteria) this;
        }

        public Criteria andDifficultySettingNotEqualTo(String value) {
            addCriterion("difficulty_setting <>", value, "difficultySetting");
            return (Criteria) this;
        }

        public Criteria andDifficultySettingGreaterThan(String value) {
            addCriterion("difficulty_setting >", value, "difficultySetting");
            return (Criteria) this;
        }

        public Criteria andDifficultySettingGreaterThanOrEqualTo(String value) {
            addCriterion("difficulty_setting >=", value, "difficultySetting");
            return (Criteria) this;
        }

        public Criteria andDifficultySettingLessThan(String value) {
            addCriterion("difficulty_setting <", value, "difficultySetting");
            return (Criteria) this;
        }

        public Criteria andDifficultySettingLessThanOrEqualTo(String value) {
            addCriterion("difficulty_setting <=", value, "difficultySetting");
            return (Criteria) this;
        }

        public Criteria andDifficultySettingLike(String value) {
            addCriterion("difficulty_setting like", value, "difficultySetting");
            return (Criteria) this;
        }

        public Criteria andDifficultySettingNotLike(String value) {
            addCriterion("difficulty_setting not like", value, "difficultySetting");
            return (Criteria) this;
        }

        public Criteria andDifficultySettingIn(List<String> values) {
            addCriterion("difficulty_setting in", values, "difficultySetting");
            return (Criteria) this;
        }

        public Criteria andDifficultySettingNotIn(List<String> values) {
            addCriterion("difficulty_setting not in", values, "difficultySetting");
            return (Criteria) this;
        }

        public Criteria andDifficultySettingBetween(String value1, String value2) {
            addCriterion("difficulty_setting between", value1, value2, "difficultySetting");
            return (Criteria) this;
        }

        public Criteria andDifficultySettingNotBetween(String value1, String value2) {
            addCriterion("difficulty_setting not between", value1, value2, "difficultySetting");
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