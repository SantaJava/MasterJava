package Assignment;

//에라토스테네스의 체(소수 구하기)
class Solution {
    public static void main(String[] args) {
        boolean[] num = new boolean[100];
        for (int i = 2; i < num.length; i++) {
            num[i] = true;
        }
        for (int i = 2; i < num.length; i++) {
            int k = 2;
            for (int index = i * k; index < num.length; index = i * k++) {
                if (num[index]) {
                    num[index] = false;//소수가 아닌것을 표시
                }
            }
        }
        for (int i = 2; i < num.length; i++) {
            if (num[i] == true) {
                System.out.print(i + " ");
            }
        }
    }
}
