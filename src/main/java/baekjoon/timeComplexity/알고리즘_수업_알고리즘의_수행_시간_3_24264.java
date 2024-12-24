package baekjoon.timeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName : baekjoon.timeComplexity
 * fileName : 알고리즘_수업_알고리즘의_수행_시간_3_24264
 * author : taeil
 * date : 2024. 12. 24.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 24.        taeil                   최초생성
 */
public class 알고리즘_수업_알고리즘의_수행_시간_3_24264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        System.out.println(n*n);
        System.out.println("2");
    }
}