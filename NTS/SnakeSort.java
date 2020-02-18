/**
 * Created by Melissa on 12/8/17.
 */
public class tryTwo {
    public static void findCapital(String input){
    StringBuffer sb = new StringBuffer(input);
    int i = 0;
        int point = 0;

        for(i = 0; i < sb.length() ; i++){

            if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z'){

                //System.out.print(sb.charAt(i));
                char ch = sb.charAt(i);

                sb.replace(i, i+1, String.valueOf((char) (ch + 32)));
                if(i != 0){
                sb.insert(i,'_');
                point++;
                i = point;}

            }
        }
        System.out.println(sb.toString());

    }
    public static void main(String[] args) {
        findCapital("MineCraftWorld");

    }
}

