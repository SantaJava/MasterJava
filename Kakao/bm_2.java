package Kakao;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bm_2 {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine().trim());
        int xMat[][]; //X 행렬
        int yMat[][]; //Y 행렬
        int rMat[][]; //R 행렬
        int n = 0;
        int m = 0;
        int k = 0;

        for (int i = 0; i < T; i++) {
            String[] inputArr = sc.nextLine().split(" ");
            n = Integer.parseInt(inputArr[0]);
            m = Integer.parseInt(inputArr[1]);
            k = Integer.parseInt(inputArr[2]);
            xMat = new int[k][k];
            yMat = new int[k][k];
            rMat = new int[n][m];

            //행렬 X 값 저장합니다.
            for (int x = 0; x < k; x++) {
                String[] tempArr = sc.nextLine().split(" ");
                for (int j = 0; j < k; j++) {
                    xMat[x][j] = Integer.parseInt(tempArr[j]);
                }
            }
            //행렬 Y값을 저장합니다.
            for (int x = 0; x < k; x++) {
                String[] tempArr = sc.nextLine().split(" ");
                for (int j = 0; j < k; j++) {
                    yMat[x][j] = Integer.parseInt(tempArr[j]);
                }
            }
            //행렬 R의 값을 저장합니다.
            for (int x = 0; x < n; x++) {
                String[] tempArr = sc.nextLine().split(" ");
                for (int j = 0; j < m; j++) {
                    rMat[x][j] = Integer.parseInt(tempArr[j]);
                }
            }
            int[][] testMat = new int[k][k];
            int count = 0;
            for (int l = 0; l < rMat.length - k + 1; l++) {
                for (int r = 0; r < rMat[l].length - k + 1; r++) {
                    for (int o = 0; o < k; o++) {
                        for (int j = 0; j < k; j++) {
                            testMat[o][j] = rMat[l + o][r + j];
                        }
                    }
                    if (solution(xMat, yMat, testMat, k)) count++;
                    //행렬 R에서 만들 수 있는 모든 행렬들을 검사합니다.
                }
            }
            System.out.println(count);
        }
    }

    public static void printArr(int[][] arr) {
        //print array to check answers
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printArr2(int[] arr) {
        //print array to check answers
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static boolean solution(int[][] xMat, int[][] yMat, int[][] zMat, int k) {
        //xz = y
        int[] v = new int[k];
        while (--k > 0) {
            randomize(v);
            System.out.println(product(xMat, zMat, yMat, v));
        }
        return true;
    }

    public static boolean product(int[][] A, int[][] B, int[][] C, int[] v) {
        int k = A.length;
        int[] Br = new int[k];
        int[] Cr = new int[k];
        int[] ABr = new int[k];

        for (int i = 0; i < k; i++) {
            int elementB = 0;
            int elementC = 0;

            for (int j = 0; j < k; j++) {
                elementB += B[i][j] * v[i];
            }
            Br[i] = elementB;

            for (int j = 0; j < k; j++) {
                elementC += C[i][j] * v[i];
            }
            Cr[i] = elementC;
        }
/*
        printArr2(Br);
        System.out.println();
        printArr2(Cr);
        System.out.println();*/

        for (int i = 0; i < k; i++) {
            int elementAB = 0;
            for (int j = 0; j < k; j++) {
                elementAB += A[i][j] * v[i];
            }
            ABr[i] = elementAB;
        }

        for (int i = 0; i < k; i++) {
            if (ABr[i] - Cr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void randomize(int[] v) {
        //random v 행열을 만들어줍니다.
        for (int i = 0; i < v.length; i++) {
            v[i] = (Math.random() < 0.5) ? 0 : 1; //0과 1 중 하나의 수를 저장합니다.
        }
    }
}
