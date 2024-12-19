import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        for (int i = 0; i <9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int order=1;
        int max=arr[0];
        for (int i = 0; i <arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                order = i+1;
            }
        }
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(max).append("\n").append(order));
    }
}