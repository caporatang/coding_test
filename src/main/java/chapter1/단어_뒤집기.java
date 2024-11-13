package chapter1;

import java.util.*;

/**
 * packageName : chapter1
 * fileName : 단어_뒤집기
 * author : taeil
 * date : 2024. 11. 13.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 11. 13.        taeil                   최초생성
 */


/*
* N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요
* */
public class 단어_뒤집기 {
    public static ArrayList<String> solution(String[] inputArray) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : inputArray) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] inputArray = new String[n];
        for (int i =0; i < n; i++) {
            String word = sc.next();
            inputArray[i] = word;
        }
        ArrayList<String> answer = solution(inputArray);
        for(int i=0; i < inputArray.length; i++) {
            System.out.println(answer.get(i));
        }
    }
}

class 특정_문자열만_찾아서_뒤집기 {
    public static ArrayList<String> targetSolution(String[] inputArray) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : inputArray) {
            char[] s=x.toCharArray();
            int lt = 0, rt=x.length()-1;

            while(lt<rt) {
                char tmp=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
            String tmp=String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] inputArray = new String[n];
        for (int i =0; i < n; i++) {
            String word = sc.next();
            inputArray[i] = word;
        }
        ArrayList<String> answer = targetSolution(inputArray);
        for(int i=0; i < inputArray.length; i++) {
            System.out.println(answer.get(i));
        }
    }

}