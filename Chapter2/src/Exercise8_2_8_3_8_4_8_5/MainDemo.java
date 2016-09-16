package Exercise8_2_8_3_8_4_8_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			String username = "";
			String password = "";
			User user = new User();
			int cont = 1;
			UserController control = new UserController();
			ProductController controlProduct = new ProductController();
			CategoryController categoryController = new CategoryController();
			while(cont == 1){
				System.out.println("1.Add new user");
				System.out.println("2.Login");
				System.out.println("3.View all category");
				System.out.println("4.Insert product");
				System.out.println("5.Search product");
				System.out.println("6.Update product");
				System.out.println("7.Delete product");
				int choice = Integer.parseInt(input.readLine());
				switch(choice){
				
					case 1:
						System.out.println("Input username: ");
						username = input.readLine();
						System.out.println("Input password: ");
						password = input.readLine();
						user.setUsername(username);
						user.setPassword(password);
						control.addUser(user);
						break;
						
					case 2:
						System.out.println("Input username: ");
						username = input.readLine();
						System.out.println("Input password: ");
						password = input.readLine();
						User user1 = control.loginUser(username, password);
						if(user1 == null)
							System.out.println("Has no more user");
						else
							System.out.println("Login success!!!!!");
						break;
						
					case 3:
						List<Category> list = categoryController.getAllCategory();
						list.forEach(e -> System.out.println(e.toString()));
						break;
					
					case 4:
						System.out.println("Input name: ");
						String name = input.readLine();
						System.out.println("Input price: ");
						double price = Double.parseDouble(input.readLine());
						System.out.println("Input amount: ");
						int amount = Integer.parseInt(input.readLine());
						System.out.println("Input category id: ");
						int categoryId = Integer.parseInt(input.readLine());
						Product product = new Product(name, price, amount, categoryId);
						controlProduct.insertProduct(product);
						break;
					
					case 5:
						System.out.println("Input name of product want to search: ");
						String nameProduct = input.readLine();
						List<Product> list1 = controlProduct.searchProduct(nameProduct);
						list1.forEach(e -> System.out.println(e.toString()));
						break;
					
					case 6:
						System.out.println("Input name of product want to update: ");
						String updateName = input.readLine();
						double price1 = Double.parseDouble(input.readLine());
						System.out.println("Input amount: ");
						int amount1 = Integer.parseInt(input.readLine());
						System.out.println("Input category id: ");
						int categoryId1 = Integer.parseInt(input.readLine());
						System.out.println("Input id update");
						int id = Integer.parseInt(input.readLine());
						Product updateProduct = new Product(updateName, price1, amount1, categoryId1);
						updateProduct.setId(id);
						controlProduct.updateProduct(updateProduct);
						break;
						
					case 7:
						System.out.println("Input id delete");
						int id1 = Integer.parseInt(input.readLine());
						controlProduct.deleteProduct(id1);
						break;
						
					default:
						cont = 0;
				}
			}
			
		} catch (IOException | NumberFormatException | InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

}
