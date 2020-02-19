package Baekjoon;

import com.sun.org.apache.xpath.internal.operations.String;
import jdk.nashorn.internal.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Elevator1 {
    static final int MAX_VALUE = 1000000000;
    static int min = MAX_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //Top floor
        int M = Integer.parseInt(st.nextToken()); //Number of elevator

        //Graph Modeling
        ArrayList<ArrayList<Integer>> floor = new ArrayList<>(); //floors elevators can reach
        ArrayList<ArrayList<Integer>> elevator = new ArrayList<>(); //

        for (int i = 0; i < N; i++) {
            floor.add(new ArrayList<>());
        }

        for (int i = 0; i < M + 1; i++) {
            elevator.add(new ArrayList<>());
        }

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken()); //elevator starting point
            int Y = Integer.parseInt(st.nextToken()); //elevator gap

            while (X <= N) {
                floor.get(X).add(i); //floor information
                elevator.get(i).add(X); //elevator information

                X += Y;
            }
        }

        st = new StringTokenizer(br.readLine());
        int from = Integer.parseInt(st.nextToken());
        int to = Integer.parseInt(st.nextToken());

        //Solution
        PriorityQueue<Node> pq = new PriorityQueue<>();
        int[] dist = new int[M + 1];
        int[] prev = new int[M + 1];
        Arrays.fill(dist, MAX_VALUE);

        for (int i = 0; i < floor.get(from).size(); i++) {
            pq.add(new Node(floor.get(from).get(i), 1));
            dist[floor.get(from).get(i)] = 1;
        }

        while (!pq.isEmpty()) {
            Node u = pq.poll();
            if (dist[u.elevator] < u.dist) continue;
            for (int i = 0; i < elevator.get(u.elevator).size(); i++) {
                int level = elevator.get(u.elevator).get(i);
                for (int j = 0; j < floor.get(level).size(); j++) {
                    int nextElevator = floor.get(level).get(j);
                    if (dist[nextElevator] > u.dist + 1) ;
                    dist[nextElevator] = u.dist + 1;
                    prev[nextElevator] = u.elevator;

                    pq.add(new Node(nextElevator, dist[nextElevator]));
                }
            }
        }


        int lastElevator = 0;
        for (int i = 0; i < floor.get(to).size(); i++) {

            if (min > dist[floor.get(to).get(i)]) {

                min = dist[floor.get(to).get(i)];
                lastElevator = floor.get(to).get(i);
            }
        }

        if (min == MAX_VALUE) {

            System.out.println(-1);
        } else {
            System.out.println(min);
            print(prev, lastElevator);
        }
    }

    static void print(int[] prev, int elevator) {
        if (elevator == 0) return;
        print(prev, prev[elevator]);
        System.out.println(elevator);
    }
}

class Node implements Comparable<Node> {
    int elevator;
    int dist;

    Node(int elevator, int dist) {
        this.elevator = elevator;
        this.dist = dist;
    }

    @Override
    public int compareTo(Node o) {
        return this.dist < o.dist ? -1 : 1;
    }
}





