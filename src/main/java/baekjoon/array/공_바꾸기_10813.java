package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * packageName : baekjoon.array
 * fileName : 공_바꾸기_10813
 * author : taeil
 * date : 2024. 12. 22.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 22.        taeil                   최초생성
 */
public class 공_바꾸기_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nM = br.readLine().split(" ");

        int n = Integer.parseInt(nM[0]);
        int m = Integer.parseInt(nM[1]);

        int[] basket = new int[n];
        for (int i = 0; i < n; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            String[] target = br.readLine().split(" ");
            int target1 = Integer.parseInt(target[0]) - 1;
            int target2 = Integer.parseInt(target[1]) - 1;

            int temp = basket[target1];
            basket[target1] = basket[target2];
            basket[target2] = temp;
        }

        for (int ball : basket) {
            System.out.print(ball + " ");
        }
    }
}