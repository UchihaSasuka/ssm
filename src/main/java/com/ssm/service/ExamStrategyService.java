package com.ssm.service;

import com.ssm.dto.ExamStrategyDto;
import com.ssm.dto.QuestionDto;

import java.util.List;

public interface ExamStrategyService {

    /**
     * 新增策略
     * @param examStrategyDto
     */
    void addExamStrategy(ExamStrategyDto examStrategyDto);

    /**
     * 更新策略
     * @param strategyId
     * @param examStrategyDto
     */
    void updateExamStrategy(Integer strategyId, ExamStrategyDto examStrategyDto);

    /**
     * 获取策略
     * @param strategyId
     * @return
     */
    ExamStrategyDto getExamStrategy(Integer strategyId);

    /**
     * 获取问题
     * @param id
     * @return
     */
    List<QuestionDto> getQuestion(Integer id, int type);
}
