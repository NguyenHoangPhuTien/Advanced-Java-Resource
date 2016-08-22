package Emloyee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;

public class MainTestAllEmployee {

	public static void main(String[] args) {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

		
		try {
			int cont = 1;
			TradeEmployee[] listTrade = new TradeEmployee[0];
			CollectionEmployee[] listCollect = new CollectionEmployee[0];
			
			while(cont == 1){
				System.out.println("Input employee name: ");
				String name = buff.readLine();
				System.out.println("Input coefficients salary of employee: ");
				double coefSalary = Double.parseDouble(buff.readLine());
				if (coefSalary < 0)
					System.out.println("coefficients salary can not be less 0");
				else {
					System.out.println("Input number of person depend: ");
					int number = Integer.parseInt(buff.readLine());
					if (number < 0)
						System.out.println("number of person can not be less 0");
					else {
						System.out.println("Input bonus salary of employee: ");
						double bonus = Double.parseDouble(buff.readLine());
						if (bonus < 0)
							System.out.println("bonus of salary can not be less 0");
						else {
							System.out.println("1.Trade employee");
							System.out.println("2.Collection employee");
							System.out.println("Please choice 1 or 2");
							int choiceEmp = Integer.parseInt(buff.readLine());
							switch(choiceEmp){
								case 1:
									System.out.println("Input trade salary: ");
									double tradeSalary = Double.parseDouble(buff.readLine());
									System.out.println("Input rate of salary: ");
									double rateSalary = Double.parseDouble(buff.readLine());
									TradeEmployee trade = new TradeEmployee(name, coefSalary, number, bonus, tradeSalary, rateSalary);
									listTrade = Arrays.copyOf(listTrade, listTrade.length + 1);
									listTrade[listTrade.length - 1] = trade;
									break;
								case 2:
									System.out.println("Input quantity product: ");
									int quantity = Integer.parseInt(buff.readLine());
									System.out.println("Limit product: ");
									int limit = Integer.parseInt(buff.readLine());
									System.out.println("Input rate bonus: ");
									double rateBonus = Double.parseDouble(buff.readLine());
									CollectionEmployee collect = new CollectionEmployee(name, coefSalary, number, bonus, quantity, limit, rateBonus);
									listCollect = Arrays.copyOf(listCollect, listCollect.length + 1);
									listCollect[listCollect.length - 1] = collect;
									break;
								default:
									System.out.println("Please choice 1 or 2");
							}
						}
					}
				System.out.println("1.Continue");	
				System.out.println("2.Quit");
				System.out.println("Please choice 1 or 2");
				int choiceCont = Integer.parseInt(buff.readLine());
				if(choiceCont != 1)
					cont = 0;
				}
			}
			if(listTrade.length > 0){
				for(TradeEmployee trade : listTrade){
					System.out.println(trade.toString());
				}
			}
			
		} catch (IOException | NumberFormatException | InputMismatchException | NullPointerException e) {
			e.printStackTrace();
		}
	}

}
