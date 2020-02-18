class Assignment_2 {
    public static void caesarCipher(String input, int num){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < input.length() ; i++){
            char x = input.charAt(i);
            //check for space
            if(x == 32){
                sb.append((char)32);
            }
             else if( 'z' - x < num){
                 sb.append((char)('a' + (num-('z'- x)-1)));
             }else{
                 sb.append((char)(x + num));
             }
        }
        System.out.println(sb);
    }

    public static void caesarDecipher(String input, int num){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < input.length() ; i++){
            char x = input.charAt(i);
            //check for space
            if(x == 32) {
                sb.append((char)32);
            }
            else if( x - num < 'a'){
                sb.append((char)('z' - (num-(x-'a')-1)));
            }else{
                sb.append((char)(x - num));
            }
        }
        System.out.println(sb);
    }



    public static void main(String[] args) {
        caesarCipher("melissa gu", 3);
        caesarDecipher("pholvvd jx", 3);
    }
}
