package SaleManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class MainSaleManagement {

	/*
	 * switch choice : product will created and Order detail will be created by product
	 * Return Order detail
	 */
	public static OrderDetail createOrderDetail(int choiceProduct, BufferedReader buff) throws IOException{
		
		OrderDetail orderDetail = new OrderDetail();
		int quantity = 0;
		
		switch(choiceProduct){
			case 1:
				Product egg = new Product("Egg", 2000);
				System.out.println("Input quantity: ");
				quantity = Integer.parseInt(buff.readLine());
				orderDetail.setM_Product(egg);
				orderDetail.setQuantity(quantity);
				break;
			case 2:
				Product tomato = new Product("Tomato", 3000);
				System.out.println("Input quantity: ");
				quantity = Integer.parseInt(buff.readLine());
				orderDetail.setM_Product(tomato);
				orderDetail.setQuantity(quantity);
				break;
			case 3:
				Product fish = new Product("Fish", 10000);
				System.out.println("Input quantity: ");
				quantity = Integer.parseInt(buff.readLine());
				orderDetail.setM_Product(fish);
				orderDetail.setQuantity(quantity);
				break;
			default:
				System.out.println("Please choice 1 or 2 or 3");
		}
		return orderDetail;
	}
	/*
	 * Create a product and create order detail by product
	 * Finaly add ordetail into list order detail
	 * Return list order detail
	 */
	public static List<OrderDetail> createListOrderDetail(BufferedReader buff) throws IOException{
		
		List<OrderDetail> listOrderDetail = new ArrayList<OrderDetail>();
		int contProduct = 1;
		while(contProduct == 1){
			System.out.println("1.Egg");
			System.out.println("2.Tomato");
			System.out.println("3.Fish");
			System.out.println("Please choice 1 or 2 or 3");
			int choiceProduct = Integer.parseInt(buff.readLine());
			OrderDetail orderDetail = createOrderDetail(choiceProduct, buff);
			listOrderDetail.add(orderDetail);
			System.out.println("1.Continue create product");
			System.out.println("2.Quit");
			int choiceCont = Integer.parseInt(buff.readLine());
			if(choiceCont != 1)
				contProduct = 0;
		}
		return listOrderDetail;
	}
	
	
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
			System.out.println("Input customer id: ");
			String customerId = buff.readLine();
			
			List<Order> listOrder = new ArrayList<Order>();
			
			int cont = 1;
			while(cont == 1){
				
				System.out.println("Input date of order:");
				String date = buff.readLine();
				System.out.println("Input status of order:");
				String status = buff.readLine();
				boolean printTax;
				System.out.println("1.Print order");
				System.out.println("2.No print order");
				System.out.println("Please choice 1 or 2");
				
				int choicePrint = Integer.parseInt(buff.readLine());
				if(choicePrint == 1)
					 printTax = true;
				else
					printTax = false;
				List<OrderDetail> listOrderDetail = createListOrderDetail(buff);
				
				/*
				 * Switch choice : ATM card or Credit card will created and Order will created
				 * Finaly this order will added into list order and Customer wil created by this list order
				 */
				System.out.println("1.ATM");
				System.out.println("2.Credit card");
				System.out.println("Please choice how to pay (1 or 2");
				int payType = Integer.parseInt(buff.readLine());
				if(payType == 1){
					System.out.println("Input card ID: ");
					String cardID = buff.readLine();
					System.out.println("Input date created: ");
					String dateCreate = buff.readLine();
					System.out.println("Input balance of ATM: ");
					double balance = Double.parseDouble(buff.readLine());
					ATMCard atm = new ATMCard(address, email, identity, name, phone, cardID, dateCreate, balance);
					Order order = new Order(date, status, listOrderDetail, printTax, atm);
					listOrder.add(order);
				}
				else if(payType == 2){
					System.out.println("Input card ID: ");
					String cardID = buff.readLine();
					System.out.println("Input date created: ");
					String dateCreate = buff.readLine();
					System.out.println("Input expiration date of credit card: ");
					String expirationDate = buff.readLine();
					System.out.println("Input max debt of credit card: ");
					double maxDebt = Double.parseDouble(buff.readLine());
					System.out.println("Input type of credit card: ");
					String type = buff.readLine();
					CreditCard creditCard = new CreditCard(address, email, identity, name, phone, cardID, dateCreate, expirationDate, maxDebt, type);
					Order order = new Order(date, status, listOrderDetail, printTax, creditCard);
					listOrder.add(order);
				}
				else
					System.out.println("Please choice 1 or 2");
				System.out.println("1.Continue to create order");
				System.out.println("2.Quit");
				System.out.println("Please choice 1 or 2");
				int choiceCont = Integer.parseInt(buff.readLine());
				if(choiceCont != 1)
					cont = 0;
			}
			/*
			 * 
			 */
			Customer  customer = new Customer(address, email, identity, name, phone, customerId, listOrder);
			System.out.println(customer.getName());
			System.out.println(customer.getAddress());
			System.out.println(customer.getEmail());
			System.out.println(customer.getIdentityCardNumber());
			System.out.println(customer.getPhoneNumber());
			List<Order> list = customer.getList();
			for(Order order  : list){
				System.out.println(order.toString());
				System.out.println("---------------------------------------------");
			}
			
		} catch (IOException | NumberFormatException | InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
