package programmers.level_1;

import java.util.Arrays;

public class 문자열_내_마음대로_정렬하기 {

    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> {
            System.out.println("비교 대상: " + a + " vs " + b);
            System.out.println("n번째 문자 비교: " + a.charAt(n) + " vs " + b.charAt(n));
            int result;
            if (a.charAt(n) == b.charAt(n)) {
                result = a.compareTo(b);
                System.out.println("같은 문자 -> 사전순 정렬: " + result);
            } else {
                result = Character.compare(a.charAt(n), b.charAt(n));
                System.out.println("다른 문자 -> 문자 비교 결과: " + result);
            }
            System.out.println();
            return result;
        });

        return strings;
    }

    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 1;

        String[] sortedStrings = solution(strings, n);
        System.out.println("정렬된 결과: " + Arrays.toString(sortedStrings));
    }
}