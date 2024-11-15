package chapter1;

import java.util.*;

/**
 * packageName : chapter1
 * fileName : Test
 * author : taeil
 * date : 2024. 11. 15.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 11. 15.        taeil                   최초생성
 */
public class Test {
    public static ArrayList<String> solution(String[] arr) {
        ArrayList<String> answer = new ArrayList<>();

        for(String x : arr) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] arr = new String[n];
        for(int i=0; i < n; i++) {
            String word = sc.next();
            arr[i] = word;
        }

        ArrayList<String> answer = solution(arr);
        for(String x : answer) {
            System.out.println(x);
        }
    }
}