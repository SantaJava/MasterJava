package Baekjoon;

import javax.print.attribute.IntegerSyntax;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFS {
    private static int n, m, v;
    private static int[][] map;
    private static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] temp = br.readLine().trim().split(" ");
            int n = Integer.parseInt(temp[0]);  //number of nodes
            int m = Integer.parseInt(temp[1]);  //number of lines
            int v = Integer.parseInt(temp[2]);  //start node
            map = new int[n + 1][n + 1]; //create
            visit = new boolean[n + 1];
            while (m-- > 0) {
                temp = br.readLine().trim().split(" ");
                int x = Integer.parseInt(temp[0]);
                int y = Integer.parseInt(temp[1]);
                map[x][y] = map[y][x] = 1;
            }
            dfs(v, n);
            visit = new boolean[n + 1];
            System.out.println();
            bfs(v, n);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void dfs(int k, int n) { //start number k, Number of nodes n
        //if seen, pop
        if (visit[k]) {
            return;
        }
        visit[k] = true;
        System.out.print(k + " ");
        //if not, add to seen
        for (int i = 0; i < n; i++) {
            if (map[k][i] == 1) {
                dfs(i, n);
            }
        }
    }

    public static void bfs(int k, int n) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(k);
        while (!q.isEmpty()) {
            int temp = q.poll();
            System.out.print(temp + " ");
            for (int j = 0; j < n; j++) {
                if (map[temp][j] == 1 && !visit[j]) {
                    q.offer(j);
                    visit[j] = true;
                }
            }
        }
    }
}
