package chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName : chapter2
 * fileName : 소수_구하기_에라토스테네스의_체
 * author : taeil
 * date : 2024. 12. 19.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 19.        taeil                   최초생성
 */

/*
자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
* */
public class 소수_구하기_에라토스테네스의_체 {

    public static int solution(int n) {
        int answer=0;
        int[] ch=new int[n+1];

        for (int i = 2; i<=n; i++) {
            if(ch[i] ==0) {
                answer++;
                for(int j=i; j<=n; j=j+i) ch[j] =1;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        br.close();

        System.out.print(solution(Integer.parseInt(n)));
    }

}