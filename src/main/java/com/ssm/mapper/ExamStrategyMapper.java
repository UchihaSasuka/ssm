package com.ssm.mapper;

import com.ssm.po.ExamStrategy;
import com.ssm.po.ExamStrategyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExamStrategyMapper {
    int countByExample(ExamStrategyExample example);

    int deleteByExample(ExamStrategyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExamStrategy record);

    int insertGetId(ExamStrategy record);

    int insertSelective(ExamStrategy record);

    List<ExamStrategy> selectByExample(ExamStrategyExample example);

    ExamStrategy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExamStrategy record, @Param("example") ExamStrategyExample example);

    int updateByExample(@Param("record") ExamStrategy record, @Param("example") ExamStrategyExample example);

    int updateByPrimaryKeySelective(ExamStrategy record);

    int updateByPrimaryKey(ExamStrategy record);
}