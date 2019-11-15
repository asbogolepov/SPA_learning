package com.example.sweater.domain;

import javax.persistence.*;

@Entity
@Table(name = "questions")
public class Question {
    public Question() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String questionName;
    private String optionOne;
    private String optionTwo;
    private String optionThree;
    private String optionFour;
    private Long lectureId;
    private String rightAnswer;

    public Question(String questionName, String optionOne, String optionTwo, String optionThree, String optionFour, Long lectureId, String rightAnswer) {
        this.questionName = questionName;
        this.optionOne = optionOne;
        this.optionTwo = optionTwo;
        this.optionThree = optionThree;
        this.optionFour = optionFour;
        this.lectureId = lectureId;
        this.rightAnswer = rightAnswer;
    }

    public boolean compareAnswer( String selectedOption) {
        boolean isRight = false;
        if (rightAnswer.equals(selectedOption)) {
            isRight = true;
        }
        return isRight;
    }

    public Long getId() {
        return id;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public String getOptionOne() {
        return optionOne;
    }

    public void setOptionOne(String optionOne) {
        this.optionOne = optionOne;
    }

    public String getOptionTwo() {
        return optionTwo;
    }

    public void setOptionTwo(String optionTwo) {
        this.optionTwo = optionTwo;
    }

    public String getOptionThree() {
        return optionThree;
    }

    public void setOptionThree(String optionThree) {
        this.optionThree = optionThree;
    }

    public String getOptionFour() {
        return optionFour;
    }

    public void setOptionFour(String optionFour) {
        this.optionFour = optionFour;
    }

    public Long getLectureId() {
        return lectureId;
    }

    public void setLectureId(Long lectureId) {
        this.lectureId = lectureId;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

}
