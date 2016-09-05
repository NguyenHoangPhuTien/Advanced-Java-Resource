package Exercise1_28_Observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

import jdk.nashorn.internal.codegen.Emitter;

public class MainObserver {

	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		Account acc = new Account();
		System.out.println("Input your money want to withdrawal: ");
		try {
			MobileObserver mobile = new MobileObserver(acc);
			EmailObserver email = new EmailObserver(acc);
			double state = Double.parseDouble(input.readLine());
			if(state > 10000000)
				System.out.println("Money want to withdrawal is incorrect");
			else{
				acc.setState(state);
				
			}
			
		} catch (NumberFormatException | IOException | InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
