package chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * packageName : chapter2
 * fileName : 피보나치_수열
 * author : taeil
 * date : 2024. 12. 19.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 19.        taeil                   최초생성
 */


/*
1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
* */
public class 피보나치_수열 {
    public static int[] solution(int n) {
        int[] arr = new int[n];
        arr[0]=1;
        arr[1]=1;
        for(int i=2; i<n; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int[] answer = solution(Integer.parseInt(n));
        for(int i=0; i<answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}