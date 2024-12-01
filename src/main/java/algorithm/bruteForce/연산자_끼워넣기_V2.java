package algorithm.bruteForce;

import java.util.Scanner;

/**
 * packageName : algorithm.bruteForce
 * fileName : 연산자_끼워넣기_심화
 * author : taeil
 * date : 2024. 12. 1.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 1.        taeil                   최초생성
 */
public class 연산자_끼워넣기_V2 {
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
    // k-1 번째 연산자까지 계산한 결과가 value다.
    static void rec_func(int k, int value) {
        // value는 k-1번째 연산자까지 계산한 결과다. -> calculator 함수에서 for문을 돌릴 필요가 없어진다.

        if (k == N) { // 모든 연산자들을 전부 나열하는 방법을 찾은 상태
            // 완성된 식에 맞게 계산을 해서 정답에 갱신하는 작업
            max = Math.max(max, value);
            min = Math.min(min, value);
        }
        else { // k번째 연산자는 무엇을 선택할 것인가?
            for (int cand = 1; cand<=4; cand++) {
                if (operators[cand] >= 1) {
                    operators[cand]--;
                    order[k]=cand;

                    // k번째 연산자는 K번째 숫자와  k+1번째 숫자를 연산하는것이기 떄문.
                    rec_func(k+1, calculator(value, cand, nums[k+1]));
                    operators[cand]++;
                    order[k]=0;
                }
            }
        }
    }

    // 피연산자 2개와 연산자가 주어졌을 때 계산해주는 함수
    private static int calculator(int operand1, int operator, int operand2) {
        if (operator==1) return operand1 + operand2;
        if (operator==2) return operand1 - operand2;
        if (operator==3) return operand1 * operand2;
        if (operator==4) return operand1 / operand2;
    }

    public static void main(String[] args) {
        input();
        // 1 번째 원소부터 M 번째 원소를 조건에 맞게 고르는 모든 방법 탐색
        rec_func(1, nums[1]); // 첫번째 연산자를 결정하기 전의 계산 결과는, 첫번째 원소에 있는 값을 기준으로 하기 때문에 1번원소를 넘긴다.
        sb.append(max).append('\n').append(min);
        System.out.println(sb.toString());
    }

}