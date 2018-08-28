package com.luffyxin.bean;

/**
 * Created by ${DX} on 2018/8/28.
 */
public class Question {
    private String classify;
    private String problem;
    private String answer;

    public Question(String classify, String problem, String answer) {
        this.classify = classify;
        this.problem = problem;
        this.answer = answer;
    }

    public Question() {
    }

    @Override
    public String toString() {
        return "Question{" +
                "classify='" + classify + '\'' +
                ", problem='" + problem + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
