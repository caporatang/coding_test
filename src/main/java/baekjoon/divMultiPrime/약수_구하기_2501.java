package baekjoon.divMultiPrime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName : baekjoon.divMultiPrime
 * fileName : 약수_구하기_2501
 * author : taeil
 * date : 2024. 12. 26.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 26.        taeil                   최초생성
 */
public class 약수_구하기_2501 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        for (int i = 1; i<=n; i++) {
            if(n%m==0) {
                arr[i]=i;
            }
        }
        System.out.print(arr[m]);
    }
}