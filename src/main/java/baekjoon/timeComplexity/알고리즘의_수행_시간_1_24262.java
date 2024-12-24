package baekjoon.timeComplexity;

/**
 * packageName : baekjoon.timeComplexity
 * fileName : 알고리즘의_수행_시간_1
 * author : taeil
 * date : 2024. 12. 24.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 24.        taeil                   최초생성
 */

/*
O(1) – 상수 시간 : 문제를 해결하는데 오직 한 단계만 처리함.
*O(log n)** – 로그 시간 : 문제를 해결하는데 필요한 단계들이 연산마다 특정 요인에 의해 줄어듬.
O(n) – 직선적 시간 : 문제를 해결하기 위한 단계의 수와 입력값 n이 1:1 관계를 가짐.
O(n log n) : 문제를 해결하기 위한 단계의 수가 N*(log2N) 번만큼의 수행시간을 가진다. (선형로그형)
O(n^2) – 2차 시간 : 문제를 해결하기 위한 단계의 수는 입력값 n의 제곱.
O(C^n) – 지수 시간 : 문제를 해결하기 위한 단계의 수는 주어진 상수값 C 의 n 제곱.
* */
public class 알고리즘의_수행_시간_1_24262 {
    public static void main(String[] args) {
        // ManOfPassion 알고리즘은 반복문이 없고, 무슨 값이 들어오던 바로 반환이다.
        // -> 단일 연산 O(1)
        System.out.println(1);
        System.out.println(0);
    }
}