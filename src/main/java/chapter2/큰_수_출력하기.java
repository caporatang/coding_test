package chapter2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * packageName : chapter2
 * fileName : 큰_수_출력하기
 * author : taeil
 * date : 2024. 12. 3.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 3.        taeil                   최초생성
 */

/*
* N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요. (첫 번째 수는 무조건 출력한다)
* */
public class 큰_수_출력하기 {

    public static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);

        for (int i = 1; i <n; i++) {
            if (arr[i] > arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int x : solution(n, arr)) {
            System.out.print(x+" ");
        }
    }
}