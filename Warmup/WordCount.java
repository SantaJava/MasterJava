package Warmup;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class WordCount {

	int count = 0;
	Map<String, Integer> map = new HashMap<>();

	public WordCount() {
		super();
	}

	public void importWord() {

		File file = new File("C:/temp/spaceX.txt");

		try {
//			 Scanner sc = new Scanner(new FileReader(file));
//			 while (sc.hasNextLine()) {
//			 System.out.println(sc.nextLine());
//			 }

			BufferedReader br = new BufferedReader(new FileReader(file));
			String st;
			while ((st = br.readLine()) != null) {
				//System.out.println(st);
				LineAnalyze(st);
			}
			System.out.println("Total: " + count);
			System.out.println("================");

		} catch (Exception e) {
			e.printStackTrace();
		}		
		printMap();
	}

	public void LineAnalyze(String line) {

		StringTokenizer tokenizer = new StringTokenizer(line, " ");
		while (tokenizer.hasMoreTokens()) {
			String word = tokenizer.nextToken().toLowerCase();
			count(word);
			count++;
		}
	}

	public void count(String word) {
		// System.out.println(word);

		if (!map.containsKey(word)) {
			map.put(word, 1);
		} else {
			int a = map.get(word);
			a++;
			map.put(word, a);
		}
	}
	
	public void printMap() {
		for(String key : map.keySet()) {
			System.out.print("word: " + key + "   ");
			System.out.println("count: " + map.get(key));
			System.out.println();
		}
	}
	
	public void DescendingSorting() {
		//max: 현재 가장 많이 나온 숫자의 개수.
		List<String> list = new ArrayList<>(map.keySet());
		
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String st1, String st2) {
				return st1.compareTo(st2);
			}
			
		});
		
		for(String word : list) {
			System.out.println("word : " + word);
			System.out.println("Count: " + map.get(word));
		}
		
//		int max = 0;
//		for(String key : map.keySet()) {
//			if(max <= map.get(key)) {
//				max = map.get(key);
//			}
//		}
	}
	
}
