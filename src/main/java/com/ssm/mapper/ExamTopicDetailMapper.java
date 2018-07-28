package com.ssm.mapper;

import com.ssm.po.ExamTopicDetail;
import com.ssm.po.ExamTopicDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamTopicDetailMapper {
    int countByExample(ExamTopicDetailExample example);

    int deleteByExample(ExamTopicDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExamTopicDetail record);

    int insertSelective(ExamTopicDetail record);

    List<ExamTopicDetail> selectByExample(ExamTopicDetailExample example);

    ExamTopicDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExamTopicDetail record, @Param("example") ExamTopicDetailExample example);

    int updateByExample(@Param("record") ExamTopicDetail record, @Param("example") ExamTopicDetailExample example);

    int updateByPrimaryKeySelective(ExamTopicDetail record);

    int updateByPrimaryKey(ExamTopicDetail record);
}