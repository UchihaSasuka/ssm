package com.ssm.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.ssm.po.ExamTopic;
import com.ssm.po.QuestionBank;

import java.util.List;


@JsonNaming(PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy.class)
public class ExamStrategyDto {

    private List<ExamTopic> examTopics;
    private List<QuestionBank> questionBanks;
    private List<DifficultyDto> difficultySetting;
    private int cutoffScore;
    private short questionCount;
    private short totalScore;

    public short getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(short questionCount) {
        this.questionCount = questionCount;
    }

    public short getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(short totalScore) {
        this.totalScore = totalScore;
    }

    public int getCutoffScore() {
        return cutoffScore;
    }

    public void setCutoffScore(int cutoffScore) {
        this.cutoffScore = cutoffScore;
    }

    public List<ExamTopic> getExamTopics() {
        return examTopics;
    }

    public void setExamTopics(List<ExamTopic> examTopics) {
        this.examTopics = examTopics;
    }

    public List<QuestionBank> getQuestionBanks() {
        return questionBanks;
    }

    public void setQuestionBanks(List<QuestionBank> questionBanks) {
        this.questionBanks = questionBanks;
    }

    public List<DifficultyDto> getDifficultySetting() {
        return difficultySetting;
    }

    public void setDifficultySetting(List<DifficultyDto> difficultySetting) {
        this.difficultySetting = difficultySetting;
    }
}
