package chapter1;

import java.util.*;

/**
 * packageName : chapter1
 * fileName : 문장_속_단어
 * author : taeil
 * date : 2024. 11. 12.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 11. 12.        taeil                   최초생성
 */

/*
* 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요. 문장속의 각 단어는 공백으로 구분됩니다.
* 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 한다.
* */
public class 문장_속_단어 {
    //public static String solution(String input) {
    //    String answer = "";
    //    String[] splitArray = input.split("\\s");
    //    for (String target : splitArray) {
    //        if (target.length() > answer.length()) answer = target;
    //    }
    //    return answer;
    //}

    // 알고리즘 활용 풀이
    //public static String solution(String str) {
    //    String answer="";
    //    int m = Integer.MIN_VALUE;
    //    String[] s=str.split(" ");
    //    for(String x : s) {
    //        int len = x.length();
    //        if (len>m) {
    //            m=len;
    //            answer=x;
    //        }
    //    }
    //    return answer;
    //}

    // indexOf, substring 활용
    public static String solution(String str) {
        String answer="";
        int pos = 0;
        int m = Integer.MIN_VALUE;

        // 띄어쓰기 발견 못하면 -1을 반환한다.
        while((pos=str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int len=tmp.length();
            if (len>m) {
                m=len;
                answer=tmp;
            }

            str= str.substring(pos+1);
        }
        if (str.length()>m) answer=str; // 마지막 단어 처리
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }

}