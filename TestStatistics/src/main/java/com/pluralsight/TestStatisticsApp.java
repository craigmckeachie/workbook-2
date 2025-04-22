package com.pluralsight;

import java.util.Arrays;

public class TestStatisticsApp {
    public static void main(String[] args) {
        int[] scores = {100, 97, 78, 87, 71, 63, 92};
        Arrays.sort(scores);

        double total = 0;
        for (int score: scores){
            System.out.println(score);
//          total = total + score;
            total += score;
        }

        int numberOfScores = scores.length;
        double average = total/numberOfScores;
        System.out.println("Average Score: " + average);

        int lowScore = scores[0];
        int highScore = scores[scores.length-1];

        System.out.println("Low Score: " + lowScore);
        System.out.println("High Score: " + highScore);


//        for (int i=0; i<scores.length; i++) {
//            int score = scores[i];
//            System.out.println(score);
//        }


    }

}
