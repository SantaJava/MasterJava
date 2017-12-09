/**
 * Created by Melissa on 12/9/17.
 * method 1.
 */
public class stackABC1 {
    public static void solution(String input) {
        StringBuffer sb = new StringBuffer();
        int cnt = 0;
        int i = 0;


        //if input.charAt(i) 가 문자일 때
        if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
            for (i = 0; i < input.length() - 1; i++) {
                if (input.charAt(i) == input.charAt(i + 1)) {
                    cnt++;
                }
                if (input.charAt(i) != input.charAt(i + 1)) {
                    if (cnt != 0) {
                        sb.append(cnt + 1);
                    }
                    sb.append(input.charAt(i));
                    cnt = 0;
                }

            }
            if (i == input.length() - 1) {
                sb.append(cnt + 1);
                sb.append(input.charAt(i));
            }

            System.out.print(sb);
        }
    }


    public static void main(String[] args) {
        solution("MMMMMEELLLISSAAA");

    }
}

