package chapter3;

import java.util.ArrayList;
import java.util.Scanner;

public class 두_배열_합치기_two_pointers {
    public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;

        while (p1<n && p2<m ) {
            if (a[p1]<b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        while (p1<n) answer.add(a[p1++]);
        while (p2<m) answer.add(b[p2++]);
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <n; i++) {
            a[i]=sc.nextInt();
        }

        int m=sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i <m; i++) {
            b[i]=sc.nextInt();
        }
        for(int x : solution(n,m,a,b)) System.out.print(x + " ");
    }
}