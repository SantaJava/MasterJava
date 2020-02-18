package Assignment;

import java.util.Stack;

/**
 * Created by Melissa on 12/11/17.
 */
class Palindrome {

    public static boolean solution(String input) {
        Boolean isP = true;
        Stack<Character> stack = new Stack<Character>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            stack.push(a);
        }

        while (stack.isEmpty() == false) {
            sb.append(stack.pop());
        }
        System.out.print(String.valueOf(sb));


        if (input.equals(String.valueOf(sb))){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.print(solution("POOP"));
    }
}
