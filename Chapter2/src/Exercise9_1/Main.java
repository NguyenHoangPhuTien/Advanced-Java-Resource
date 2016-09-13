package Exercise9_1;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {

	/*
	 * Get a hash map with key and value by language
	 * Param : language, country, resource of file properties
	 * Return result as hash map 
	 */
	public static HashMap<String, String> getLanguage(String resource, String language, String country){
		
		HashMap<String, String> list = new HashMap<>();
		Locale currentLocal = new Locale(language, country);
		
		ResourceBundle message = ResourceBundle.getBundle(resource, currentLocal);
		
		Enumeration<String> keys = message.getKeys();
		while(keys.hasMoreElements()){
			String key = keys.nextElement();
			String value = message.getString(key);
			list.put(key, value);
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.VietNamese");
		System.out.println("2.English");
		System.out.println("Please choice language");
		int choice = scan.nextInt();
		HashMap<String, String> list = null;
		switch(choice){
			case 1:
				list = getLanguage("Exercise9_1/resource_vi_VN_Window", "vi", "VN");
				break;
			case 2:
				list = getLanguage("Exercise9_1/resource_en_US", "en", "US");
				break;
		}
		for(String key : list.keySet()){
			System.out.println(key + ": " + list.get(key));
		}
	}

}
