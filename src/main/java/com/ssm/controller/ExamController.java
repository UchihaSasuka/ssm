package com.ssm.controller;

import com.ssm.dto.ExamStrategyDto;
import com.ssm.dto.QuestionDto;
import com.ssm.service.ExamStrategyService;
import com.ssm.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ExamController {

    @Autowired
    private ExamStrategyService examStrategyService;

    @RequestMapping(value = "/exam_strategies", method = RequestMethod.POST)
    public @ResponseBody Result addExamStrategy(@RequestBody ExamStrategyDto examStrategyDto){
        //todo 各种参数判断因为时间关系就没做了，下面的接口也是
        try{
            examStrategyService.addExamStrategy(examStrategyDto);
            return new Result(examStrategyDto, "增添策略成功");
        }catch (Exception e){
            return new Result(null, "新增失败", 400);
        }

    }

    @RequestMapping(value = "/exam_strategies/{id}", method = RequestMethod.PUT)
    public @ResponseBody Result addExamStrategy(@PathVariable Integer id, @RequestBody ExamStrategyDto examStrategyDto){
        try {
            examStrategyService.updateExamStrategy(id, examStrategyDto);
            return new Result(examStrategyDto, "修改策略成功");
        }catch (Exception e){
            return new Result(null, "修改失败", 400);
        }
    }

    @RequestMapping(value = "/exam_strategies/{id}", method = RequestMethod.GET)
    public @ResponseBody Result getExamStrategy(@PathVariable Integer id){
        try{
            ExamStrategyDto examStrategyDto = examStrategyService.getExamStrategy(id);
            return new Result(examStrategyDto, "获取成功");
        }catch (Exception e){
            return new Result(null, "获取失败", 400);
        }

    }

    @RequestMapping(value = "/questionbanks/{id}/knowledges/questioncount", method = RequestMethod.GET)
    public @ResponseBody Result getQuestion(@PathVariable Integer id, HttpServletRequest request){
        String questionType =  request.getParameter("question_type");
        try{
            Integer quesType = Integer.parseInt(questionType);
            List<QuestionDto> questionDto = examStrategyService.getQuestion(id, quesType);
            return new Result(questionDto, "获取成功");
        }catch (NumberFormatException exception){
            return new Result(null, "参数不合法", 400);
        }


    }
}
