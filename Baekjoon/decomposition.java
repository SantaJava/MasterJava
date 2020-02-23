package Baekjoon;

/*
백준 2231번 분해합 문제
어떤 자연수 N이 있을 때,  그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다.
어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다.
자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.
* */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class decomposition {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim()); //N
        int min = 0;
        //the biggest sum would be the limit of 1000,000
        for (int i = 0; i <= 1000000; i++) {
            char[] charList = Integer.toString(i).toCharArray();
            int sum = i;
            for (int j = 0; j <= charList.length - 1; j++) {
                sum = sum + Character.getNumericValue(charList[j]);
            }
            if (sum == N) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
