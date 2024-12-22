package baekjoon.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName : baekjoon.strings
 * fileName : 아스키_코드_11654
 * author : taeil
 * date : 2024. 12. 22.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 22.        taeil                   최초생성
 */
public class 아스키_코드_11654 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine();
        for(char x : target.toCharArray()) System.out.print((int) x);
    }
}