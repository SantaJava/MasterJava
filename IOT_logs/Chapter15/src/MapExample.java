import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class MapExample {
	public static void main(String[] args) {
		String str = "name=ȫ�浿&email=hong@naver.com&age=20";
		Map<String, String> map = new HashMap<>();
		StringTokenizer tokenizer = new StringTokenizer(str, "&");
		
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			// String �� split���� key, value �и�.
			String[] items = token.split("=");
			map.put(items[0], items[1]);
		}
		// �м������� ���.
		// Set<String> keySet = map.keySet(); //������ ������ keySet���� �����. 
		for (String key : map.keySet()) { // �� set?
			String value = map.get(key);
			System.out.println("[" + key + "]" + value);
		}
	}
}
