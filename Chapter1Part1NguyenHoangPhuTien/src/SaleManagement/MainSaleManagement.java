package SaleManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class MainSaleManagement {

	public static void main(String[] args) {
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			System.out.println("Input address: ");
			String address = buff.readLine();
			System.out.println("Input email: ");
			String email = buff.readLine();
			System.out.println("Input identity card number: ");
			String identity = buff.readLine();
			System.out.println("Input name: ");
			String name = buff.readLine();
			System.out.println("Input phone number");
			String phone = buff.readLine();
			
			List<Order> listOrder = new ArrayList<Order>();
			List<OrderDetail> listOrderDetail = new ArrayList<OrderDetail>();
			
			System.out.println("1.Egg");
			System.out.println("2.Tomato");
			System.out.println("3.Fish");
			System.out.println("Please choice 1 or 2 or 3");
			int choiceProduct = Integer.parseInt(buff.readLine());
			int quantity = 0;
			
			int contProduct = 1;
			while(contProduct == 1){
				/*
				 * switch choice : product will created and add to list order detail
				 */
				switch(choiceProduct){
					case 1:
						Product egg = new Product("Egg", 2000);
						System.out.println("Input quantity: ");
						quantity = Integer.parseInt(buff.readLine());
						OrderDetail eggs = new OrderDetail(quantity, egg);
						listOrderDetail.add(eggs);
						break;
					case 2:
						Product tomato = new Product("Tomato", 3000);
						System.out.println("Input quantity: ");
						quantity = Integer.parseInt(buff.readLine());
						OrderDetail tomatos = new OrderDetail(quantity, tomato);
						listOrderDetail.add(tomatos);
						break;
					case 3:
						Product fish = new Product("Fish", 10000);
						System.out.println("Input quantity: ");
						quantity = Integer.parseInt(buff.readLine());
						OrderDetail fishs = new OrderDetail(quantity, fish);
						listOrderDetail.add(fishs);
						break;
					default:
						System.out.println("Please choice 1 or 2 or 3");
				}
				/*
				 * 
				 */
			}
			
		} catch (IOException | NumberFormatException | InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
