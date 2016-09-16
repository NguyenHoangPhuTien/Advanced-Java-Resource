package Exercise8_2_8_3_8_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

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
			while(cont == 1){
				System.out.println("1.Add new user");
				System.out.println("2.Login");
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
					default:
						cont = 0;
				}
			}
			
		} catch (IOException | NumberFormatException | InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

}
