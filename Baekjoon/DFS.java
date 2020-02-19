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
            n = Integer.parseInt(temp[0]); //Number of Nodes
            m = Integer.parseInt(temp[1]); //Number of Lines
            v = Integer.parseInt(temp[2]); //Start number
            map = new int[n + 1][n + 1];
            visit = new boolean[n + 1];
            while (m-- > 0) {
                temp = br.readLine().trim().split(" "); //get linked Nodes
                int x = Integer.parseInt(temp[0]);
                int y = Integer.parseInt(temp[1]);
                map[x][y] = map[y][x] = 1; //check the one those are linked
            }

            //after every linked are marked start dfs
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

        //visit
        for (int i = 1; i <= n; i++) {
            if (map[k][i] == 1) {
                dfs(i, n);
            }
        }
    }

    public static void bfs(int k, int n) {
        Queue<Integer> queue = new <Integer>LinkedList();
        queue.offer(k);
        while (!queue.isEmpty()) {
            int temp = queue.poll();
            visit[temp] = true;
            System.out.print(temp + " ");
            for (int i = 1; i <= n; i++) {
                if (map[temp][i] == 1 && !visit[i]) {
                    queue.offer(i);
                    visit[i] = true;
                }
            }
        }
    }
}
