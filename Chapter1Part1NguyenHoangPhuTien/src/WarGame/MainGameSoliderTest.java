package WarGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class MainGameSoliderTest {

	public static void main(String[] args) {
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Input name of infantryman: ");
			String name = buff.readLine();
			System.out.println("Input power of infantryman: ");
			int powerInfi = Integer.parseInt(buff.readLine());
			if(powerInfi <= 0)
				System.out.println("Power of infantryman can not be less or equal 0");
			else{
				System.out.println("Input weapon of infantryman: ");
				String weaponInfi = buff.readLine();
				Infantryman infi = new Infantryman(name, powerInfi, weaponInfi);
				
				System.out.println("Input name of trooper: ");
				String nameTroop = buff.readLine();
				System.out.println("Input power of trooper: ");
				int powerTroop = Integer.parseInt(buff.readLine());
				if(powerTroop <= 0)
					System.out.println("Power of trooper can not be less or equal 0");
				else{
					System.out.println("Input weapon of trooper: ");
					String weaponTroop = buff.readLine();
					Trooper troop = new Trooper(nameTroop, powerTroop, weaponTroop);
					System.out.println("Information of infatryman and trooper: ");
					System.out.println(infi.toString());
					System.out.println(troop.toString());
					
					int healInfi = 0;
					int healTroop = 0;
					int cont = 1;
					while (cont == 1){
						
						System.out.println("1.Infantry fight");
						System.out.println("2.Trooper fight");
						System.out.println("Please choice(1/2)");
						int choice = Integer.parseInt(buff.readLine());
						switch(choice){
							case 1:
								troop.fight();
								break;
							case 2:
								infi.fight();
								break;
							default:
								System.out.println("Please choice 1 or 2");
						}
						healInfi = infi.getPower();
						healTroop = troop.getPower();
						if(healInfi <= 0 || healTroop <= 0)
							cont = 0;
					}
					if(healInfi <= 0)
						System.out.println("Trooper is winner");
					else
						System.out.println("Infantryman is winner");
				}
			}
		} catch (IOException | InputMismatchException | NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
