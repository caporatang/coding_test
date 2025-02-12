package programmers.level_1;

import java.util.Stack;

public class 햄버거_만들기 {

    public static int solution(int[] ingredient) {
        // 1 -> 빵
        // 2 -> 야채
        // 3 -> 고기
        // 만들어야 되는거 :빵 야채 고기 빵 -> 1 2 3 1

        int count = 0; // 포장한 햄버거 개수
        Stack<Integer> stack = new Stack<>();

        for (int ing : ingredient) {
            stack.push(ing);

            // 스택의 마지막 4개 요소가 [1, 2, 3, 1]인지 확인
            if (stack.size() >= 4) {
                int size = stack.size();
                if (stack.get(size - 4) == 1 &&
                        stack.get(size - 3) == 2 &&
                        stack.get(size - 2) == 3 &&
                        stack.get(size - 1) == 1) {

                    // 햄버거 포장 후 스택에서 제거
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    count++;
                }
            }
        }

        return count;
    }


    public static void main(String[] args) {
        int[] ingredient1 = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int[] ingredient2 = {1, 3, 2, 1, 2, 1, 3, 1, 2};

        System.out.println(solution(ingredient1)); // 2
        System.out.println(solution(ingredient2)); // 0
    }
}