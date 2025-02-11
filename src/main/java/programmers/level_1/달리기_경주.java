package programmers.level_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 달리기_경주 {

    public static String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i <players.length; i++) {
            map.put(players[i], i);
        }

        for (String name : callings) {
            int curIdx = map.get(name);

            if(curIdx == 0) continue;

            int prev = curIdx-1;
            String prevPlayer = players[prev];

            players[prev]= name;
            players[curIdx] = prevPlayer;

            map.put(name, prev);
            map.put(prevPlayer, curIdx);
        }
        return players;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] players = br.readLine().split(" ");
        String[] callings = br.readLine().split(" ");

        solution(players, callings);
    }
}