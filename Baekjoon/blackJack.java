package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
* https://www.acmicpc.net/submit/2798/
* 백준 알고리즘 brute force 문제
* */

public class blackJack {
    //첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다. 둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는다.
//합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.
    static int M;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = br.readLine().split(" ");
        String[] stringCards = br.readLine().split(" ");
        int N = Integer.parseInt(inputArr[0]);
        M = Integer.parseInt(inputArr[1]);
        int[] cards = new int[N];

        //카드값 인트로 받기
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(stringCards[i]);
        }
        //빠른 계산을 위해 우선 카드값 정렬
        quickSort(cards, 0, cards.length - 1);
 /*       for (int i : cards) {
            System.out.print(i + " ");
        }
*/
        //정렬된 카드값으로 최대값보다 작지만 가장 큰 수를 찾는다 (세 수 중 가장 큰 수(Max) 가 될 수를 찾는다.)
        int maxIdx = findMax(cards, 0, cards.length - 1);
        int i = maxIdx;
        int j = maxIdx - 1;
        int z = 0;

        //System.out.println("maxInt = " + maxIdx);
        loop:
        for (i = maxIdx; i >= 0; i--) {
            for (j = i - 1; j >= 0; j--) {
                for (z = j - 1; z >= 0; z--) {
                    //   System.out.println("i = " + i + ", j = " + j + ", z = " + z);
                    if (cards[i] + cards[j] + cards[z] <= M) {
                        break loop;
                    }
                }
            }
        }
        int result = cards[i] + cards[j] + cards[z];
        System.out.println(result);
    }

    public static void quickSort(int[] cards, int l, int r) {
        int left = l;
        int right = r;
        int pivot = cards[(l + r) / 2];
        do {
            while (cards[left] < pivot) left++;
            while (cards[right] > pivot) right--;
            if (left <= right) {
                int temp = cards[left];
                cards[left] = cards[right];
                cards[right] = temp;
                left++;
                right--;
            }
        } while (left <= right);
        //swap을 다 하고 나면 다시 재귀 함수 호출.
        if (l < right) quickSort(cards, l, right);
        if (r > left) quickSort(cards, left, r);
    }

    public static int findMax(int[] arr, int start, int end) {
        int mid = (start + end) / 2;
        int x = start;
        int y = end;
        int max = 0;
        if (y - x < 2) {
            if (arr[y] > M) {
                return x;
            } else {
                return y;
            }
        } else if (arr[mid] == M) {
            return mid;
        } else {
            if (arr[mid] >= M) {
                max = findMax(arr, x, mid);
            } else if (arr[mid] <= M) {
                max = findMax(arr, mid, y);
            }
        }
        return max;
    }
}


/*

class Main {
    static BufferedReader br;
    static int N;
    static int M;
    static int max;
    static int result;
    static int[] arr;
    static boolean[] visited;
    static String[] str;

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        max = Integer.MAX_VALUE;
        arr = new int[N];
        visited = new boolean[N];
        str = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        //-----------------입력부-----------------

        for (int i = 0; i < N; i++) {
            visited[i] = true;
            DFS(i, 0, arr[i]);
            visited[i] = false;
        }
        System.out.println(result);
    }

    public static void DFS(int start, int depth, int sum) {
        //depth가 0부터 시작 했으므로 depth==2이면 3개의 카드를 골랐을 경우이다.
        if (depth == 2) {
            //M보다 크지않은 최대값을 고른다.
            if (Math.abs(M - sum) < max && sum <= M) {
                max = Math.abs(M - sum);
                result = sum;
            }
            return;
        }
        //3개를 고르는 알고리즘.visited[] 함수를 통해 백트래킹으로 구현했다.
        for (int i = start; i < N; i++) {
            if (visited[i])
                continue;
            visited[i] = true;
            DFS(i + 1, depth + 1, sum + arr[i]);
            visited[i] = false;
        }
    }

}
*/
