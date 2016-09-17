package Exercise8_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
		String name = "";
		int id = 0;
		double price = 0;
		int amount = 0;
		String image = "";
		int categoryID = 0;
		int onSell = 1;
		int cont = 1;
		
		Date date1 = new Date();
		
		java.sql.Date sqlDate = new java.sql.Date(date1.getTime());
		ProductController control = new ProductController();
		try {
						
			while(cont == 1){
				System.out.println("1.Insert new product");
				System.out.println("2.Update product by id");
				System.out.println("3.Delete product by id");
				System.out.println("Please choice option: ");
				int choice = Integer.parseInt(input.readLine());
				
				switch(choice){
					case 1:
						System.out.println("Input name product: ");
						name = input.readLine();
						System.out.println("Input price product: ");
						price = Double.parseDouble(input.readLine());
						System.out.println("Input amount product: ");
						amount = Integer.parseInt(input.readLine());
						System.out.println("Input category id product: ");
						categoryID = Integer.parseInt(input.readLine());
						System.out.println("Input on sell product: ");
						onSell = Integer.parseInt(input.readLine());
						System.out.println("Input image of product: ");
						image = input.readLine();
						Product product = new Product(name, price, amount, image, categoryID, sqlDate, onSell);
						control.insertProduct(product);
						break;
						
					case 2:
						System.out.println("Input id product: ");
						id = Integer.parseInt(input.readLine());
						System.out.println("Input price product: ");
						price = Double.parseDouble(input.readLine());
						System.out.println("Input amount product: ");
						amount = Integer.parseInt(input.readLine());
						control.updateProduct(id, price, amount);
						break;
					
					case 3:
						System.out.println("Input id product: ");
						id = Integer.parseInt(input.readLine());
						control.deleteProduct(id);
						break;
						
					default:
						cont = 0;
				}
			}
			
		} catch (NumberFormatException | IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
