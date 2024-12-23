package baekjoon.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName : baekjoon.strings
 * fileName : 상수_2980
 * author : taeil
 * date : 2024. 12. 23.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 23.        taeil                   최초생성
 */
public class 상수_2980 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();

        String A = new StringBuilder(st.nextToken()).reverse().toString();
        String B = new StringBuilder(st.nextToken()).reverse().toString();

        if(Integer.parseInt(A) > Integer.parseInt(B)) System.out.print(A);
        else System.out.print(B);
    }
}