package Kakao;

import java.util.*;

public class shuffle {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine()); //전체 테스트 케이스 개수를 받습니다.

        for (int i = 0; i < T; i++) { //테스트 케이스 개수 만큼 iteration을 돌립니다.
            String[] songList = sc.nextLine().split("\t");
            //  System.out.println(songList[songList.length - 1]); //마지막 단어를 비교해서 제대로 배열에 들어갔는지 확인했습니다.
            String[] artistList = sc.nextLine().split("\t");
            // System.out.println(artistList[artistList.length - 1]);

            Map<String, ArrayList<String>> map = new HashMap<>(); //키값(아티스트 이름) 에 따라 곡을 저장하기 위해 Map을 만들었습니다. 주신 Spotify의 예제를 구현하기 위한 자료형으로 Array와 listArray중 고민하다가, 빈 공간을 최소화 할 수 있는 ArrayList로 구현하기로 결정했습니다.

            for (int j = 0; j < songList.length; j++) { //생성한 ArrayList에 키값과 음악명을 담아줍니다.
                if (map.containsKey(artistList[j])) { //키값이 있을 경우 value 를 기존 키값에 추가해 줍니다.
                    map.get(artistList[j]).add(songList[j]);
                } else {
                    ArrayList<String> array = new ArrayList<>(); //key값이 없을 경우 새로운 키값을 만듭니다.
                    array.add(songList[j]);
                    map.put(artistList[j], array);
                }
            }

            Set set = map.keySet();
            String[] shufflebin = new String[set.size()]; //셔플 기능을 구현하기 위해 key 값만 담은 String Array를 만듭니다.

            Iterator iterator = set.iterator();
            int c = 0;
            int max = 0; //iteration 을 돌리면서 가장 큰 리스트의 값을 찾습니다. (가장 많은 음악을 가진 작곡가의 음악 수)
            while (iterator.hasNext()) {
                String key = (String) iterator.next();
                shufflebin[c] = key;
                Collections.shuffle(map.get(key)); // 한 작가의 음악이 입력된 순서대로 나오지 않도록 음악 리스트도 shuffle 해 줍니다.
                max = Math.max(max, map.get(key).size());
                c++;
                //   System.out.println("hashmap key: " + key + "  value : " + map.get(key) + "  value size : " + map.get(key).size());
            }

            Collections.shuffle(Arrays.asList(shufflebin)); //키값을 섞습니다.

            while (max >= 0) { //가장 긴 리스트의 길이만큼만 iteration을 돌려줍니다.
                for (String s : shufflebin) { //shufflebin에 담긴 키 값에 해당하는 리스트 내용을 순서대로 출력합니다.
                    if (!map.get(s).isEmpty()) {
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
        }
    }
}
