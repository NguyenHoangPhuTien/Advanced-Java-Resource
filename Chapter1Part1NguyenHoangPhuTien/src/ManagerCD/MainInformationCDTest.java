package ManagerCD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class MainInformationCDTest {

	
	public static void main(String[] args) {
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			String cont = "yes";
			while (cont.equals("yes") || cont.equals("y")){
				System.out.println("Input code of CD: ");
				String code = buff.readLine();
				System.out.println("Input name of CD: ");
				String name = buff.readLine();
				System.out.println("Singer: ");
				String singer = buff.readLine();
				System.out.println("Number of song: ");
				int number = Integer.parseInt(buff.readLine());
				if(number <= 0)
					System.out.println("Number of song can not be less or equal 0");
				else{
					System.out.println("Input price of product: ");
					double price = Double.parseDouble(buff.readLine());
					if(price <= 0)
						System.out.println("Price of CD can not be less or equal 0");
					else{
						CD cd = new CD(code, name, singer, number, price);
						System.out.println("Information of CD: "+ cd.toString());
					}
				}
				System.out.println("Do you want to continue ? (yes/no)");
				cont = buff.readLine().toLowerCase();
			}
			
			
		} catch (IOException | NumberFormatException | InputMismatchException e) {
			e.printStackTrace();
		}
	}

}
