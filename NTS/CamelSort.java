package NTS;

/**
 * Created by Melissa on 12/9/17.
 */
class tryThree {
        public static void findCapital(String input){
            StringBuffer sb = new StringBuffer(input);
            int i = 0;

            //char[] newCharArray = input.toCharArray();
            for(i = 0; i < sb.length() ; i++){

                if( sb.charAt(i) == 95){
                    char ch = sb.charAt(i+1);

                    //System.out.print(sb.charAt(i));
                    sb.delete(i, i + 2);
                    sb.insert(i, String.valueOf((char)(ch - 32)));
                    i--;
                }
            }
            System.out.println(sb);
        }

        public static void main(String[] args) {
            findCapital("mine_craft_world");

        }

    }
