package com.example.footballquiz;

public class Questions extends guessActivity implements Level {
    private String questions;
    private String answers;
    private String hint;
    private String endFact;

    public Questions(String questions, String answers) {
        this.questions = questions;
        this.answers = answers;
    }

    public Questions(String questions, String answers, String hint, String endFact) {
        this.questions = questions;
        this.answers = answers;
        this.hint = hint;
        this.endFact = endFact;
    }

    public String getQuestions() {
        return questions;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getEndFact() {
        return endFact;
    }

    public void setEndFact(String endFact) {
        this.endFact = endFact;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return questions;
    }
}
