package programmers.level_1;

public class 서울에서_김서방_찾기 {

    public static String solution(String[] seoul) {
        int x=0;
        for (int i = 0; i <seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                x=i;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("김서방은 ").append(x).append("에 있다");
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        System.out.print(solution(seoul));
    }
}