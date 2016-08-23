package MusicInformation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class MainInstrument {
	
	public static void main(String[] args) {
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Input name of instrument");
			String name = buff.readLine();
			
			System.out.println("Input manufacturer: ");
			String manufacturer = buff.readLine();
			
			System.out.println("1.Stringed Instrument");
			System.out.println("2.Non Stringed Instrument");
			System.out.println("Please choice 1 or 2");
			int choice = Integer.parseInt(buff.readLine());
			switch(choice){
				case 1:
					System.out.println("Input quantity Stringed: ");
					int stringed = Integer.parseInt(buff.readLine());
					StringedInstrument stringedIntru = new StringedInstrument(name, manufacturer, stringed);
					System.out.println(stringedIntru.play());
					break;
				case 2:
					System.out.println("Input how to use: ");
					String use = buff.readLine();
					NonStringedIntrument nonStringed = new NonStringedIntrument(name, manufacturer, use);
					System.out.println(nonStringed.play());
					break;
				default:
					System.out.println("Please choice 1 or 2");
			}
		} catch (IOException | InputMismatchException | NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}
