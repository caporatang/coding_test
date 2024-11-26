package chapter1;

import java.util.Scanner;

/**
 * packageName : chapter1
 * fileName : 숫자만_추출하기
 * author : taeil
 * date : 2024. 11. 26.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 11. 26.        taeil                   최초생성
 */

/*
* 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
* 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
* 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
*/
public class 숫자만_추출하기 {
    // 내 풀이
    public static int solution(String input) {
        input = input.replaceAll("[^0-9]", "");
        return Integer.parseInt(input);
    }

    // 다른 사람 풀이 = 아스키넘버 활용하기
    // char는 기본적으로 정수형이니까..
    // '0' = 48
    // '9' = 57
    public static int charSolution(String s) {
        int answer = 0;
        for (char x : s.toCharArray()) {
            if (x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
        }
        return answer;
    }

    public static int digitSolution(String s) {
        String answer = "";
        for (char x : s.toCharArray()) {
            // 숫자인지 아닌지 판단하기
            if (Character.isDigit(x)) answer +=x;
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // System.out.println(digitSolution(input));
        // System.out.println(charSolution(input));
        System.out.println(solution(input));
    }
}