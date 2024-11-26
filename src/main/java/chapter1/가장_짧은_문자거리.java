package chapter1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * packageName : chapter1
 * fileName : 가장_짧은_문자거리
 * author : taeil
 * date : 2024. 11. 26.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 11. 26.        taeil                   최초생성
 */


/*
* 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요
* teachermode e
* 1 0 1 2 1 0 1 2 2 1 0
* */
public class 가장_짧은_문자거리 {

    public static int[] solution(String s, char c) {
        int[] answer = new int[s.length()];
        int p = 1000;

        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i) == c) {
                p=0;
                answer[i]=p;
            }
            else {
                p++;
                answer[i]=p;
            }
        }
        p=1000;
        for (int i = s.length()-1; i>=0; i--) {
            if (s.charAt(i) == c) p=0;
            else {
                p++;
                answer[i]=Math.min(answer[i],p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        for(int x : solution(s, c)) {
            System.out.print(x+ " ");
        }

    }
}