package com.ssm.mapper;

import com.ssm.po.ExamStrategyAndQuestionBank;
import com.ssm.po.ExamStrategyAndQuestionBankExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExamStrategyAndQuestionBankMapper {
    int countByExample(ExamStrategyAndQuestionBankExample example);

    int deleteByExample(ExamStrategyAndQuestionBankExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExamStrategyAndQuestionBank record);

    int insertSelective(ExamStrategyAndQuestionBank record);

    List<ExamStrategyAndQuestionBank> selectByExample(ExamStrategyAndQuestionBankExample example);

    ExamStrategyAndQuestionBank selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExamStrategyAndQuestionBank record, @Param("example") ExamStrategyAndQuestionBankExample example);

    int updateByExample(@Param("record") ExamStrategyAndQuestionBank record, @Param("example") ExamStrategyAndQuestionBankExample example);

    int updateByPrimaryKeySelective(ExamStrategyAndQuestionBank record);

    int updateByPrimaryKey(ExamStrategyAndQuestionBank record);
}