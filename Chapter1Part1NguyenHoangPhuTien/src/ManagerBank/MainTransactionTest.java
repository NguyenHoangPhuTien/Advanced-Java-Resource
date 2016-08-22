package ManagerBank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;

public class MainTransactionTest {

	public static void main(String[] args) {

		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

		try {
			int cont = 1;
			Gold[] listGold = new Gold[0];
			Money[] listMoney = new Money[0];
			double total = 0;
			double totalMoneySell = 0;
			double totalMoneyBuy = 0;
			int sizeGold = 0;
			int sizeMoneyBuy = 0;
			int sizeMoneySell = 0;
			while (cont == 1) {
				System.out.println("Input trading code: ");
				String tradingCode = buff.readLine();
				System.out.println("Input day of trade: ");
				String day = buff.readLine();
				System.out.println("Input quantity: ");
				int quantity = Integer.parseInt(buff.readLine());
				System.out.println("1.Trade Gold");
				System.out.println("2.Trade Money");
				System.out.println("Please choice option (1 or 2)");
				int choiceType = Integer.parseInt(buff.readLine());
				switch (choiceType) {
				case 1:
					Gold gold = new Gold(tradingCode, day, quantity);
					System.out.println("1.SJC999");
					System.out.println("2.24K");
					System.out.println("Please choice option (1  or 2");
					int typeGold = Integer.parseInt(buff.readLine());
					switch (typeGold) {
					case 1:
						gold.setType("SJC9999");
						gold.setUnitPrice(1);
						listGold = Arrays.copyOf(listGold, listGold.length + 1);
						listGold[listGold.length - 1] = gold;
						total += gold.calculateMoney(1);
						sizeGold++;
						break;
					case 2:
						gold.setType("24K");
						gold.setUnitPrice(2);
						listGold = Arrays.copyOf(listGold, listGold.length + 1);
						listGold[listGold.length - 1] = gold;
						total += gold.calculateMoney(2);
						sizeGold++;
						break;

					default:
						System.out.println("Please choice 1 or 2");
					}
					break;
				case 2:
					Money money = new Money(tradingCode, day, quantity);
					System.out.println("1.USD");
					System.out.println("2.EUR");
					System.out.println("3.AUD");
					System.out.println("Please choice option (1 or 2 or 3)");
					int choiceTypeMoney = Integer.parseInt(buff.readLine());
					int choiceSellBuy;
					switch (choiceTypeMoney) {
					case 1:
						money.setType("USD");
						money.setPriceBuy(1);
						money.setPriceSell(1);
						listMoney = Arrays.copyOf(listMoney,
								listMoney.length + 1);
						listMoney[listGold.length - 1] = money;
						System.out.println("1.Buy");
						System.out.println("2.Sell");
						System.out.println("Want to buy or sell (1 or 2");
						choiceSellBuy = Integer.parseInt(buff.readLine());
						switch (choiceSellBuy) {
						case 1:
							totalMoneyBuy += money.calMoneyBuy(1);
							sizeMoneyBuy++;
							break;
						case 2:
							totalMoneySell += money.calMoneySell(1);
							sizeMoneySell++;
							break;
						default:
							System.out.println("Please choice 1 or 2");
						}
						break;
					case 2:
						money.setType("EUR");
						money.setPriceBuy(2);
						money.setPriceSell(2);
						listMoney = Arrays.copyOf(listMoney,
								listMoney.length + 1);
						listMoney[listGold.length - 1] = money;
						System.out.println("1.Buy");
						System.out.println("2.Sell");
						System.out.println("Want to buy or sell (1 or 2");
						choiceSellBuy = Integer.parseInt(buff.readLine());
						switch (choiceSellBuy) {
						case 1:
							totalMoneyBuy += money.calMoneyBuy(2);
							sizeMoneyBuy++;
							break;
						case 2:
							totalMoneySell += money.calMoneySell(2);
							sizeMoneySell++;
							break;
						default:
							System.out.println("Please choice 1 or 2");
						}
						break;
					case 3:
						money.setType("AUD");
						money.setPriceBuy(3);
						money.setPriceSell(3);
						listMoney = Arrays.copyOf(listMoney,
								listMoney.length + 1);
						listMoney[listGold.length - 1] = money;
						System.out.println("1.Buy");
						System.out.println("2.Sell");
						System.out.println("Want to buy or sell (1 or 2)");
						choiceSellBuy = Integer.parseInt(buff.readLine());
						switch (choiceSellBuy) {
						case 1:
							totalMoneyBuy += money.calMoneyBuy(3);
							sizeMoneyBuy++;
							break;
						case 2:
							totalMoneySell += money.calMoneySell(3);
							sizeMoneySell++;
							break;
						default:
							System.out.println("Please choice 1 or 2");
						}
						break;
					default:
						System.out.println("Please choice 1 or 2 or 3");
					}
				break;
				default:
					System.out.println("Please choice 1 or 2");
				}
				System.out.println("1.Continue");
				System.out.println("2.Quit");
				System.out.println("Continue ? (1 or 2)");
				int choiceCont = Integer.parseInt(buff.readLine());
				if (choiceCont != 1)
					cont = 0;
			}
			if (listGold.length > 0) {
				for (Gold gold : listGold)
					System.out.println(gold.toString());
				System.out.println("total money for gold: " + total);
				System.out.println("Average money for gold: "
						+ (total / sizeGold));
			}
			if (listMoney.length > 0) {
				for (Money money : listMoney)
					System.out.println(money.toString());
				System.out.println("total money for sell: " + totalMoneySell);
				System.out.println("total money for buy: " + totalMoneyBuy);
				System.out.println("Average money for sell: "
						+ (totalMoneySell / sizeMoneySell));
				System.out.println("Average money for buy: "
						+ (totalMoneyBuy / sizeMoneyBuy));
			}
		} catch (IOException | NumberFormatException | InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}
}
