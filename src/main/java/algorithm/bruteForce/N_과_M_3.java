package algorithm.bruteForce;

import java.util.Scanner;

/**
 * packageName : algorithm.bruteForce
 * fileName : N_과_M_3
 * author : taeil
 * date : 2024. 11. 30.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 11. 30.        taeil                   최초생성
 */

// N개중 중복을 허용해서, M개를 순서대로 나열하는 유형 (15649번)
public class N_과_M_3 {
    static StringBuilder sb = new StringBuilder();
    static int N,M;
    static int[] selected;

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        selected = new int[M + 1];
    }

    // 재귀 함수
    // 만약 M 개를 전부 고름 -> 조건에 맞는 탐색을 한 가지 성공한 것,
    // 아직 M 개를 고르지 않음 -> k 번째부터 N번째 원소를 조건에 맞게 고르는 모든 방법을 시도
    static void rec_func(int k) {
        if (k == M + 1) { // 다 고른 경우
            // selecte[1..M] 배열이 새롭게 탐색된 결과
            for(int i = 1; i <= M; i++) sb.append(selected[i]).append(" ");
            sb.append('\n');
        } else {
            for (int cand =1; cand <=N; cand++) {
                // k 번째에 cand 가 올 수 있으면
                selected[k] = cand;

                // k+1번 ~ M 번을 모두 탐색하는 일을 해야 하는 상황,
                rec_func(k+1);
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