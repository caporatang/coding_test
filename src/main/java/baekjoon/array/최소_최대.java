package baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최소_최대 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String x = br.readLine();

        int num = Integer.parseInt(n);
        int[] numArr = new int[num];

        String[] arr = x.split(" ");
        for (int i = 0; i <arr.length; i++) {
            numArr[i] = Integer.parseInt(arr[i]);
        }

        int max = numArr[0];
        int min = numArr[0];

        for (int i = 1; i < numArr.length; i++) {
            if (numArr[i] > max) {
                max = numArr[i];
            }
            if (numArr[i] < min) {
                min = numArr[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(min).append(" ").append(max);
        System.out.println(sb);
    }
}