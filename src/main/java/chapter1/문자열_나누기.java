package chapter1;

import java.util.Scanner;

/**
 * packageName : chapter1
 * fileName : 문자열_나누기
 * author : taeil
 * date : 2024. 11. 12.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 11. 12.        taeil                   최초생성
 */


/*
* 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
* 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
* */
public class 문자열_나누기 {
    public static int solution(String str, char c ) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        //for(int i = 0; i < str.length(); i++) {
        //    if (str.charAt(i) == c) answer++;
        //}

        for (char x : str.toCharArray()) {
            if (x == c) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.next().charAt(0);

        System.out.println(solution(str, c));
    }
}