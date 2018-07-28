package com.ssm.test;

import com.alibaba.fastjson.JSON;
import com.ssm.controller.ExamController;
import com.ssm.dto.ExamStrategyDto;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wiseacre on 2018/7/25.
 */
public class MybatisTest extends BaseTest{

    @Autowired
    private ExamController examController;

    @Test
    public void updateExamStartegy(){
        //todo这里就没有写了，主要用的还是postman进行的测试
        String json = "";
        Integer id = 1;
        ExamStrategyDto examStrategyDto = (ExamStrategyDto) JSON.parse(json);
        examController.addExamStrategy(id, examStrategyDto);
    }


}
