package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a score between 0-100");
        Double score = HomeWorkUtils.GetConsoleInput(Double.class);
        if(score > -1) {
            System.out.println(score + " = " + GetLetterGrade(score));
        }
    }


    private static char GetLetterGrade(double score) {
        if(score >= 90) {
            return 'A';
        }
        else if(score >= 80 && score <= 89) {
            return 'B';
        }
        else if(score >= 70 && score <= 79) {
            return 'C';
        }
        else if(score >= 65 && score <= 69) {
            return 'D';
        }
        else if(score <= 65) {
            return 'F';
        }
        return ' ';
    }
}
