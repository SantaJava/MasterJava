import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class MapExample {
	public static void main(String[] args) {
		String str = "name=홍길동&email=hong@naver.com&age=20";
		Map<String, String> map = new HashMap<>();
		StringTokenizer tokenizer = new StringTokenizer(str, "&");
		
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			// String 의 split으로 key, value 분리.
			String[] items = token.split("=");
			map.put(items[0], items[1]);
		}
		// 분석데이터 출력.
		// Set<String> keySet = map.keySet(); //가동성 때문에 keySet으로 만든다. 
		for (String key : map.keySet()) { // 왜 set?
			String value = map.get(key);
			System.out.println("[" + key + "]" + value);
		}
	}
}
