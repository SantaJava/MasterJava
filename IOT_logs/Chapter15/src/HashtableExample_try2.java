import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample_try2 {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();

		map.put("spring", "10");
		map.put("summer", "11");
		map.put("fall", "12");
		map.put("winter", "13");

		Scanner sc = new Scanner(System.in);
		int i = 0;

		for (; i < 3; i++) {

			System.out.println("Type in your ID and Password");
			System.out.println("ID: ");
			String id = sc.nextLine();

			System.out.println("PASSWORD: ");
			String password = sc.nextLine();
			System.out.println();

			if (map.containsKey(id)) {
				if (map.get(id).equals(password)) {
					System.out.println("Log-in Complete");
					break;
				} else {
					System.out.println("Password is incorrect");

				}
			} else {
				System.out.println("Id is incorrect. try again.");
			}
			if(i >= 2) {
				System.out.println("I'm sorry but you have attempted more than 3 times to log-in. Please contact the Customer Center.");
			}
		}
	}
}
