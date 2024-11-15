package chapter1;

import java.util.*;

/**
 * packageName : chapter1
 * fileName : 중복_문자_제거
 * author : taeil
 * date : 2024. 11. 15.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 11. 15.        taeil                   최초생성
 */
public class 중복_문자_제거 {
    public static String solution(String input) {
        String answer = "";
        for(int i=0; i<input.length(); i++) {

            // 이게 true면 중복이 아닌거다
            if (input.indexOf(input.charAt(i))==i) answer += input.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();


        System.out.println(solution(input));
    }
}