package com.ssm.mapper;

import com.ssm.po.KnowledgeHierarchy;
import com.ssm.po.KnowledgeHierarchyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KnowledgeHierarchyMapper {
    int countByExample(KnowledgeHierarchyExample example);

    int deleteByExample(KnowledgeHierarchyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KnowledgeHierarchy record);

    int insertSelective(KnowledgeHierarchy record);

    List<KnowledgeHierarchy> selectByExample(KnowledgeHierarchyExample example);

    KnowledgeHierarchy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KnowledgeHierarchy record, @Param("example") KnowledgeHierarchyExample example);

    int updateByExample(@Param("record") KnowledgeHierarchy record, @Param("example") KnowledgeHierarchyExample example);

    int updateByPrimaryKeySelective(KnowledgeHierarchy record);

    int updateByPrimaryKey(KnowledgeHierarchy record);
}