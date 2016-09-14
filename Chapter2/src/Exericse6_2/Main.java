package Exericse6_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;



public class Main {

	// Read content of file
	public static String readFile() {

		String s = "";
		String temp = "";
		try {
			BufferedReader in = new BufferedReader(new FileReader(
					"src/Exericse6_2/document.txt"));
			while ((temp = in.readLine()) != null) {
				s += temp + " ";
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return s;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String s = readFile();
		HashMap<String, Integer> list = new HashMap<>();
		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if(!list.containsKey(arr[i]))
				list.put(arr[i], 1);
			else {
				int count = list.get(arr[i]);
				list.replace(arr[i], count + 1);
			}
		}
		
		System.out.println("1.Print word");
		System.out.println("2.Search");
		int choice = Integer.parseInt(input.readLine());
		switch(choice){
			case 1:
				for(String key: list.keySet()){
					System.out.println(key + " " + list.get(key));
				}
				break;
			case 2:
				System.out.println("Input word want to search: ");
				String search = input.readLine();
				if(list.containsKey(search))
					System.out.println("This word is exists");
				else
					System.out.println("This word not exists");
				break;
			default:
				System.out.println("Invalid choice");
		}
	}

}
