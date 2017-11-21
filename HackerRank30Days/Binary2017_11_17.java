import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String N = Integer.toBinaryString(n);
        char[] newCharArray = N.toCharArray();
        int maxNum = 0;


        int cnt = 0;
        for (int a = 0; a < N.length(); a++) {

            if (newCharArray[a] == '1') {
                cnt++;

            }
            if (newCharArray[a] == '0') {
                cnt = 0;
            }
// remember that if it doesn't go through the second if, it is going to keep proceed to the last if.
            if (maxNum < cnt) {
                maxNum = cnt;
            }
        }

        System.out.println(maxNum);

    }
}
