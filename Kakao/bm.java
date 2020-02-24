package Kakao;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bm {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        double xMat[][]; //X 행렬
        double yMat[][]; //Y 행렬
        double rMat[][]; //R 행렬
        int n = 0;
        int m = 0;
        int k = 0;

        for (int i = 0; i < T; i++) {
            String[] inputArr = br.readLine().split(" ");
            n = Integer.parseInt(inputArr[0]);
            m = Integer.parseInt(inputArr[1]);
            k = Integer.parseInt(inputArr[2]);
            xMat = new double[k][k];
            yMat = new double[k][k];
            rMat = new double[n][m];

            //이중 행렬 x,y값을 저장한다.
            for (int x = 0; x < k; x++) {
                String[] tempArr = br.readLine().split(" ");
                for (int j = 0; j < k; j++) {
                    xMat[x][j] = Double.parseDouble(tempArr[j]);
                }
            }
            for (int x = 0; x < k; x++) {
                String[] tempArr = br.readLine().split(" ");
                for (int j = 0; j < k; j++) {
                    yMat[x][j] = Double.parseDouble(tempArr[j]);
                }
            }
            for (int x = 0; x < n; x++) {
                String[] tempArr = br.readLine().trim().split(" ");
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
                    if(solution(xMat, yMat, testMat, k)) count++;
                }
            }
            System.out.println(count+1);
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

    public static boolean solution(double[][] xMat, double[][] yMat, double[][] testMat, int k) {

        double[][] r = new double[k][1];
        Random random = new Random();
        for (int i = 0; i < k; i++) {
            r[i][0] = random.nextInt(2);
        }

        double tr[][] = new double[k][1];
        double yr[][] = new double[k][1];
        double xtr[][] = new double[k][1];

        tr = multiply(testMat, r, k);
        yr = multiply(yMat, r, k);
        xtr = multiply(xMat, tr, k);

        boolean result = true;

        for (int i = 0; i < k; i++) {
            if (xtr[i][0] == 0) {
                continue;
            } else {
                result = false;
            }
        }

        return result;
    }

    public static double[][] multiply(double[][] x, double[][] y, int k) {
        double result[][] = new double[k][1];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < 1; j++) {
                for (int z = 0; z < k; z++) {
                    result[i][j] = result[i][j] + x[i][z] * y[z][j];
                }
            }
        }
        return result;
    }
}
