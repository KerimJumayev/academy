package by.academy.lesson1;

import java.util.Scanner;
import java.lang.Math;

public class Lesson {

	public static void main(String[] args) {

//		int i = 3;
//		int j = 4;
//		int k = i * i + j * j;
//
//		System.out.println(i + "*" + i + "+" + j + "*" + j + "=" + k);
		
		Scanner sc = new Scanner(System.in);
		
	int n = sc.nextInt();
//		int result = 1; 
//
//		for (int n1 = 1; n1<= n; n1++) {
//			result *= n1;
//		}
//		System.out.println(result);
//	
	
		
		
		
		
		
		
//		if(x % 2 == 0) {
//			System.out.println("chotnoe");
//		}else {
//			System.out.println(" ne chotnoe");
//		}
		
		
		
		switch (n) {
		case 1:
			System.out.println("Man");
				break;
		case 2:
			System.out.println("Tue");
				break;
		case 3:
			System.out.println("Wed");
				break;
		case 4:
			System.out.println("Thu");
				break;
		case 5:
			System.out.println("Fri");
			break;
		case 6:
			System.out.println("Sta");
			break;
		case 7:
			System.out.println("Sun");
			break;
					
		}
		sc.close();
		
	}

}
