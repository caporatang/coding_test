package baekjoon.divMultiPrime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
* packageName : baekjoon.divMultiPrime
* fileName : 약수들의_합_9506
* author : taeil
* date : 2024. 12. 26.
* description : 
* =======================================================
* DATE          AUTHOR                      NOTE
* -------------------------------------------------------
* 2024. 12. 26.        taeil                   최초생성
*/
public class 약수들의_합_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;

            List<Integer> divisors = new ArrayList<>();

            int sum = 0;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    divisors.add(i);
                    sum += i;
                }
            }

            if (sum == n) {
                sb.append(n).append(" = ");
                for (int i = 0; i < divisors.size(); i++) {
                    sb.append(divisors.get(i));
                    if (i < divisors.size() - 1) sb.append(" + ");
                }
                sb.append("\n");
            } else {
                sb.append(n).append(" is NOT perfect.\n");
            }
        }

        System.out.println(sb.toString());
    }
}