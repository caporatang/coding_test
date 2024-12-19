package chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * packageName : chapter2
 * fileName : 가위_바위_보
 * author : taeil
 * date : 2024. 12. 19.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 19.        taeil                   최초생성
 */


/*
A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
* */
public class 가위_바위_보 {
    public static ArrayList<String> solution(int n, int[] aArr, int[] bArr) {
        ArrayList<String> answer = new ArrayList<>();
        for(int i=0; i<n; i++) {
            if(aArr[i] == bArr[i]) answer.add("D");
            else if (aArr[i]==1 & bArr[i]==3) answer.add("A");
            else if (aArr[i]==2 & bArr[i]==1) answer.add("A");
            else if (aArr[i]==3 & bArr[i]==2) answer.add("A");
            else answer.add("B");
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int n = Integer.parseInt(str);

        String A = br.readLine();
        String B = br.readLine();

        String[] a = A.split(" ");
        String[] b = B.split(" ");

        int[] aArr = new int[n];
        int[] bArr = new int[n];

        for(int i=0; i<n; i++) {
            aArr[i] = Integer.parseInt(a[i]);
            bArr[i] = Integer.parseInt(b[i]);
        }
        ArrayList<String> answer = solution(n, aArr, bArr);
        for(int i=0; i<answer.size(); i++) {
            System.out.println(answer.get(i));
        }
    }
}