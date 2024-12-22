package baekjoon.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName : baekjoon.strings
 * fileName : 문자와_문자열_27866
 * author : taeil
 * date : 2024. 12. 22.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 22.        taeil                   최초생성
 */
public class 문자와_문자열_27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int i = Integer.parseInt(br.readLine());

        char[] charArr = s.toCharArray();
        char answer = charArr[i-1];
        System.out.println(answer);
    }
}