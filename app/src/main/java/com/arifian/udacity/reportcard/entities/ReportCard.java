package com.arifian.udacity.reportcard.entities;

import java.io.Serializable;

/**
 * Created by faqih on 14/04/17.
 */

public class ReportCard implements Serializable {
    private final int WEIGHT_A = 4;
    private final int WEIGHT_B = 3;
    private final int WEIGHT_C = 2;
    private final int WEIGHT_D = 1;
    private final int WEIGHT_E = 0;

    // code sample is "MPK103A", score is "A", "B", "C", "D" or "E"
    String code, courseName, score;
    int sks;

    public ReportCard(String code, String courseName, int sks) {
        this.code = code;
        this.courseName = courseName;
        this.sks = sks;
    }

    public String getCode() {
        return code;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getScore() {
        return score;
    }

    public int getSks() {
        return sks;
    }

    public void setScore(String score) {
        this.score = score.toLowerCase();
    }

    public int getTotalScore(){
        int totalScore = 0;
        switch (this.score){
            case "a":
                totalScore = WEIGHT_A * this.sks;
                break;
            case "b":
                totalScore = WEIGHT_B * this.sks;
                break;
            case "c":
                totalScore = WEIGHT_C * this.sks;
                break;
            case "d":
                totalScore = WEIGHT_D * this.sks;
                break;
            case "e":
                totalScore = WEIGHT_E * this.sks;
                break;
        }
        return totalScore;
    }
}
