package Exercise9_2;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {

	/*
	 * Get a hash map with key and value by language Param : language, country,
	 * resource of file properties Return result as hash map
	 */
	public static HashMap<String, String> getLanguage(String resource,
			String language, String country) {

		HashMap<String, String> list = new HashMap<>();
		Locale currentLocal = new Locale(language, country);

		ResourceBundle message = ResourceBundle.getBundle(resource,
				currentLocal);

		Enumeration<String> keys = message.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			String value = message.getString(key);
			list.put(key, value);
		}
		return list;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("1.VietNamese");
		System.out.println("2.English");
		System.out.println("Please choice language");
		int choice = scan.nextInt();
		HashMap<String, String> list = null;
		switch (choice) {
		case 1:
			list = getLanguage("Exercise9_2/resource_vi_VN", "vi", "VN");
			int i = 1;
			for (String key : list.keySet()) {
				if (key.equals("yes") || key.equals("no"))
					continue;
				else
					System.out.println(i + "." + list.get(key));
				i++;
			}
			break;
		case 2:
			list = getLanguage("Exercise9_2/resource_en_US", "en", "US");
			int j = 1;
			for (String key : list.keySet()) {
				if (key.equals("yes") || key.equals("no"))
					continue;
				else
					System.out.println(j + "." + list.get(key));
				j++;
			}
			break;
		}

	}

}
