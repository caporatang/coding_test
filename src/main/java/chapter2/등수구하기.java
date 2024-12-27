package chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName : chapter2
 * fileName : 등수구하기
 * author : taeil
 * date : 2024. 12. 28.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 28.        taeil                   최초생성
 */
public class 등수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int[] score = new int[n];
        for (int i = 0; i <n; i++) {
            score[i] = Integer.parseInt(str[i]);
        }

        int[] answer = new int[n];
        for (int i = 0; i <n; i++) {
            int grade=1;
            for (int j = 0; j <n; j++) {
                if(score[j] > score[i]) {
                    grade++;
                }
            }
            answer[i] = grade;
        }
        for (int x : answer) System.out.print(x + " ");

    }
}