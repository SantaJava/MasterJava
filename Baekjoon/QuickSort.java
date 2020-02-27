package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuickSort {
    public static void quickSort(int[] data, int l, int r) {
        int left = l;
        int right = r;
        int pivot = data[(l + r) / 2];
        do {
            while (data[left] < pivot) left++;
            while (data[right] > pivot) right--;

            int temp = data[left];
            data[left] = data[right];
            data[right] = temp;
            left++;
            right--;

        } while (left <= right);
        if (l < right) quickSort(data, l, right);
        if (r > left) quickSort(data, left, r);
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine().trim());
        }
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
