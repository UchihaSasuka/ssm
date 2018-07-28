package com.ssm.mapper;

import com.ssm.dto.QuestionDto;

import java.util.List;
import java.util.Map;

public interface QuestionDtoMapper {

    List<QuestionDto> getQuestionDtoList(Map<String, Integer> map);
}
