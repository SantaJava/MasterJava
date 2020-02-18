package HackerRank30Days;

import java.io.*;
import java.util.*;

public class Solution5 {
    // Write your code here. 
    Stack a = new Stack<Character>();
    Queue<Character> qe=new LinkedList<Character>();


     void pushCharacter(char c){
         a.push(c);
     }

     void enqueueCharacter(char c){
         qe.add(c);
     }

     char popCharacter(){
         return (char)a.pop();
     }

     char dequeueCharacter(){
         return qe.poll();

     }

 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution5 object:
        Solution5 p = new Solution5();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
