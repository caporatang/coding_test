package baekjoon.advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName : baekjoon.advanced1
 * fileName : 팰린드롬인지_확인하기
 * author : taeil
 * date : 2024. 12. 23.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 23.        taeil                   최초생성
 */
public class 팰린드롬인지_확인하기_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String reverse = new StringBuilder(str).reverse().toString();
        if(str.equals(reverse)){
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}