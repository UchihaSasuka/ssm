package com.ssm.po;

public class QuestionBank {
    private Integer id;

    private String name;

    private Short questionCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Short getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(Short questionCount) {
        this.questionCount = questionCount;
    }
}