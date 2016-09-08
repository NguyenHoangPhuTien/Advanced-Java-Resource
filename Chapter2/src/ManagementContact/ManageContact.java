package ManagementContact;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 * Nguyen Hoang Phu Tien
 * Version : 1.0
 * Date : 7/9/2016
 * Class for manage contact
 * Contact maybe duplicate numberphone and name
 */

public class ManageContact {
	
	ArrayList<Contact> list;

	public ManageContact() {
		super();
	}

	public ManageContact(ArrayList<Contact> list) {
		super();
		this.list = list;
	}

	public ArrayList<Contact> getList() {
		return list;
	}

	public void setList(ArrayList<Contact> list) {
		this.list = list;
	}
	
	/*
	 * Check duplicate contact
	 * Param: contact
	 * Return result as a boolean type
	 */
	public boolean chekDuplicate(Contact contact){
		
		boolean result = false;
		for(Contact contact1 : list){
			if(contact1.equals(contact)){
				result = true;
				break;
			}	
		}
		return result;
	}
	
	/*
	 * Add new contact
	 * param : contact
	 */
	public void addContact(Contact contact){
		
		if(chekDuplicate(contact))
			System.out.println("Contact already exsits");
		else{
			list.add(contact);
			System.out.println("Add new contact success");
			setList(list);
		}
	}
	
	/*
	 * Search all contact by name
	 * param : name want to search
	 */
	public List<Contact> searchContactByName(String name){
		
		List<Contact> listContact = new ArrayList<>();
		for(Contact cont : list){
			if(cont.name.indexOf(name) >= 0)
				listContact.add(cont);
		}
		return listContact;
	}
	
	/*
	 * Search all contact by phone
	 * param : phone want to search
	 */
	public List<Contact> searchContactByPhone(String phone){
		
		List<Contact> listContact = new ArrayList<>();
		for(Contact cont : list){
			if(cont.numberPhone.equals(phone))
				listContact.add(cont);
		}
		return listContact;
	}
	
	/*
	 * Print some contact 
	 * param : list of contact want to print
	 */
	public void printSomeContact(List<Contact> listContact){
		for(Contact cont : listContact)
			cont.displayInformation();
	}
	
	/*
	 * Delete contact by name
	 */
	public void deleteContactByName(String name) throws NumberFormatException, IOException{
		List<Contact> listTemp = new ArrayList<>();
		for(Contact cont : list){
			if(cont.name.equals(name.toLowerCase())){
				cont.displayInformation();
				System.out.println("Want to delete");
				System.out.println("1.Yes");
				System.out.println("2.No");
				System.out.println("Please choice 1 or 2");
				int choice = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
				
				switch (choice) {
				
					case 1:
						listTemp.add(cont);
						break;

					default:
				}
			}
		}
		list.removeAll(listTemp);
	}
	
	/*
	 * Delete contact by phone
	 */
	public void deleteContactByPhone(String phone) throws NumberFormatException, IOException{
		List<Contact> listTemp = new ArrayList<>();
		for(Contact  cont : list){
			if(cont.numberPhone.equals(phone.toLowerCase())){
				cont.displayInformation();
				System.out.println("Want to delete");
				System.out.println("1.Yes");
				System.out.println("2.No");
				System.out.println("Please choice 1 or 2");
				int choice = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
				
				switch (choice) {
				
					case 1:
						listTemp.add(cont);
						break;

					default:
				}
			}
			
		}
		list.removeAll(listTemp);
	}
	
	/*
	 * Update Contact by name
	 */
	public void UpdateContactByName(String name) throws NumberFormatException, IOException{
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;
		for(Contact  cont : list){
			if(cont.name.equals(name.toLowerCase())){
				cont.displayInformation();
				System.out.println("Want to Update");
				System.out.println("1.Yes");
				System.out.println("2.No");
				System.out.println("Please choice 1 or 2");
				int choice = Integer.parseInt(input.readLine());
				
				switch (choice) {
				
					case 1:
						System.out.println("Input name want to update: ");
						String name1 = input.readLine();
						Contact cont1 = list.get(i);
						cont.setName(name1);
						break;

					default:
				}
			}
			i++;	
		}
	}
	
	/*
	 * Print all information contacts
	 */
	public void printAllContact(){
		
		for(Contact cont : list)
			cont.displayInformation();
	}
}
