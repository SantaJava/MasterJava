package properties;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws Exception{
		Properties properties = new Properties();
		// 이 클래스가 실제로 어디에 존재하는가?
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");
		properties.load(new FileReader(path));

		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String realname = properties.getProperty("realname");

		System.out.println("driver: " + driver);
		System.out.println("url: " + url);
		System.out.println("username: " + username);
		System.out.println("password: " + password);
		System.out.println("realname: " + realname);
	}
}
