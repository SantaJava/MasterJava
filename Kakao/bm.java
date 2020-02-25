package Kakao;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bm {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine().trim());
        double xMat[][]; //X 행렬
        double yMat[][]; //Y 행렬
        double rMat[][]; //R 행렬
        int n = 0;
        int m = 0;
        int k = 0;

        for (int i = 0; i < T; i++) {
            String[] inputArr = sc.nextLine().split(" ");
            n = Integer.parseInt(inputArr[0]);
            m = Integer.parseInt(inputArr[1]);
            k = Integer.parseInt(inputArr[2]);
            xMat = new double[k][k];
            yMat = new double[k][k];
            rMat = new double[n][m];

            //행렬 X 값 저장합니다.
            for (int x = 0; x < k; x++) {
                String[] tempArr = sc.nextLine().split(" ");
                for (int j = 0; j < k; j++) {
                    xMat[x][j] = Double.parseDouble(tempArr[j]);
                }
            }
            //행렬 Y값을 저장합니다.
            for (int x = 0; x < k; x++) {
                String[] tempArr = sc.nextLine().split(" ");
                for (int j = 0; j < k; j++) {
                    yMat[x][j] = Double.parseDouble(tempArr[j]);
                }
            }
            //행렬 R의 값을 저장합니다.
            for (int x = 0; x < n; x++) {
                String[] tempArr = sc.nextLine().split(" ");
                for (int j = 0; j < m; j++) {
                    rMat[x][j] = Double.parseDouble(tempArr[j]);
                }
            }
            double[][] testMat = new double[k][k];
            int count = 0;
            for (int l = 0; l < rMat.length - k + 1; l++) {
                for (int r = 0; r < rMat[l].length - k + 1; r++) {
                    for (int o = 0; o < k; o++) {
                        for (int j = 0; j < k; j++) {
                            testMat[o][j] = rMat[l + o][r + j];
                        }
                    }
                    if (solution(xMat, yMat, testMat, k)) count++; //행렬 R에서 만들 수 있는 모든 행렬들을 검사합니다.
                }
            }
            System.out.println(count);
        }
    }

    public static void printArr(int[][] arr) {
        //print array to check answers
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + " ");
            }
        }
    }

    public static boolean solution(double[][] xMat, double[][] yMat, double[][] zMat, int k) {
        //xz = y
        double[] v = new double[k];
        while (--k > 0) {
            randomize(v);
            double[] expected = product(v, yMat);
            double[] result = product(product(v, zMat), xMat);

            if (!Arrays.equals(expected, result)) return false;
        }
        return true;
    }

    public static double[] product(double[] v, double[][] mat) {
        int N = mat.length;
        int[] vector = new int[N];
        for (int i = 0; i < N; i++) for (int j = 0; j < N; j++) vector[i] += v[j] * mat[i][j];
        return v;
    }


    public static void randomize(double[] v) {
        //random v 행열을 만들어줍니다.
        for (int i = 0; i < v.length; i++) {
            v[i] = (Math.random() < 0.5) ? 0 : 1; //0과 1 중 하나의 수를 저장합니다.
        }
    }
}
