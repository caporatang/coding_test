package baekjoon.advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName : baekjoon.advanced1
 * fileName : 크로아티아_알파벳
 * author : taeil
 * date : 2024. 12. 24.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 24.        taeil                   최초생성
 */
public class 크로아티아_알파벳_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (String croAlpha : cro) {
            str = str.replace(croAlpha, "1");
        }

        System.out.println(str.length());
    }
}