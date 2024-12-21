package chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * packageName : chapter2
 * fileName : 뒤집은_소수
 * author : taeil
 * date : 2024. 12. 20.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 20.        taeil                   최초생성
 */
public class 뒤집은_소수 {

    public static boolean isPrime(int num) {
        if(num==1) return false;
        for(int i=2; i<num; i++){
            if(num%i==0) return false;
        }
        return true;
    }

    public static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i <n; i++) {
            int tmp=arr[i];
            int res=0;
            while (tmp>0) {
                int t=tmp%10;
                res=res*10+t;
                tmp=tmp/10;
            }
            if(isPrime(res)) answer.add(res);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strN = br.readLine();
        int n = Integer.parseInt(strN);

        int[] arr = new int[n];
        String str = br.readLine();
        br.close();

        String[] strArr = str.split(" ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        ArrayList<Integer> answer = solution(n, arr);
        for(int num : answer) System.out.print(num + " ");
    }
}