package com.ssm.mapper;

import com.ssm.po.QuestionAndKnowledge;
import com.ssm.po.QuestionAndKnowledgeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestionAndKnowledgeMapper {
    int countByExample(QuestionAndKnowledgeExample example);

    int deleteByExample(QuestionAndKnowledgeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuestionAndKnowledge record);

    int insertSelective(QuestionAndKnowledge record);

    List<QuestionAndKnowledge> selectByExample(QuestionAndKnowledgeExample example);

    QuestionAndKnowledge selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuestionAndKnowledge record, @Param("example") QuestionAndKnowledgeExample example);

    int updateByExample(@Param("record") QuestionAndKnowledge record, @Param("example") QuestionAndKnowledgeExample example);

    int updateByPrimaryKeySelective(QuestionAndKnowledge record);

    int updateByPrimaryKey(QuestionAndKnowledge record);
}