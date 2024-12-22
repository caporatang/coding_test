package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName : baekjoon
 * fileName : 바구니_뒤집기_10811
 * author : taeil
 * date : 2024. 12. 21.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 21.        taeil                   최초생성
 */
public class 바구니_뒤집기_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nM = br.readLine();
        String[] arr = nM.split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        int[] nArr = new int[n];
        for (int i=0; i<n; i++) {
            nArr[i]= i+1;
        }

        for (int i = 0; i < m; i++) {
            String rule = br.readLine();
            String[] ruleArr = rule.split(" ");
            int ruleN = Integer.parseInt(ruleArr[0]) - 1;
            int ruleM = Integer.parseInt(ruleArr[1]) - 1;

            while (ruleN < ruleM) {
                int temp = nArr[ruleN];
                nArr[ruleN] = nArr[ruleM];
                nArr[ruleM] = temp;
                ruleN++;
                ruleM--;
            }
        }
        br.close();
        for (int num : nArr) {
            System.out.print(num + " ");
        }
    }
}