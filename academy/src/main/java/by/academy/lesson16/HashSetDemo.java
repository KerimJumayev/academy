package by.academy.lesson16;
//Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5". 
//Избавиться от повторяющихся элементов в строке и вывести результат на экран.

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		Set<Integer> so = new HashSet<>();
		
		for (int i =0; i < num ; i++) {
			so.add(scan.nextInt());
			
			
		}
		scan.close();
		System.out.println(so+"gogogogogogogog");
	
	
	}
	

}
