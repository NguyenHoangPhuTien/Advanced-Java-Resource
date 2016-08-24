package InnerClassGiftbox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class MainGiftBox {

	public static void main(String[] args) {
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Input shape of giftbox: ");
		try {
			String shape = buff.readLine();
			System.out.println("Input color of giftbox: ");
			String color = buff.readLine();
			System.out.println("Input name of gift: ");
			String name = buff.readLine();
			System.out.println("Input weight of gift");
			double weigth = Double.parseDouble(buff.readLine());
			
			GiftBox giftBox = new GiftBox(shape, color);
			GiftBox.Gift gift = giftBox.new Gift(name, weigth);
			
			System.out.println("Shape giftbox: " + giftBox.getShape());
			System.out.println("Color giftbox: " + giftBox.getColor());
			System.out.println("Name of gift: " + gift.name);
			System.out.println("Price of fee: " + gift.calFee());
		} catch (IOException |NumberFormatException | InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

}
