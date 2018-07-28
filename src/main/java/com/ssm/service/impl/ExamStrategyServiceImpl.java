package com.ssm.service.impl;

import com.alibaba.fastjson.JSON;
import com.ssm.dto.DifficultyDto;
import com.ssm.dto.ExamStrategyDto;
import com.ssm.dto.QuestionDto;
import com.ssm.mapper.*;
import com.ssm.po.*;
import com.ssm.service.ExamStrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ExamStrategyServiceImpl implements ExamStrategyService{

    @Autowired
    private ExamTopicMapper examTopicMapper;

    @Autowired
    private ExamStrategyMapper examStrategyMapper;

    @Autowired
    private ExamTopicDetailMapper examTopicDetailMapper;

    @Autowired
    private ExamStrategyAndQuestionBankMapper strategyAndQuesBankMapper;

    @Autowired
    private QuestionBankMapper questionBankMapper;

    @Autowired
    private QuestionDtoMapper questionDtoMapper;

    @Override
    @Transactional
    public void updateExamStrategy(Integer strategyId, ExamStrategyDto examStrategyDto) {
        ExamStrategy examStrategy = new ExamStrategy();

        int totalCount = 0;
        int totalScore = 0;
        //获取试卷内容
        List<ExamTopic> examTopicList = examStrategyDto.getExamTopics();
        //获取题库
        List<QuestionBank> questionBanks = examStrategyDto.getQuestionBanks();
        //获取难度
        List<DifficultyDto> difficultySetting = examStrategyDto.getDifficultySetting();


        //处理大题
        //1.先删除已有的topic
        ExamTopicExample examTopicExample = new ExamTopicExample();
        examTopicExample.createCriteria().andStrategyIdEqualTo(strategyId);
        //这里先拿到所有topic，一边后面使用
        List<ExamTopic> topics = examTopicMapper.selectByExample(examTopicExample);

        //2.插入新的内容
        for(ExamTopic examTopic : examTopicList){
            List<ExamTopicDetail> examTopicDetails = examTopic.getExamTopicDetails();
            int count = 0;

            //根据strategyId获取所有的topic，删除原有的examTopicDetail
            for(ExamTopic examTopic1 : topics){
                ExamTopicDetailExample examTopicDetailExample = new ExamTopicDetailExample();
                examTopicDetailExample.createCriteria().andTopicIdEqualTo(examTopic1.getId());
                examTopicDetailMapper.deleteByExample(examTopicDetailExample);
                //先删除旧的topic
                examTopicMapper.deleteByPrimaryKey(examTopic1.getId());
            }

            //插入新的topic
            examTopic.setStrategyId(strategyId);
            examTopic.setQuestionCount((short)0);
            examTopic.setSortNumber(new Integer(0).byteValue());
            examTopicMapper.insertGetId(examTopic);
            int topicId = examTopic.getId();

            for(ExamTopicDetail examTopicDetail : examTopicDetails){
                int singleDetailCount = examTopicDetail.getQuestionCount();
                totalCount += singleDetailCount;
                count +=  singleDetailCount;
                totalScore += singleDetailCount * examTopic.getSingleScore();
                examTopicDetail.setTopicId(topicId);
                examTopicDetailMapper.insert(examTopicDetail);
            }
            //更新topic
            examTopic.setQuestionCount((short)count);
            examTopic.setId(topicId);
            examTopicMapper.updateByPrimaryKey(examTopic);

        }

        //处理题库

        ExamStrategyAndQuestionBankExample example = new ExamStrategyAndQuestionBankExample();
        example.createCriteria().andStrategyIdEqualTo(strategyId);
        strategyAndQuesBankMapper.deleteByExample(example);

        for(QuestionBank questionBank : questionBanks){
            ExamStrategyAndQuestionBank examStrategyAndQuestionBank = new ExamStrategyAndQuestionBank();
            examStrategyAndQuestionBank.setQuestionBankId(questionBank.getId());
            examStrategyAndQuestionBank.setStrategyId(strategyId);
            strategyAndQuesBankMapper.insert(examStrategyAndQuestionBank);
        }

        //更新策略的总分、总题数和及格分数
        examStrategy.setId(strategyId);
        examStrategy.setTotalScore((short) totalScore);
        examStrategy.setCutoffScore((short) examStrategyDto.getCutoffScore());
        examStrategy.setQuestionCount((short) totalCount);

        //设置难度,使用阿里的fastJson
        int totalPercent = 0;
        for(DifficultyDto difficultyDto : difficultySetting){
            totalPercent += difficultyDto.getPercent();
        }
        int noDifine = 100 - totalPercent;
        if(noDifine > 0){
            DifficultyDto difficultyDto =  new DifficultyDto();
            difficultyDto.setDifficulty(4);
            difficultyDto.setPercent(noDifine);
            difficultySetting.add(difficultyDto);
        }
        examStrategy.setDifficultySetting(JSON.toJSON(difficultySetting).toString());
        examStrategyMapper.updateByPrimaryKey(examStrategy);

    }


    @Override
    @Transactional
    public void addExamStrategy(ExamStrategyDto examStrategyDto) {
        ExamStrategy examStrategy = new ExamStrategy();

        int totalCount = 0;
        int totalScore = 0;
        //获取试卷内容
        List<ExamTopic> examTopicList = examStrategyDto.getExamTopics();
        //获取题库
        List<QuestionBank> questionBanks = examStrategyDto.getQuestionBanks();
        //获取难度
        List<DifficultyDto> difficultySetting = examStrategyDto.getDifficultySetting();

        //获取examStrateyId插入的id;todo 修改mapper
        examStrategy.setQuestionCount((short)0);
        examStrategy.setTotalScore((short)0);
        examStrategy.setDifficultySetting("");
        examStrategy.setCutoffScore((short)examStrategyDto.getCutoffScore());
        examStrategyMapper.insertGetId(examStrategy);
        int examStrategyId = examStrategy.getId();
        //处理大题
        for(ExamTopic examTopic : examTopicList){
            List<ExamTopicDetail> examTopicDetails = examTopic.getExamTopicDetails();
            int count = 0;
            examTopic.setStrategyId(examStrategyId);
            //todo 修改mapper
            examTopic.setQuestionCount((short)0);
            examTopic.setSortNumber(new Integer(0).byteValue());
            examTopicMapper.insertGetId(examTopic);
            int topicId = examTopic.getId();
            for(ExamTopicDetail examTopicDetail : examTopicDetails){
                int singleDetailCount = examTopicDetail.getQuestionCount();
                totalCount += singleDetailCount;
                count +=  singleDetailCount;
                totalScore += singleDetailCount * examTopic.getSingleScore();
                examTopicDetail.setTopicId(topicId);
                examTopicDetailMapper.insert(examTopicDetail);
            }
            examTopic.setQuestionCount((short)count);
            examTopic.setId(topicId);
            examTopicMapper.updateByPrimaryKey(examTopic);

        }

        //处理题库
        for(QuestionBank questionBank : questionBanks){
            ExamStrategyAndQuestionBank examStrategyAndQuestionBank = new ExamStrategyAndQuestionBank();
            examStrategyAndQuestionBank.setQuestionBankId(questionBank.getId());
            examStrategyAndQuestionBank.setStrategyId(examStrategyId);
            strategyAndQuesBankMapper.insert(examStrategyAndQuestionBank);
        }

        //更新策略的总分、总题数和及格分数
        examStrategy.setId(examStrategyId);
        examStrategy.setTotalScore((short) totalScore);
        examStrategy.setCutoffScore((short) examStrategyDto.getCutoffScore());
        examStrategy.setQuestionCount((short) totalCount);

        //设置难度,使用阿里的fastJson
        int totalPercent = 0;
        for(DifficultyDto difficultyDto : difficultySetting){
            totalPercent += difficultyDto.getPercent();
        }
        int noDifine = 100 - totalPercent;
        if(noDifine > 0){
           DifficultyDto difficultyDto =  new DifficultyDto();
           difficultyDto.setDifficulty(4);
           difficultyDto.setPercent(noDifine);
           difficultySetting.add(difficultyDto);
        }
        examStrategy.setDifficultySetting(JSON.toJSON(difficultySetting).toString());

        examStrategyMapper.updateByPrimaryKey(examStrategy);

    }

    @Override
    public ExamStrategyDto getExamStrategy(Integer strategyId) {
        //创建返回参数
        ExamStrategyDto examStrategyDto = new ExamStrategyDto();
        //获取策略
        ExamStrategy examStrategy = examStrategyMapper.selectByPrimaryKey(strategyId);
        examStrategyDto.setCutoffScore(examStrategy.getCutoffScore());
        examStrategyDto.setTotalScore(examStrategy.getTotalScore());
        examStrategyDto.setQuestionCount(examStrategy.getQuestionCount());

        //根据策略id获取主题
        ExamTopicExample examTopicExample = new ExamTopicExample();
        examTopicExample.createCriteria().andStrategyIdEqualTo(examStrategy.getId());
        List<ExamTopic> examTopics = examTopicMapper.selectByExample(examTopicExample);
        examStrategyDto.setExamTopics(examTopics);

        //根据主题获取detail
        for(ExamTopic examTopic : examTopics){
            ExamTopicDetailExample example = new ExamTopicDetailExample();
            example.createCriteria().andTopicIdEqualTo(examTopic.getId());
            List<ExamTopicDetail> examTopicDetails = examTopicDetailMapper.selectByExample(example);
            examTopic.setExamTopicDetails(examTopicDetails);
        }

        //获取题库
        ExamStrategyAndQuestionBankExample example = new ExamStrategyAndQuestionBankExample();
        example.createCriteria().andStrategyIdEqualTo(strategyId);
        //获取关系
        List<ExamStrategyAndQuestionBank> questionBanks = strategyAndQuesBankMapper.selectByExample(example);

        List<QuestionBank> questionBankList = new ArrayList<>(questionBanks.size());
        for(ExamStrategyAndQuestionBank strategyAndQueBank : questionBanks){
            //根据关系中的题库ID获取题库
            QuestionBank questionBank = questionBankMapper.selectByPrimaryKey(strategyAndQueBank.getQuestionBankId());
            questionBankList.add(questionBank);
        }
        examStrategyDto.setQuestionBanks(questionBankList);

        //将json串转换为对象
        examStrategyDto.setDifficultySetting((List<DifficultyDto>)JSON.parse(examStrategy.getDifficultySetting()));

        return examStrategyDto;
    }

    @Override
    public List<QuestionDto> getQuestion(Integer id, int type) {
        Map<String, Integer> map = new HashMap<>();
        map.put("id", id);
        map.put("type", type);
        return questionDtoMapper.getQuestionDtoList(map);
    }

}
