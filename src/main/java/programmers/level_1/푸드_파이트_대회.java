package programmers.level_1;

public class 푸드_파이트_대회 {


    public static void main(String[] args) {
        int[] food={1,3,4,6};
        System.out.print(solution(food));
    }

    private static String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <food.length; i++) {
            int count = food[i] / 2; // 2로 나눈 몫만큼 추가할수있음
            sb.append(String.valueOf(i).repeat(count)); // 그 횟수만큼 반복
        }

        String firstHalf = sb.toString(); // 원래 순서 저장
        String result = firstHalf + "0" + sb.reverse().toString(); // 가운데 0 추가 후 역순 배치
        return result;
    }
}