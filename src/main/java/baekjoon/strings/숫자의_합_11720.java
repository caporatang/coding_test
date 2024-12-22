package baekjoon.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName : baekjoon.strings
 * fileName : 숫자읩_합_11720
 * author : taeil
 * date : 2024. 12. 22.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 22.        taeil                   최초생성
 */
public class 숫자의_합_11720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] target = br.readLine().split("");
        int answer=0;
        for (int i = 0; i <n; i++) {
            answer += Integer.parseInt(target[i]);
        }
        System.out.println(answer);
    }
}