package baekjoon.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * packageName : baekjoon.strings
 * fileName : 문자열_반복_2675
 * author : taeil
 * date : 2024. 12. 23.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 23.        taeil                   최초생성
 */
public class 문자열_반복_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i <t; i++) {
            String[] tc = br.readLine().split(" ");
            int n = Integer.parseInt(tc[0]);
            String[] str = tc[1].split("");

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j <str.length; j++) {
                for (int k = 0; k <n; k++) {
                    String target = str[j];
                    sb.append(target);
                }
            }
            System.out.println(sb);
        }
        br.close();
    }
}