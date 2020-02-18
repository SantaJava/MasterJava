package HackerRank30Days;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution6 {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sortTime = 0;
        int count=0;
        int n = in.nextInt();
        int t;
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
  
        
        for(int i = n-2 ; i>=0 ; i--){
            for(int j = 0; j<= n-2 ; j++){
                count = 0;
                if(a[j] > a[j+1]){
                    t = a[j];
                    a[j] = a[j+1];
                    a[j+1]= t;
                    sortTime++;
                    count++;
                }
            }
          //  if(count ==0){
           //     break;
           // }
        }
        
        System.out.println("Array is sorted in " + sortTime + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
        
        // Write Your Code Here
    }

}
