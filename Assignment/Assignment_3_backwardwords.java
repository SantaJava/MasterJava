import java.util.Stack;

/**
 * Created by Melissa on 12/11/17.
 */
public class Assignment_3_stack {
    public static void solution(String input) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            stack.push(a);
        }
        while(stack.isEmpty() == false){
            System.out.print(stack.pop());
        }

    }

    public static void main(String[] args) {
        solution("abcde");
    }
}
