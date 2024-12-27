package chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName : chapter2
 * fileName : 격자판_최대합
 * author : taeil
 * date : 2024. 12. 28.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 28.        taeil                   최초생성
 */
public class 격자판_최대합 {
    public static int solution(int n, int[][] arr) {
        int answer=Integer.MIN_VALUE;
        int sum1, sum2;

        // 행과 열의 최대값
        for (int i = 0; i <n; i++) {
            sum1=sum2=0;
            for (int j = 0; j <n; j++) {
                sum1+=arr[i][j]; // 행 번호 고정
                sum2+=arr[j][i]; // 열 번호 고정
            }
            answer=Math.max(answer, sum1);
            answer=Math.max(answer, sum2);
        }

        // 대각선 최대값 구하기
        sum1=sum2=0;
        for(int i=0; i<n; i++) {
            sum1+=arr[i][i];
            sum2+=arr[i][n-i-1];
        }
        answer=Math.max(answer, sum1);
        answer=Math.max(answer, sum2);

        return answer;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(line[j]);
            }
        }
        System.out.println(solution(n, arr));

    }
}