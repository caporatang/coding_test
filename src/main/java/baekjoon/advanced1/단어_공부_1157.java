package baekjoon.advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * packageName : baekjoon.advanced1
 * fileName : 단어_공부_1157
 * author : taeil
 * date : 2024. 12. 23.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 23.        taeil                   최초생성
 */
public class 단어_공부_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] arr = str.toUpperCase().toCharArray();
        br.close();

        HashMap<String, Integer> map = new HashMap<>();
        for (char c : arr) {
            String key = String.valueOf(c);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int maxCount = 0;
        String result = "?";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                result = entry.getKey();
            } else if (entry.getValue() == maxCount) {
                result = "?";
            }
        }
        System.out.println(result);
    }
}