package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * packageName : baekjoon
 * fileName : 나머지_3052
 * author : taeil
 * date : 2024. 12. 21.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 21.        taeil                   최초생성
 */
public class 나머지_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr= new int[10];
        for (int i = 0; i <10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i <arr.length; i++) {
            hs.add(arr[i]%42);
        }
        System.out.println(hs.size());
    }
}