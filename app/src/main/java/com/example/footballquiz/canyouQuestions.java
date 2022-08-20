package com.example.footballquiz;

public class canyouQuestions {
    private String question;
    private String[] answer;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer(int i) {
        return answer[i];
    }

    public void setAnswer(String[] answer) {
        this.answer = answer;
    }

    public canyouQuestions(String question, String[] answer) {
        this.question = question;
        this.answer = answer;
    }
}
