package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class blackJack {
    //첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다. 둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는다.
//합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = br.readLine().trim().split(" ");
        String[] stringCards = br.readLine().trim().split(" ");

        int N = Integer.parseInt(inputArr[0]); //카드 개수
        M = Integer.parseInt(inputArr[1]); //최대합
        int[] cards = new int[N];

        //카드값 인트로 받기
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(stringCards[i]);
        }
        //빠른 계산을 위해 우선 카드값 정렬
        quickSort(cards, 0, cards.length - 1);
        for (int i : cards) {
            System.out.print(i + " ");
        }


        //정렬된 카드값으로 최대값보다 작지만 가장 큰 수를 찾는다 (세 수 중 가장 큰 수(Max) 가 될 수를 찾는다.)
        int maxIdx = findMax(cards, 0, cards.length - 1);
        int i = maxIdx;
        int j = maxIdx - 1;
        int z = 0;
        System.out.println("maxInt = " + maxIdx);
        for (i = maxIdx; i >= 0; i--) {
            System.out.println("i = " +i);
            for (j = i - 1; j >= 0; j--) {
                if (i + j < M) {
                    z = j - 1;
                    while (z > M - i - j && z >= 0) {
                        z--;
                    }
                }
            }
        }
        i++;
        j++;
        z++;

        System.out.println("i=" + i + "j:" + j + " z: " + z);
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
        // System.out.println("called, mid: " + mid + ", start : " + x + ", end: " + y);
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
