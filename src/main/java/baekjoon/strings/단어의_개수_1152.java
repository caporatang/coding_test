package baekjoon.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName : baekjoon.strings
 * fileName : 단어의_개수_1152
 * author : taeil
 * date : 2024. 12. 23.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 23.        taeil                   최초생성
 */
public class 단어의_개수_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim();
        br.close();

        if (str.isEmpty()) {
            System.out.println(0);
        } else {
            String[] arr = str.split("\\s+");
            System.out.println(arr.length);
        }
    }
}