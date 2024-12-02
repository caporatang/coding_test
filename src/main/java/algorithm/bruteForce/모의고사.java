package algorithm.bruteForce;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * packageName : algorithm.bruteForce
 * fileName : Test
 * author : taeil
 * date : 2024. 12. 1.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 1.        taeil                   최초생성
 */
public class 모의고사 {
    static int[] one = {1,2,3,4,5};
    static int[] two = {2,1,2,3,2,4,2,5};
    static int[] three = {3,3,1,1,2,2,4,4,5,5};

    public int[] solution(int[] answers) {
        int[] answer = new int[3];

        for(int i=0; i<answers.length; i++) {
            if (one[i % one.length] == answer[i]) {
                answer[0]++;
            }
            if (two[i % two.length] == two[i]) {
                answer[1]++;
            }
            if (three[i % three.length] ==  three[i]) {
                answer[2]++;
            }
        }
        int max = Arrays.stream(answer).max().getAsInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <answer.length; i++) {
            if (max == answer[i]) {
                list.add(i + 1);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i <result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        모의고사 test = new 모의고사();
        int[] arr  = {1,2,3,4,5};
        test.solution(arr);
    }

}