package com.ssm.po;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy.class)
public class ExamTopic {
    private Integer id;

    private Integer strategyId;

    private String name;

    private Byte questionType;

    private Short questionCount;

    private Short singleScore;

    private Byte sortNumber;

    private List<ExamTopicDetail> examTopicDetails;

    public List<ExamTopicDetail> getExamTopicDetails() {
        return examTopicDetails;
    }

    public void setExamTopicDetails(List<ExamTopicDetail> examTopicDetails) {
        this.examTopicDetails = examTopicDetails;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Integer strategyId) {
        this.strategyId = strategyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getQuestionType() {
        return questionType;
    }

    public void setQuestionType(Byte questionType) {
        this.questionType = questionType;
    }

    public Short getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(Short questionCount) {
        this.questionCount = questionCount;
    }

    public Short getSingleScore() {
        return singleScore;
    }

    public void setSingleScore(Short singleScore) {
        this.singleScore = singleScore;
    }

    public Byte getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(Byte sortNumber) {
        this.sortNumber = sortNumber;
    }
}