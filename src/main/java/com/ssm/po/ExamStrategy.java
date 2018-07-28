package com.ssm.po;

public class ExamStrategy {
    private Integer id;

    private Short questionCount;

    private Short totalScore;

    private Short cutoffScore;

    private String difficultySetting;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(Short questionCount) {
        this.questionCount = questionCount;
    }

    public Short getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Short totalScore) {
        this.totalScore = totalScore;
    }

    public Short getCutoffScore() {
        return cutoffScore;
    }

    public void setCutoffScore(Short cutoffScore) {
        this.cutoffScore = cutoffScore;
    }

    public String getDifficultySetting() {
        return difficultySetting;
    }

    public void setDifficultySetting(String difficultySetting) {
        this.difficultySetting = difficultySetting == null ? null : difficultySetting.trim();
    }
}