package ManagementContact;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contact con1 = new Contact("001", "tien");
		Contact con2 = new Contact("002", "hau");
		Contact con3 = new Contact("003", "tien");
		Contact con4 = new Contact("003", "hau");
		ArrayList<Contact> list = new ArrayList<>();
		list.add(con1);
		list.add(con2);
		list.add(con3);
		list.add(con4);
		ManageContact manageContact = new ManageContact(list);
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			int cont = 1;
			while(cont == 1){
				System.out.println();
				System.out.println("=======================================");
				System.out.println("1.View all contact");
				System.out.println("2.Add new contact");
				System.out.println("3.Search contact by name");
				System.out.println("4.Search contact by phone");
				System.out.println("5.Delete contact by name");
				System.out.println("6.Delete contact by phone");
				System.out.println("7.Update contact by name");
				System.out.println("8.Exit");
				
				System.out.println("Please choice option");
				int choice = Integer.parseInt(input.readLine());
				
				switch (choice) {
				
					case 1:
						manageContact.printAllContact();
						break;

					case 2:
						System.out.println("Input name: ");
						String name = input.readLine();
						System.out.println("Input phone: ");
						String phone = input.readLine();
						Contact cont5 = new Contact(phone, name);
						manageContact.addContact(cont5);
						break;
						
					case 3:
						System.out.println("Input name for search: ");
						String name1 = input.readLine();
						manageContact.printSomeContact(manageContact.searchContactByName(name1));
						break;
						
					case 4:
						System.out.println("Input phone for search: ");
						String phone1 = input.readLine();
						manageContact.printSomeContact(manageContact.searchContactByPhone(phone1));
						break;
						
					case 5:
						System.out.println("Input name for delete: ");
						String name2 = input.readLine();
						manageContact.deleteContactByName(name2);
						break;
						
					case 6:
						System.out.println("Input phone for delete: ");
						String phone2 = input.readLine();
						manageContact.deleteContactByPhone(phone2);
						break;
					
					case 7:
						System.out.println("Input name for update");
						String name3= input.readLine();
						manageContact.UpdateContactByName(name3);
						break;
					
					case 8:
						cont = 0;
						break;
					default:
						System.out.println("Invalid choice");	
				}
			}
			
		} catch (NumberFormatException | IOException |InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		
	
	}

}
