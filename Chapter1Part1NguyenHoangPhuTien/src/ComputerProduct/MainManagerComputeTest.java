package ComputerProduct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;

public class MainManagerComputeTest {

	public static void main(String[] args) {
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String numberProduct = "";
			double price = 0;
			String manufacturer = "";
			int numberImport = 0;
			int cont = 1;
			int choice = 0;
			Desktop[] listDesk = new Desktop[0];
			Laptop[] listLap = new Laptop[0];
			String cpu = "";
			int ram = 0;
			double weight = 0;
			double screenSize = 0;
			double timeBattery = 0;
			
			while(cont == 1){
				System.out.println("Input number of product: ");
				numberProduct = buff.readLine();
				System.out.println("Input price");
				price = Double.parseDouble(buff.readLine());
				if(price <= 0)
					System.out.println("price of product can not be less or equal 0");
				else{
					System.out.println("Input quantity of product: ");
					numberImport = Integer.parseInt(buff.readLine());
					if(numberImport <= 0)
						System.out.println("quantity of product can not be less or equal 0");
					else{
						System.out.println("1.Desktop");
						System.out.println("2.Laptop");
						System.out.println("Please choice product want to import(1/2)");
						choice = Integer.parseInt(buff.readLine());
						switch(choice){
							case 1:
								System.out.println("Input CPU of product: ");
								cpu = buff.readLine();
								System.out.println("Input Ram of product: ");
								ram = Integer.parseInt(buff.readLine());
								if(ram <= 0)
									System.out.println("Ram of product can not be less or equal 0");
								else{
									Desktop desktop = new Desktop(numberProduct, manufacturer, price, numberImport, cpu, ram);
									listDesk = Arrays.copyOf(listDesk, listDesk.length + 1);
									listDesk[listDesk.length - 1] = desktop;
								}
								break;
							case 2:
								System.out.println("Input weight: ");
								weight = Double.parseDouble(buff.readLine());
								if(weight <= 0)
									System.out.println("weight of product can not be less or equal 0");
								else{
									System.out.println("Input screen size of product: ");
									screenSize = Double.parseDouble(buff.readLine());
									if(screenSize <= 0)
										System.out.println("sreen size of product can not be less or equal 0");
									else{
										System.out.println("Input time battery of product: ");
										timeBattery = Double.parseDouble(buff.readLine());
										if(timeBattery <= 0)
											System.out.println("battery time of product can not be less or equal 0");
										else{
											Laptop laptop = new Laptop(numberProduct, manufacturer, price, numberImport, weight, timeBattery, screenSize);
											listLap = Arrays.copyOf(listLap, listLap.length + 1);
											listLap[listLap.length - 1] = laptop;
										}
									}
								}
								break;
							default:
								System.out.println("Please choice 1 or 2");	
						}
						System.out.println("Continue ?(1/2)");
						int choice1 = Integer.parseInt(buff.readLine());
						if(choice1 != 1)
							cont = 0;
					}
				}
			}
			double sumLap = 0;
			double sumDesk = 0;
			if(listLap.length > 0){
				
				for(Laptop lap : listLap){
					System.out.println(lap.toString());
					sumLap += lap.findTotalMoney();
				}
				System.out.println("Total money of Laptop: "+sumLap);
			}
			else
				System.out.println("Laptop has no more");
			if(listDesk.length > 0){
				
				for(Desktop desk : listDesk){
					System.out.println(desk.toString());
					sumDesk += desk.findTotalMoney();
				}
				System.out.println("Total money of Desktop: "+sumDesk);
			}
			else
				System.out.println("Desktop has no more");
				
		} catch (IOException | InputMismatchException | NumberFormatException e) {
			
			System.out.println(e.getMessage());
		}
	}
}
