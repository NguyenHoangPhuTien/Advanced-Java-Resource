package ManagerLibrary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;

public class MainManagerLibraryTest {

	public static void main(String[] args) {
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			int cont = 1;
			TextBook[] listText = new TextBook[0];
			ReferenceBook[] listReference = new ReferenceBook[0];
			double moneyNewBook = 0;
			double moneyOldBook = 0;
			double moneyRefe = 0;
			while(cont == 1){
				System.out.println("Input code of book: ");
				String code = buff.readLine();
				System.out.println("Input manufacturer: ");
				String manufacturer = buff.readLine();
				System.out.println("Input name of book: ");
				String name = buff.readLine();
				System.out.println("Input day of import");
				String dateImport = buff.readLine();
				System.out.println("Input quantity: ");
				int quantity = Integer.parseInt(buff.readLine());
				System.out.println("Input price: ");
				double price = Double.parseDouble(buff.readLine());
				System.out.println("1.Text Book");
				System.out.println("2.Reference Book");
				System.out.println("Please choice option");
				int choiceBook = Integer.parseInt(buff.readLine());
				switch(choiceBook){
					case 1:
						System.out.println("1.New");
						System.out.println("2.Old");
						System.out.println("Please choice option (1 or 2)");
						int choiceStatus = Integer.parseInt(buff.readLine());
						if(choiceStatus == 1){
							TextBook text = new TextBook(code, name, dateImport, price, quantity, manufacturer, "New");
							moneyNewBook += text.findMoney();
							listText = Arrays.copyOf(listText, listText.length + 1);
							listText[listText.length - 1] = text;
						}
						else if(choiceStatus == 2){
							TextBook text = new TextBook(code, name, dateImport, price, quantity, manufacturer, "Old");
							moneyOldBook += text.findMoney();
							listText = Arrays.copyOf(listText, listText.length + 1);
							listText[listText.length - 1] = text;
						}
						else
							System.out.println("Please choice 1 or 2");
						break;
					case 2:
						System.out.println("Input tax: ");
						double tax = Double.parseDouble(buff.readLine());
						ReferenceBook refe = new ReferenceBook(code, name, dateImport, price, quantity, manufacturer, tax);
						moneyRefe += refe.findMoney();
						listReference = Arrays.copyOf(listReference, listReference.length + 1);
						listReference[listReference.length - 1] = refe;
						break;
					default:
						System.out.println("Please choice 1 or 2");
				}
				System.out.println("1.Continue");
				System.out.println("2.Quit");
				System.out.println("Please choice 1 or 2");
				int choiceCont = Integer.parseInt(buff.readLine());
				if(choiceCont != 1)
					cont = 0;
			}
			if(listText.length > 0){
				for(TextBook text : listText)
					System.out.println(text.toString());
				if(moneyNewBook > 0)
					System.out.println("Money of new book: " + moneyNewBook);
				if(moneyOldBook > 0)
					System.out.println("Money of old book: " + moneyOldBook);
			}
			if(listReference.length > 0){
				int size = 0;
				double sum = 0;
				for(ReferenceBook refe : listReference){
					System.out.println(refe.toString());
					size++;
				}	
				System.out.println("Money of reference book: " + moneyRefe);
				System.out.println("Average money of reference book: " + (moneyRefe / size));
			}
		} catch (IOException |NumberFormatException | InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

}
