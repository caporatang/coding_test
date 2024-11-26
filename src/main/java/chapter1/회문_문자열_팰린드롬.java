package chapter1;

import java.util.Scanner;

/**
 * packageName : chapter1
 * fileName : 회문_문자열
 * author : taeil
 * date : 2024. 11. 26.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 11. 26.        taeil                   최초생성
 */

/*
* 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
* 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
*/
public class 회문_문자열_팰린드롬 {
    // 내 풀이
    public static String solution(String input) {
        String answer = "NO";
        String tmp = new StringBuilder(input).reverse().toString();
        if (input.equalsIgnoreCase(tmp)) answer = "YES";
        return answer;
    }

    // 팰린드롬 사용
    // 주어진 input의 길이가 짝수인 경우,  2로 나눈 몫의 전까지만 For문의 조건을 걸어서 풀어내면된다.
    // 홀수인 경우 가운데 글자가 하나만 남을때까지 풀어내면 된다.
    public static String palindrome(String input) {
        String answer = "YES";
        input = input.toUpperCase();
        int len = input.length();
        for (int i = 0; i<len/2; i++) {
            if(input.charAt(i) != input.charAt(len-1-i)) return "NO";
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println("solution is : " + solution(input));
        System.out.println("palindrome is : " + palindrome(input));
    }

}