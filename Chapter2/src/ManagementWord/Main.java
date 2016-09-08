package ManagementWord;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Input document: ");
		try {
			
			String doc  = input.readLine();
			Document document = new Document(doc);
			
			int cont = 1;
			while(cont == 1){
				System.out.println("1.Print information of documnet");
				System.out.println("2.Search by word");
				System.out.println("3.Exit");
				System.out.println("Please choice 1 or 2 or 3");
				int choice = Integer.parseInt(input.readLine());
				
				switch (choice) {
				
					case 1:
						document.printInformationItems();
						break;
					
					case 2:
						System.out.println("Input word want to search: ");
						String word = input.readLine();
						document.searchByKey(word);
						break;
					
					case 3:
						cont = 0;
						break;
						
					default:
						System.out.println("Invalid choice");
				}
			}
			
		} catch (IOException | NumberFormatException | InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

}
