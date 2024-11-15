package chapter1;

import java.util.*;

/**
 * packageName : chapter1
 * fileName : 특정_문자_뒤집기
 * author : taeil
 * date : 2024. 11. 15.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 11. 15.        taeil                   최초생성
 */

/*
* 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고, 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
* */
public class 특정_문자_뒤집기 {
    public static String solution(String input) {
        String answer = "";

        char[] arr = input.toCharArray();
        int lt=0, rt=arr.length-1;

        while(lt < rt) {
            if(!Character.isAlphabetic(arr[lt])) lt++; // lt가 알파벳이 아니면 증가
            else if(!Character.isAlphabetic(arr[rt])) rt--; // rt가 알파벳이 아니면 감소
            else {
                // 둘 다 알파벳인 경우 swap
                char tmp=arr[lt];
                arr[lt] = arr[rt];
                arr[rt]=tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(arr);
        return answer;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(solution(input));
    }
}