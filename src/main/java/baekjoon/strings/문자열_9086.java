package baekjoon.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName : baekjoon.strings
 * fileName : 문자열_9086
 * author : taeil
 * date : 2024. 12. 22.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 22.        taeil                   최초생성
 */
public class 문자열_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for(int i=0; i<tc; i++) {
            String target = br.readLine();

            char[] charArr = target.toCharArray();
            String strt=String.valueOf(charArr[0]);
            String end=String.valueOf(charArr[charArr.length-1]);

            StringBuilder sb=new StringBuilder();
            sb.append(strt).append(end);
            System.out.println(sb.toString());
        }
        br.close();
    }
}