package t2;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] scores = new int[60];
        getScores(scores);
        //打印所有学生成绩
        printScores(scores);
        //排序
        Arrays.sort(scores);
        //不及格人数
        getScoreLow60(scores);
        //平均分
        getAverageScore(scores);
        //最高分
        System.out.println("最高分: " + scores[scores.length - 1]);
    }

    private static void getAverageScore(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double avg = sum * 1.0 / scores.length;
        System.out.printf("平均分: %4.2f",avg);
        System.out.println();
    }

    private static void getScoreLow60(int[] scores) {
        int count = 0;
        for (int score : scores) {
            if (score >= 60) {
                break;
            }
            count++;
        }
        System.out.println("及格人数: " + count);
    }


    private static void printScores(int[] scores) {
        System.out.println(Arrays.toString(scores));
    }

    private static void getScores(int[] scores) {
        Random r = new Random();
        for (int i = 0; i < scores.length; i++) {
            scores[i] = r.nextInt(71) + 30;
        }
    }
}
