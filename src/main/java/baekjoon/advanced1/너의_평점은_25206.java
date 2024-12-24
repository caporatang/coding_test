package baekjoon.advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName : baekjoon.advanced1
 * fileName : 너의_평점은_25206
 * author : taeil
 * date : 2024. 12. 24.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 12. 24.        taeil                   최초생성
 */
public class 너의_평점은_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        float totalScore = 0.0f;
        float totalCredits = 0.0f;

        for (int i = 0; i < 20; i++) {
            String[] split = br.readLine().split(" ");
            float credit = Float.parseFloat(split[1]);
            String grade = split[2];

            if (grade.equals("P")) {
                continue;
            }

            float gradePoint = getGradePoint(grade);
            totalScore += credit * gradePoint;

            totalCredits += credit;
        }

        if (totalCredits > 0) {
            System.out.printf("%.6f%n", totalScore / totalCredits);
        } else {
            System.out.println("0.000000");
        }
    }

    private static float getGradePoint(String grade) {
        switch (grade) {
            case "A+":
                return 4.5f;
            case "A0":
                return 4.0f;
            case "B+":
                return 3.5f;
            case "B0":
                return 3.0f;
            case "C+":
                return 2.5f;
            case "C0":
                return 2.0f;
            case "D+":
                return 1.5f;
            case "D0":
                return 1.0f;
            case "F":
                return 0.0f;
            default:
                return 0.0f;
        }
    }
}