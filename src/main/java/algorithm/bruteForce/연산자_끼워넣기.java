package algorithm.bruteForce;

import java.util.Scanner;

/**
 * packageName : algorithm.bruteForce
 * fileName : 연산자_끼워넣기
 * author : taeil
 * date : 2024. 12. 1.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 1.        taeil                   최초생성
 */
// BOJ : 14888번
// int의 범위는 -21억 ~ 21억 -> 문제에서 주어진 조건에 모든 값을 연산해도 -10억이랑 10억 사이 값이 나온다 == int 자료형으로 계산해도 된다.
// N-1 개의 카드 중  중복없이(같은 카드는 한 번 사용해서), N-1 개를 순서 있게 나열하기 유형이다.
// 시간복잡도는 N-1이 최대 10이다 -> 10 팩토리얼, 10! 경우의 수가 나올수있다 이는 3628800 이기 때문에, 2초 안에 풀 수 있다.
public class 연산자_끼워넣기 {
    static StringBuilder sb = new StringBuilder();
    static Scanner sc = new Scanner(System.in);
    static void input() {
        N = sc.nextInt();
        nums = new int[N + 1];
        operators = new int[5];
        order = new int[N + 1];
        for (int i = 1; i <= N; i++) nums[i] = sc.nextInt();
        for (int i = 1; i <= 4; i++) operators[i] = sc.nextInt();

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
    }

    // 숫자의 개수, 정답을 기록할 max, min
    static int N, max, min;

    // 숫자를 들고있을 nums, operator 배열, order 어떤 순서대로 연산자를 넣었었는지 기록할 배열
    static int[] nums, operators, order;

    // order[1..N-1]에 연산자들이 순서대로 저장된다.
    static void rec_func(int k) {
        if (k == N) { // 모든 연산자들을 전부 나열하는 방법을 찾은 상태
            // 완성된 식에 맞게 계산을 해서 정답에 갱신하는 작업
            int value = calculator();
            max = Math.max(max, value);
            min = Math.min(min, value);
        }
        else { // k번째 연산자는 무엇을 선택할 것인가?
            for (int cand = 1; cand<=4; cand++) {
                if (operators[cand] >= 1) {
                    operators[cand]--;
                    order[k]=cand;
                    rec_func(k+1);
                    operators[cand]++;
                    order[k]=0;
                }
            }
        }
    }

    // 완성된 식에 맞게 계산을 해서 정답에 갱신하는 작업
    static int calculator() {
        // 초기값
        int value = nums[1];
        for (int i=1; i <=N-1; i++) {
            // value, order[i], nums[i+1]
            if (order[i] == 1) value = value + nums[i+1];
            if (order[i] == 2) value = value - nums[i+1];
            if (order[i] == 3) value = value * nums[i+1];
            if (order[i] == 4) value = value / nums[i+1];
        }
        return value;
    }

    public static void main(String[] args) {
        input();
        // 1 번째 원소부터 M 번째 원소를 조건에 맞게 고르는 모든 방법 탐색
        rec_func(1);
        sb.append(max).append('\n').append(min);
        System.out.println(sb.toString());
    }

}