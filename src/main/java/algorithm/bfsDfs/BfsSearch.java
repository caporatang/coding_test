package algorithm.bfsDfs;

import java.util.*;

/**
 * packageName : algorithm.bfsDfs
 * fileName : BfsSearch
 * author : taeil
 * date : 2024. 11. 30.
 * description :
 * =======================================================
 * DATE          AUTHOR                      NOTE
 * -------------------------------------------------------
 * 2024. 11. 30.        taeil                   최초생성
 */
public class BfsSearch {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(3, 4));
        graph.put(2, Arrays.asList(5, 6));
        graph.put(3, new ArrayList<>());
        graph.put(4, new ArrayList<>());
        graph.put(5, new ArrayList<>());
        graph.put(6, new ArrayList<>());

        System.out.println("BFS 탐색 결과:");
        bfs(graph, 0);

        System.out.println("DFS 탐색 결과:");
        dfs(graph, 0);
    }

    // BFS 구현
    public static void bfs(Map<Integer, List<Integer>> graph, int startNode) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(startNode);
        visited.add(startNode);

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");

            // 인접 노드
            for (int neighbor : graph.get(currentNode)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }

    // DFS 구현
    public static void dfs(Map<Integer, List<Integer>> graph, int startNode) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();

        stack.push(startNode);

        while (!stack.isEmpty()) {
            int currentNode = stack.pop();

            if (!visited.contains(currentNode)) {
                visited.add(currentNode);
                System.out.print(currentNode + " ");

                // 인접 노드를 역순으로 스택에 추가
                List<Integer> neighbors = graph.get(currentNode);
                Collections.reverse(neighbors);
                for (int neighbor : neighbors) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }
}