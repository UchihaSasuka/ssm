package com.ssm.mapper;

import com.ssm.po.ExamTopic;
import com.ssm.po.ExamTopicExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExamTopicMapper {
    int countByExample(ExamTopicExample example);

    int deleteByExample(ExamTopicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExamTopic record);

    int insertGetId(ExamTopic record);

    int insertSelective(ExamTopic record);

    List<ExamTopic> selectByExample(ExamTopicExample example);

    ExamTopic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExamTopic record, @Param("example") ExamTopicExample example);

    int updateByExample(@Param("record") ExamTopic record, @Param("example") ExamTopicExample example);

    int updateByPrimaryKeySelective(ExamTopic record);

    int updateByPrimaryKey(ExamTopic record);
}