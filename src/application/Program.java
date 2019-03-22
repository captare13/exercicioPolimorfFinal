package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.CompanyPayer;
import entities.IndividualPayer;
import entities.Payer;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Payer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double anualIncome = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new IndividualPayer(name, anualIncome, healthExpenditures));
			}
			if (ch == 'c') {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new CompanyPayer(name, anualIncome, numberOfEmployees));
			}
		}

		System.out.println();
		System.out.println("TAXES PAID:");
		for (Payer payer : list) {
			System.out.println(payer);
		}
		System.out.println();
		double sum = 0.0;
		for (Payer pay : list) {
			sum += pay.tax();
		}
		System.out.printf("TOTAL TAXES: $ %.2f%n", sum);
		sc.close();
	}
}
