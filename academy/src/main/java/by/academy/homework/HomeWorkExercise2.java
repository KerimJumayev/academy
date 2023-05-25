package by.academy.homework;

import java.util.Scanner;

import javax.print.attribute.HashAttributeSet;

public class HomeWorkExercise2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("type value");
		String x = sc.nextLine();

		System.out.println("enter the value of variable");
		String variable = sc.nextLine();

		switch (x) {
		case "int":
			int intValue = Integer.parseInt(variable);
			int residue = intValue % 2;
			System.out.println("remainder of the division" + residue);
			break;
		case "double":
			double doubleValue = Double.parseDouble(variable);
			double percent = doubleValue * 0.7;
			System.out.println(" 70% from number" + percent);
			break;
		case "float":
			float floatValue = Float.parseFloat(variable);
			float square = floatValue * floatValue;
			System.out.println(" square" + square);
			break;
		case "char":
			char charValue = variable.charAt(0);
			int charcode = (int) charValue;
			System.out.println("charcode " + charcode);
			break;
		case "String":
			System.out.println(" Hello" + variable);
			break;

		default:
			System.out.println("Unsupported type");

		}

	}
}
