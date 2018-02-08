import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		Map<String, Integer>map = new HashMap<String, Integer>();
		//°´Ã¼ ÀúÀå 
		map.put("½Å¿ë±Ç", 85);
		map.put("Greck", 39);
		map.put("½Å¿ë±Ç", 55);
		map.put("Melissa", 26);
		System.out.println("ÃÑ Entry ¼ö: " + map.size());
		
		//°´Ã¼ Ã£±â
		if(map.containsKey("Melissaa2")){
		System.out.println("\t Melissa: " + map.get("Melissaa2"));
		System.out.println();
		}else {
			System.out.println("The key You have provided doesn't exist.");
		}
		//°´Ã¼¸¦ ÇÏ³ª¾¿ Ã³¸® 
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t key: " + key + " value: "+value);
		}
		
		for(String key : keySet) {
			Integer value = map.get(key);
			System.out.println("\t key: " + key + "value: " + value);
		}
		
		//int value = map.get("melissaa");  nullpointerexception
			
		System.out.println();
		//°´Ã¼»èÁ¦
		map.remove("Greck");
	
		System.out.println("ÃÑ Entry ¼ö: " + map.size());
	}
}

