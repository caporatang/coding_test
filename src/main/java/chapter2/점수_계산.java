package chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * packageName : chapter2
 * fileName : 점수_계산
 * author : taeil
 * date : 2024. 12. 28.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 28.        taeil                   최초생성
 */
public class 점수_계산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");

        int[] arr= new int[n];
        for(int i=0; i<n; i++) {
            arr[i]= Integer.parseInt(strArr[i]);
        }

        int count=0, score=0;
        for (int i = 0; i <n; i++) {
            if(arr[i] == 1) {
                count++;
                score += count;
            } else {
                count=0;
            }
        }
        System.out.println(score);
    }
}