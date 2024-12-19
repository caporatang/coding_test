package chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * packageName : chapter2
 * fileName : 보이는_학생
 * author : taeil
 * date : 2024. 12. 19.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 19.        taeil                   최초생성
 */

/*
*
선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
* */
public class 보이는_학생{

    public static int solution(int n, int[] arr) {
        int answer=1, max=arr[0];
        for (int i=1; i < n; i++) {
            if(arr[i]>max){
                answer++;
                max=arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int n = Integer.parseInt(str);

        String[] input = br.readLine().split(" ");
        int[] nArr = new int[n];
        for(int i=0; i < n; i++) {
            nArr[i] = Integer.parseInt(input[i]);
        }
        System.out.println(solution(n, nArr));
    }
}