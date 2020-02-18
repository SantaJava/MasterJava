
class Assignment_1 {
    public static void primenumber(int input) {
        boolean decider;
        StringBuffer sb = new StringBuffer();

        for (int i = 2; i <= input; i++) {
            int right = 1;
            for (int j = 2; j < i; j++) {

                if (i % j == 0 && i != 2) {
                    right = 0;
                    break; //add break(fix)
                }
            }
            if (right == 1) {
                sb.append(i + " ");
            }
        }
        System.out.print(sb);
    }

    public static void main(String[] args) {
        primenumber(100);
    }
}
