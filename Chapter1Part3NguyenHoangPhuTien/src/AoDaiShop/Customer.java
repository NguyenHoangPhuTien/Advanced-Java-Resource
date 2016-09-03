package AoDaiShop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Nguyen Hoang Phu Tien
 * @version 1.0
 * @created 02-September-2016 8:03:32 PM
 * @class main for management sewing aodai
 */
public class Customer {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {

			TraditionalAodai traAodai = new TraditionalAodai();
			FashionAodai fasAodai = new FashionAodai();
			Cheongsam cheAodai = new Cheongsam();

			int check = 1;
			while (check == 1) {
				System.out
						.println("Do you want to sew: 1. TraditionalAodai / 2. FashionAodai / 3. Cheongsam ");
				System.out.println("Please choose 1 / 2 / 3 ");
				int reply = Integer.parseInt(input.readLine());
				if (reply != 1 && reply != 2 && reply != 3) {
					throw new ArithmeticException(
							"Invalid values! Please choose again!");
				}
				switch (reply) {
				case 1:
					traAodai.sew();
					break;
				case 2:
					fasAodai.sew();
					break;
				case 3:
					cheAodai.sew();
					break;
				}
				System.out.println("Do you want continue: \n1. Yes \n2. No ");
				System.out.println("Please choose 1 / 2 ");
				check = Integer.parseInt(input.readLine());
				if (check != 1 && check != 2) {
					throw new ArithmeticException(
							"Invalid values! Please choose again!");
				}

			}
		} catch (IOException | NumberFormatException | ArithmeticException ex) {
			System.out.println("Error: " + ex.getMessage());

		}

	}

}