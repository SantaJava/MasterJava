package Baekjoon;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    private int V;
    private LinkedList<Integer> adj[];

    Graph(int v){
        V = v;
        adj = new LinkedList[v];
        for(int i =0; i<v; ++i){
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w){
        adj[v].add(w);
    }

    void DFSUtil(int v, boolean visited[]){
        visited[v] = true;
        System.out.println(v+ " ");
        for (int n : adj[v]) {
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }
}
