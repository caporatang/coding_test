package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

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

        // 스트림 사용
        // ==========================================================
        Scanner sc = new Scanner(System.in);

        int n2 = sc.nextInt();
        double[] scores2 = new double[n2];

        for (int i = 0; i < n2; i++) {
            scores2[i] = sc.nextDouble();
        }

        double maxScore = Arrays.stream(scores2).max().orElse(1); // 최대값 계산 (기본값 1)
        double normalizedAverage = Arrays.stream(scores2)
                .map(score2 -> score2 / maxScore * 100)
                .average()
                .orElse(0); // 정규화 후 평균 계산

        System.out.println(normalizedAverage);


    }
}