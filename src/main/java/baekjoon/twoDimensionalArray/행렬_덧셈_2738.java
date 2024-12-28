package baekjoon.twoDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName : baekjoon.twoDimensionalArray
 * fileName : 행렬_덧셈_2738
 * author : taeil
 * date : 2024. 12. 28.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 28.        taeil                   최초생성
 */
public class 행렬_덧셈_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        int[][] sum1 = new int[n][m];
        int[][] sum2 = new int[n][m];

        // 행렬A
        for (int i = 0; i <n; i++) {
            String[] data = br.readLine().split(" ");
            for (int j = 0; j <m; j++) {
                sum1[i][j] = Integer.parseInt(data[j]);
            }
        }

        // 행렬B
        for (int i = 0; i <n; i++) {
            String[] data = br.readLine().split(" ");
            for (int j = 0; j <n; j++) {
                sum2[i][j] = Integer.parseInt(data[j]);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(sum1[i][j] + sum2[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}