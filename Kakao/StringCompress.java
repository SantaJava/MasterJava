package Kakao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StringCompress {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        int answer = solution(s);
        System.out.println(answer);
    }

    public static int solution(String s) {
        int answer = s.length();
        for (int i = 1; i <= s.length() / 2; i++) { // i 는 단위.
            int result = check(s, i);
            if (result < answer) answer = result;
        }
        return answer;
    }

    public static int check(String s, int size) {
        String result = "";
        List<String> words = new ArrayList<String>();
        int exist = s.length() % size; //나누고 나머지 글자 수를 붙이면 된다.
        for (int i = 0; i <= s.length() - size; i += size) {
            words.add(s.substring(i, i + size));
        }
        int cnt = 1;

        //list 대상으로 비교 작업
        for (int i = 0; i < words.size() - 1; i++) {
            if (words.get(i).equals(words.get(i + 1))) { //값이 같은 경우
                cnt++;
            } else { //값이 다른 경우
                if (cnt > 1) result = result + String.valueOf(cnt) + words.get(i); //새로운 string에 생성
                else result += words.get(i);
                cnt = 1; //cnt값 초기화
            }
        }
        if (cnt > 1) result = result + String.valueOf(cnt) + words.get(words.size() - 1); //마지막 글자 카운트 하기.
        else result += words.get(words.size() - 1); //마지막 글자 카운트
        return result.length() + exist;
    }
}

