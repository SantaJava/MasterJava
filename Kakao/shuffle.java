package Kakao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class shuffle {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < T; i++) {
            String[] songList = sc.nextLine().split("\t");
          //  System.out.println(songList[songList.length - 1]);
            String[] artistList = sc.nextLine().split("\t");
           // System.out.println(artistList[artistList.length - 1]);

            Map<String, ArrayList<String>> map = new HashMap<>();

            //System.out.println(map.values());
            for (int j = 0; j < songList.length; j++) {
                if (map.containsKey(artistList[j])) { //키값이 있을 경우 value 를 기존 키값에 추가해 줍니다.
                    map.get(artistList[j]).add(songList[j]);
                } else {
                    ArrayList<String> array = new ArrayList<>(); //key값이 없을 경우 새로운 키값을 만듭니다.
                    array.add(songList[j]);
                    map.put(artistList[j], array);
                }
            }

            Set set = map.keySet();

            String[] shufflebin = new String[set.size()]; //셔플 기능을 구현할 key 값만 담은 Array를 만듭니다.

            Iterator iterator = set.iterator();
            //System.out.println(set.size());
            int c = 0;
            int max = 0; //iteration 을 돌리면서 가장 큰 리스트의 값을 찾는다.
            while (iterator.hasNext()) {
                String key = (String) iterator.next();
                shufflebin[c] = key;
                Collections.shuffle(map.get(key)); // 한 작가의 음악이 입력된 순서대로 나오지 않도록 음악 리스트를 shuffle 합니다.
                max = Math.max(max, map.get(key).size());
                c++;
                //   System.out.println("hashmap key: " + key + "  value : " + map.get(key) + "  value size : " + map.get(key).size());
            }

            Collections.shuffle(Arrays.asList(shufflebin)); //키값을 섞습니다.
            int count = 0;
            while (max >= 0) {
                for (String s : shufflebin) {
                    if (!map.get(s).isEmpty()) {
                        count++;
                        if (max == 0) {
                            System.out.print(map.get(s).get(0));
                        } else {
                            System.out.print(map.get(s).get(0) + "\t");
                        }
                        map.get(s).remove(0);
                    }
                }
                max--;
            }
            System.out.println();
            // System.out.println(count);
        }
    }
}
