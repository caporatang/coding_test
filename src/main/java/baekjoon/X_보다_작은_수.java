package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
public class X_보다_작은_수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String one = br.readLine();
        String a = br.readLine();

        String[] aArr = a.split(" ");
        String[] splitOne = one.split(" ");

        int[] parseArr = new int[aArr.length];
        for (int i = 0; i <aArr.length; i++) {
            int parse=Integer.parseInt(aArr[i]);
            parseArr[i]=parse;
        }

        StringBuilder sb = new StringBuilder();

        int x = Integer.parseInt(splitOne[1]);
        for(int i=0; i<aArr.length; i++) {
            if (x>parseArr[i]){
                sb.append(parseArr[i]).append(" ");
            }
        }
        System.out.print(sb.toString());
    }
}