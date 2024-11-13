package chapter1;

import java.util.*;

/**
 * packageName : chapter1
 * fileName : 대소문자_변환
 * author : taeil
 * date : 2024. 11. 12.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 11. 12.        taeil                   최초생성
 */

/*
* 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
*
* 아스키넘버
* 대문자 65 ~ 90
* 소문자 97 ~ 122
* 대문자 A : 65
* 소문자 a : 97
* 두 개의 차이가 32다. 기준점 x 를 잡고 +- 32를 하게되면 대소문자가 변경될 수 있다
* */
public class 대소문자_변환 {
    public static String solution(String input) {
        String answer = "";

        // toUpper, toLower 사용 풀이
        //for (char x : input.toCharArray()) {
        //    if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
        //    else answer += Character.toLowerCase(x);
        //}

        // 아스키넘버 풀이
        for(char x : input.toCharArray()) {
            if (x>=97 && x<=122) answer += (char) (x-32); // 97 ~ 122 범위에 있으면 소문자다.
            else answer+= (char) (x+32);
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();
        System.out.println(solution(input));
    }

}