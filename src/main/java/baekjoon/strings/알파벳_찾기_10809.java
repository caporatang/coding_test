package baekjoon.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName : baekjoon.strings
 * fileName : 알파벳_찾기_10809
 * author : taeil
 * date : 2024. 12. 22.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 22.        taeil                   최초생성
 */
public class 알파벳_찾기_10809 {
    public static void main(String[] args) throws IOException {
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine();

        String[] splitArr = target.split("");
        int[] answer = new int[alphabet.length];

        for (int i = 0; i < alphabet.length; i++) {
            answer[i] = -1;
        }

        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < splitArr.length; j++) {
                if (splitArr[j].equals(alphabet[i])) {
                    if (answer[i] == -1) {
                        answer[i] = j;
                    }
                }
            }
        }

        for (int x : answer) {
            System.out.print(x + " ");
        }

        // 다른 사람 ...풀이
        // ========================
        int[] answer2 = new int[26]; // 알파벳 개수만큼 배열 생성
        for (int i = 0; i < 26; i++) {
            answer2[i] = target.indexOf('a' + i); // 'a'부터 'z'까지 indexOf로 위치 검색
        }

        for (int x : answer2) {
            System.out.print(x + " ");
        }


    }
}