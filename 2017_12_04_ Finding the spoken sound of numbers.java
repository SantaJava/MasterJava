import java.util.Scanner;

class Solution {
    public static void main(String[] args) {        
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        char[] newCharArray = a.toCharArray();
        int newCharArrSize = newCharArray.length;
        //int i = newCharArrSize -1 ;
        char[] TenSqure = {' ', '십', '백', '천', '만'};
        char[] OneSpace = {'영', '일', '이', '삼', '사', '오', '육', '칠', '팔', '구'};
        int i = 0;
        int num = 0;
        int index =0;
        for (; i < newCharArrSize; i++) {
            num = newCharArray[i] - '0';
            index = newCharArrSize - i - 1;
            if (num != 0 && num != 1) {

                System.out.print(OneSpace[num]);
                System.out.print(TenSqure[index]);
            }
            if (num== 1) {
                if (index != 0)
                    System.out.print(TenSqure[index]);
            }
        }
        if (newCharArray[newCharArrSize - 1] - '0' == 1) {
            System.out.print("일");            
        }
    }
}
