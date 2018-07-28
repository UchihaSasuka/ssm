package com.ssm.mapper;

import com.ssm.po.QuestionBankAndQuestion;
import com.ssm.po.QuestionBankAndQuestionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestionBankAndQuestionMapper {
    int countByExample(QuestionBankAndQuestionExample example);

    int deleteByExample(QuestionBankAndQuestionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuestionBankAndQuestion record);

    int insertSelective(QuestionBankAndQuestion record);

    List<QuestionBankAndQuestion> selectByExample(QuestionBankAndQuestionExample example);

    QuestionBankAndQuestion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuestionBankAndQuestion record, @Param("example") QuestionBankAndQuestionExample example);

    int updateByExample(@Param("record") QuestionBankAndQuestion record, @Param("example") QuestionBankAndQuestionExample example);

    int updateByPrimaryKeySelective(QuestionBankAndQuestion record);

    int updateByPrimaryKey(QuestionBankAndQuestion record);
}