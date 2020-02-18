/**
 * Created by Melissa on 12/9/17.
 */
public class StringToSum {
    public static void Sum(String a, String b){
     int A = Integer.valueOf(a);
        int B = Integer.valueOf(b);
        int sum = A+B;
        System.out.println(sum);

    }

    public static void main(String[] args) {

        Sum("50","20");

    }
}
