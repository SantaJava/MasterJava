package NTS;

/**
 * Created by Melissa on 12/9/17.
 */
public class stacABC_reverse {
    public static void solution2(String input){
        StringBuffer sb2 = new StringBuffer();
        int i = 0;
        int cnt = 0;
        int chrcnt = 0;

        for(i = 0; i < input.length() ; i++){
            if(input.charAt(i) > '0' && input.charAt(i) <= '9'){
                for(cnt = 0; cnt < input.charAt(i) -'0'; cnt++){
                  chrcnt = 0;
                  sb2.append(input.charAt(i+1));
                }
            }
            cnt = 0;
            if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z'){
                chrcnt ++;
                if(i == 0){
                    sb2.append(input.charAt(0));
                }
            }
            if(chrcnt >= 2){
                sb2.append(input.charAt(i));
            }
        }
        System.out.print(sb2);
    }
    public static void main(String[] args) {
        solution2("M3ELI2S5A");
    }
}
