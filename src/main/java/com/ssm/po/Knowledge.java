package com.ssm.po;

public class Knowledge {
    private Integer id;

    private Integer knowledgeHierarchyId;

    private String name;

    private Short sortNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKnowledgeHierarchyId() {
        return knowledgeHierarchyId;
    }

    public void setKnowledgeHierarchyId(Integer knowledgeHierarchyId) {
        this.knowledgeHierarchyId = knowledgeHierarchyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Short getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(Short sortNumber) {
        this.sortNumber = sortNumber;
    }
}