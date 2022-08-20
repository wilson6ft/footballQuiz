package com.example.footballquiz;

public class WhoQuestions extends whoActivity{
    private String FirstHint;
    private String SecondHint;
    private String ThirdHint;
    private String answer;

    public WhoQuestions(String firstHint, String secondHint, String thirdHint, String answer) {
        FirstHint = firstHint;
        SecondHint = secondHint;
        ThirdHint = thirdHint;
        this.answer = answer;
    }

    public String getFirstHint() {
        return FirstHint;
    }

    public void setFirstHint(String firstHint) {
        FirstHint = firstHint;
    }

    public String getSecondHint() {
        return SecondHint;
    }

    public void setSecondHint(String secondHint) {
        SecondHint = secondHint;
    }

    public String getThirdHint() {
        return ThirdHint;
    }

    public void setThirdHint(String thirdHint) {
        ThirdHint = thirdHint;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "WhoQuestions{" +
                "FirstHint='" + FirstHint + '\'' +
                ", SecondHint='" + SecondHint + '\'' +
                ", ThirdHint='" + ThirdHint + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
