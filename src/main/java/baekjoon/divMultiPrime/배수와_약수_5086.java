package baekjoon.divMultiPrime;

import java.io.*;
import java.util.*;

/**
 * packageName : baekjoon.divMultiPrime
 * fileName : 배수와_약수_5086
 * author : taeil
 * date : 2024. 12. 26.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 26.        taeil                   최초생성
 */
public class 배수와_약수_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            StringTokenizer st = new StringTokenizer(line, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0) break;

            if (b % a == 0) { // 약수
                sb.append("factor").append("\n");
            } else if (a % b == 0) { // 배수
                sb.append("multiple").append("\n");
            } else { // 아님
                sb.append("neither").append("\n");
            }
        }
        System.out.print(sb);
    }
}