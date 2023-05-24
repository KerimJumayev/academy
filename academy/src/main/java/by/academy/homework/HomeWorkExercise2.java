package by.academy.homework;

import java.util.Scanner;

public class HomeWorkExercise2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("type value");
		int x = sc.nextInt();
		String value =sc.nextLine();
		
		switch(x) {
		case 1:
			x = sc.nextInt();
			int ostatok = x % 2;
		System.out.println("ostatok ot % 2" + ostatok);
		break;
		
		default:
			System.out.println("Unsupported type");
		
		
		
		
		
		}
		
		
		
		
		
		
	
		
	}
}
