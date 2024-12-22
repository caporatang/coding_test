package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * packageName : baekjoon
 * fileName : 평균_1546
 * author : taeil
 * date : 2024. 12. 22.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 22.        taeil                   최초생성
 */
public class 평균_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] scores = br.readLine().split(" ");
        double[] score = new double[n];
        for (int i = 0; i <scores.length; i++) {
            score[i] = Integer.parseInt(scores[i]);
        }

        double answer=0;
        double max = Arrays.stream(score).max().getAsDouble();
        for (int i = 0; i <score.length; i++) {
            answer += score[i]/max*100;
        }
        double result = answer/n;
        System.out.println(result);
    }
}