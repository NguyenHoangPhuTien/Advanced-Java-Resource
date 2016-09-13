package Exercise5_2;

import java.util.Random;
import java.util.Scanner;

public class Main {

	//Sum of arr
	public static int sum(int[] arr, int numThread) throws InterruptedException{
		
		int len = arr.length;
		int sum = 0;
		
		//Create and start numThreads
		SumThread[] ts = new SumThread[numThread];
		for(int i = 0; i < numThread; i++){
			ts[i] = new SumThread((i * len) / numThread, ((i + 1) * len / numThread), arr);
			ts[i].start();
		}
		
		//Wait for the thread to finish and sum their result
		for(int i = 0; i < numThread; i++){
			ts[i].join();
			sum += ts[i].getSum();
		}
		return sum;
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input length of array: ");
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		Random random = new Random();
		for(int i = 0; i < arr.length; i++){
			arr[i] = random.nextInt(10);
		}
		
		System.out.println("input num of thread: ");
		int numThread = scan.nextInt();
		int sum = sum(arr, numThread);
		String strArr = "";
		for(int value : arr){
			strArr += value + " ";
		}
		System.out.println("Array: " + strArr);
		System.out.println("Sum: " + sum);
	}

}
