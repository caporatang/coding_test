package baekjoon.advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * packageName : baekjoon.advanced1
 * fileName : 킹_퀸_룩_비숍_나이트_폰_3003
 * author : taeil
 * date : 2024. 12. 23.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 23.        taeil                   최초생성
 */
public class 킹_퀸_룩_비숍_나이트_폰_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] targetSet = {1, 1, 2, 2, 2, 8};
        int[] input = new int[6];

        for (int i = 0; i < 6; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append(targetSet[i] - input[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}