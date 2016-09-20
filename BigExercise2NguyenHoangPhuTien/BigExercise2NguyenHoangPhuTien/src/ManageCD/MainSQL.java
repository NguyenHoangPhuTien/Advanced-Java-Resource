package ManageCD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class MainSQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		List<CD> list = null;
		CDController control = new CDController();
		String name = "";
		String singer = "";
		double price = 0;
		int numberSongs = 0;
		int id = 0;
		try {
			int cont = 1;
			
			//show some choice want to active in database
			while(cont == 1){
				System.out.println("1.View all cd");
				System.out.println("2.Insert new cd");
				System.out.println("3.Update cd");
				System.out.println("4.Delete cd");
				System.out.println("5.Search cd by name");
				System.out.println("6.Search cd by singer");
				System.out.println("7.Search cd by number songs by distance");
				System.out.println("8.Search cd by price");
				System.out.println("9.Search cd by price by distance");
				System.out.println("10.Search cd by number songs");
				System.out.println("11.Exit");
				System.out.println("Please choice option (1/2/3/4/5/6/8/9/10/11)");
				int choice = Integer.parseInt(input.readLine());
				switch (choice) {
				
					//View all cd from database
					case 1:
						list = control.findAllCD();
						if(list.size() == 0){
							System.out.println("No more cd in database");
						}
						else
							list.forEach(e -> System.out.println(e.displayInformation()));
						System.out.println();
						break;
					
					//Insert new cd into database
					case 2:
						System.out.println("Input name of cd: ");
						name = input.readLine();
						System.out.println("Input name of singer: ");
						singer = input.readLine();
						System.out.println("Input number of songs: ");
						numberSongs = Integer.parseInt(input.readLine());
						if(numberSongs < 0)
							System.out.println("Input invalid value!!!!");
						else{
							System.out.println("Input price of cd: ");
							price = Double.parseDouble(input.readLine());
							if(price < 0)
								System.out.println("Input invalid value!!!!");
							else{
								CD cd = new CD(name, singer, numberSongs, price);
								control.insertNewCD(cd);
							}
						}
						break;
						
					//Update cd by index in list 
					case 3:
						list = control.findAllCD();
						for(int i = 0; i < list.size(); i++){
							System.out.println("Index: " + (i + 1) + " - " + list.get(i).displayInformation());
						}
						System.out.println("Please choice cd want to update by index");
						int index = Integer.parseInt(input.readLine());
						if(index < 0 || index > list.size())
							System.out.println("Input invalid value!!!!");
						else{
							index = index - 1;
							CD cd1 = list.get(index);
							id = cd1.getId();
							System.out.println("Input number of songs: ");
							numberSongs = Integer.parseInt(input.readLine());
							if(numberSongs < 0)
								System.out.println("Input invalid value!!!!");
							else{
								System.out.println("Input price of cd: ");
								price = Double.parseDouble(input.readLine());
								if(price < 0)
									System.out.println("Input invalid value!!!!");
								else{
									control.updateProduct(id, price, numberSongs);
								}
							}
						}
						break;
						
					//Delete cd by index in list
					case 4:
						list = control.findAllCD();
						for(int i = 0; i < list.size(); i++){
							System.out.println("Index: " + (i + 1) + " - " + list.get(i).displayInformation());
						}
						System.out.println("Please choice cd want to update by index");
						int index1 = Integer.parseInt(input.readLine());
						if(index1 < 0 || index1 > list.size())
							System.out.println("Input invalid value!!!!");
						else{
							index1 = index1 - 1;
							CD cd1 = list.get(index1);
							id = cd1.getId();
							System.out.println("Do you want to delete this cd");
							System.out.println("1.Yes");
							System.out.println("2.No");
							System.out.println("Please choice option 1 or 2");
							int delete = Integer.parseInt(input.readLine());
							if(delete == 1)
								control.deleteProduct(id);
							else
								System.out.println("Thanks!!!!");
						}
						break;
						
					//Search cd by name of cd
					case 5:
						System.out.println("Input name of cd want to search: ");
						name = input.readLine();
						list = control.searchCDByName(name);
						if(list.size() == 0){
							System.out.println("No more cd in database");
						}
						else
							list.forEach(e -> System.out.println(e.displayInformation()));
						System.out.println();
						break;
						
					//Search cd by name of singer
					case 6:
						System.out.println("Input name of singer want to search");
						singer = input.readLine();
						list = control.searchCDBySinger(singer);
						if(list.size() == 0){
							System.out.println("No more cd in database");
						}
						else
							list.forEach(e -> System.out.println(e.displayInformation()));
						System.out.println();
						break;
					
					//Search cd by number song by distance of start number song and end number song
					case 7:
						System.out.println("Input number song start");
						int startNum = Integer.parseInt(input.readLine());
						if(startNum < 0)
							System.out.println("Input invalid value!!!!");
						else{
							System.out.println("Input number song end");
							int endNum = Integer.parseInt(input.readLine());
							if(endNum < 0)
								System.out.println("Input invalid value!!!!");
							else{
								if(endNum < startNum)
									System.out.println("End can not be less than start");
								else{
									list = control.searchCDByNumberSongs(startNum, endNum);
									if(list.size() == 0){
										System.out.println("No more cd in database");
									}
									else
										list.forEach(e -> System.out.println(e.displayInformation()));
									System.out.println();
								}
							}
						}
						break;
					
					//Search cd by price
					case 8:
						System.out.println("Input price of cd want to search: ");
						price = Double.parseDouble(input.readLine());
						if(price < 0)
							System.out.println("Input invalid value!!!!");
						else{
							list = control.searchCDByPrice(price);
							if(list.size() == 0){
								System.out.println("No more cd in database");
							}
							else
								list.forEach(e -> System.out.println(e.displayInformation()));
							System.out.println();
						}
						break;
					
					//Search cd by price by distance of start price and end price
					case 9:
						System.out.println("Input price start");
						double startPrice = Integer.parseInt(input.readLine());
						if(startPrice < 0)
							System.out.println("Input invalid value!!!!");
						else{
							System.out.println("Input price end");
							double endPrice = Integer.parseInt(input.readLine());
							if(endPrice < 0)
								System.out.println("Input invalid value!!!!");
							else{
								if(endPrice < startPrice)
									System.out.println("End can not be less than start");
								else{
									list = control.searchCDByPrice(startPrice, endPrice);
									if(list.size() == 0){
										System.out.println("No more cd in database");
									}
									else
										list.forEach(e -> System.out.println(e.displayInformation()));
									System.out.println();
								}
							}
						}
						break;
					
					//Search cd by number of songs
					case 10:
						System.out.println("Input number of song want to search: ");
						numberSongs = Integer.parseInt(input.readLine());
						if(numberSongs < 0)
							System.out.println("Input invalid value!!!!");
						else{
							list = control.searchCDByNumberSongs(numberSongs);
							if(list.size() == 0){
								System.out.println("No more cd in database");
							}
							else
								list.forEach(e -> System.out.println(e.displayInformation()));
						}
						break;
						
					default:
						cont = 0;
						break;
				}
				
			}
			
		} catch (NumberFormatException | IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
