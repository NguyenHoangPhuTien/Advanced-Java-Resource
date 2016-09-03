package FactoryAoDai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Nguyen Hoang Phu Tien
 * @version 1.0
 * @created 01-September-2016 3:52:25 PM
 * @class for management sewing aodai
 */
public class MainFactoryAoDai {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		try {

			FactoryTraditionalAodai traAodai = new FactoryTraditionalAodai();
			FactoryFashionAodai fasAodai = new FactoryFashionAodai();
			FactoryCheongsam cheAodai = new FactoryCheongsam();

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
					traAodai.getAodai().sewing();
					break;
				case 2:
					fasAodai.getAodai().sewing();
					break;
				case 3:
					cheAodai.getAodai().sewing();
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