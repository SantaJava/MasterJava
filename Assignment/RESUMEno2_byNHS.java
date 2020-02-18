package Assignment;

public class PreTest {

public static void main(String[] args) {
String[] number = {"일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
        String[] unit = {"", "십", "백", "천", "만"};

        String input = args[0];

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                System.out.print(unit[input.length() - i - 1]);
                if (i == input.length() - 1) {
                    System.out.print("일");
                }
            } else {
                if (input.charAt(i) != '0') {
                    System.out.print(number[input.charAt(i) - 49] + unit[input.length() - i - 1]);
                }
            }
        }
    }

}
