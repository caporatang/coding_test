package algorithm.bruteForce;

import java.util.Scanner;

/**
 * packageName : algorithm.bruteForce
 * fileName : N과M
 * author : taeil
 * date : 2024. 11. 30.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 11. 30.        taeil                   최초생성
 */
// N개중 중복을 허용하지 않고 M개 고르기 (15650번)
public class N_과_M_2 {
    static StringBuilder sb = new StringBuilder();
    static int N,M;
    static int[] selected;

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        selected = new int[M + 1];
    }

    static void rec_func(int k) {
        if (k == M + 1) { // 다 고른 경우
            // selecte[1..M] 배열이 새롭게 탐색된 결과
            for(int i = 1; i <= M; i++) sb.append(selected[i]).append(" ");
            sb.append('\n');
        } else {
            for (int cand=selected[k-1] + 1; cand <= N; cand++) {
                selected[k] = cand;
                rec_func(cand);
                selected[k] = 0;
            }
        }
    }
    public static void main(String[] args) {
        input();
        // 첫번째 원소부터 M 번째 원소를 조건에 맞는 모든 방법을 찾기
        rec_func(1);
        System.out.println(sb.toString());
    }

}