package Baekjoon;

/*
 *2606 find the computers that are going to be infected with virus.
 * */


import java.util.ArrayList;
import java.util.Scanner;


class DfsGraph {
    private int nV; //Node개수
    private ArrayList<ArrayList<Integer>> dfsGraph;
    private boolean[] visitArr;
    private int count = 0;


    public DfsGraph(int nV) {
        this.nV = nV;
        this.dfsGraph = new ArrayList<>();
        // 그래프 초기화
        for (int i = 0; i < this.nV + 1; i++) {
            this.dfsGraph.add(new ArrayList<>());
        }
        this.visitArr = new boolean[this.nV + 1]; // visited?
    }

    public ArrayList<ArrayList<Integer>> getGraph() {
        return this.dfsGraph;
    }

    public ArrayList<Integer> getNode(int i) {
        return this.dfsGraph.get(i);
    }

    //양방향 그래프
    public void put(int x, int y) {
        this.dfsGraph.get(x).add(y);
        this.dfsGraph.get(y).add(x);
    }

    //단방향 그래프
    public void putSingle(int x, int y) {
        this.dfsGraph.get(x).add(y);
    }

    //그래프 출력(인접 리스트)
    public void printGraphToAdjList() {
        for (int i = 1; i < this.dfsGraph.size(); i++) {
            System.out.println("정점" + i + "의 인접 리스트");
            for (int j = 0; j < this.dfsGraph.get(i).size(); j++) {
                System.out.println("->" + this.dfsGraph.get(i).get(j));
            }
            System.out.println();
        }
    }

    public void clearVisitArr() {
        for (int i = 0; i < this.visitArr.length; i++) {
            this.visitArr[i] = false;
        }
    }

    public void dfs(int vIdx) {
        this.visitArr[vIdx] = true;
        //    System.out.println(vIdx + " ");
        for (int i : this.dfsGraph.get(vIdx)) {
            if (this.visitArr[i] == false) {
                dfs(i);
            }
        }
    }

    public int count(int vIdx) {
        this.count++;
        this.visitArr[vIdx] = true;
        //    System.out.println(vIdx + " ");
        for (int i : this.dfsGraph.get(vIdx)) {
            if (this.visitArr[i] == false) {
                count(i);
            }
        }
        return count;
    }
}

public class virus {
    public static void main(String[] args) throws Exception {
        int nV = 0;
        int nE = 0;

        Scanner sc = new Scanner(System.in);
        nV = Integer.parseInt(sc.nextLine()); //정점
        nE = Integer.parseInt(sc.nextLine()); //간선
        DfsGraph dfsGraph = new DfsGraph(nV);

        for (int i = 0; i < nE; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            dfsGraph.put(a, b);
        }
        dfsGraph.printGraphToAdjList();
        sc.close();

    }
}
