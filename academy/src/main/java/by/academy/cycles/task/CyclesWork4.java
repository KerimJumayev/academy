package by.academy.cycles.task;

import java.util.Scanner;

public class CyclesWork4 {
//	6. В сберкассу на трёхпроцентный вклад положили S рублей.Какой станет сумма вклада через N лет.
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter deposit amount ($)");
		double s = scan.nextDouble();

		System.out.println("enter an annual rate");
		double r = scan.nextDouble();

		System.out.println("enter number of the years");
		int n = scan.nextInt();
		
		 // Расчет итоговой суммы вклада
        double a = s * Math.pow(1 + r, n);

		System.out.println(a);

	}

}
