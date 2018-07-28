package com.ssm.dto;

import java.util.List;

public class QuestionDto {
    private Integer id;
    private String name;
    private List<QuestionKnowledge> knowledges;

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
        this.name = name;
    }

    public List<QuestionKnowledge> getKnowledges() {
        return knowledges;
    }

    public void setKnowledges(List<QuestionKnowledge> knowledges) {
        this.knowledges = knowledges;
    }
}
