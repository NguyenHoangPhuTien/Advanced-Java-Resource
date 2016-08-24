package AnimalInformation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class MainAnimal {

	public static void main(String[] args) {
	
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			int cont = 1;
			Bird[] listBird = new Bird[0];
			Tiger[] listTiger = new Tiger[0];
			Boa[] listBoa = new Boa[0];
			Fish[] listFish = new Fish[0];
			while(cont == 1){
				System.out.println("Input name: ");
				String name = buff.readLine();
				System.out.println("Input food: ");
				String food = buff.readLine();
				
				System.out.println("1.Tiger");
				System.out.println("2.Boa");
				System.out.println("3.Bird");
				System.out.println("4.Fish");
				System.out.println("Please choice 1 or 2 or 3 or 4");
				int choice = Integer.parseInt(buff.readLine());
				/*
				 * With choice : class corresponding will be create with fields and this class will be add in array 
				 */
				switch(choice){
					case 1:
						Tiger tiger = new Tiger(name, food);
						listTiger = Arrays.copyOf(listTiger, listTiger.length + 1);
						listTiger[listTiger.length - 1] = tiger;
						break;
					case 2:
						Boa boa = new Boa(name, food);
						listBoa = Arrays.copyOf(listBoa, listBoa.length + 1);
						listBoa[listBoa.length - 1] = boa;
						break;
					case 3:
						Bird bird = new Bird(name, food);
						listBird = Arrays.copyOf(listBird, listBird.length + 1);
						listBird[listBird.length - 1] = bird;
						break;
					case 4:
						Fish fish = new Fish(name, food);
						listFish = Arrays.copyOf(listFish, listFish.length + 1);
						listFish[listFish.length - 1] = fish;
						break;
					default:
						System.out.println("Please choice 1 or 2 or 3 or 4");
				}
				/*
				 * 
				 */
				
				System.out.println("1.Continue");
				System.out.println("2.Quit");
				System.out.println("Please choice 1 or 2");
				int choiceCont = Integer.parseInt(buff.readLine());
				if(choiceCont != 1)
					cont = 0;
			}
			if(listTiger.length > 0){
				for(Tiger tiger : listTiger)
					System.out.println(tiger.toString());
			}
			if(listBoa.length > 0){
				for(Boa boa : listBoa)
					System.out.println(boa.toString());
			}
			if(listBird.length > 0){
				for(Bird bird : listBird)
					System.out.println(bird.toString());
			}
			if(listFish.length > 0){
				for(Fish fish : listFish)
					System.out.println(fish.toString());
			}
		} catch (IOException | NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
