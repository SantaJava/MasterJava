/**
 * Created by Melissa on 12/22/17.
 */
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                String S = in.next();

        try {
            int a = Integer.valueOf(S);
            System.out.println(a);

        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }


    }
}
