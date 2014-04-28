package lab1_2;

import java.util.Scanner;

public class Main {

	public static void Constants() {
		final double pi = 3.14159;
		final double exp = 1.6E-19;
		final String text = "Press <OK>";
		System.out.println("Pi: " + pi + "\n" + "Exp: " + exp + "\n" + "Text: "
				+ text);
	}

	public static void Variables() {
		int age = 22;
		float ram = 1;
		String surname = "Ivanov";
		int population = 100_000_000;
		float salary = 100_000;
		float weight_mm = 456;
		long stars = 456_736_455;
		boolean sports = true;
		float weight_sm = 425;
		System.out.println("Age: " + age + "\n" + "RAM: " + ram + "\n"
				+ "Surname: " + surname + "\n" + "Population: " + population
				+ "\n" + "Salary: " + salary + "\n" + "Wight_mm: " + weight_mm
				+ "\n" + "Satars: " + stars + "\n" + "Sports: " + sports + "\n"
				+ "Weight_cm" + weight_sm);
		System.out.println("");
		age = 25;
		ram = 2;
		surname = "Dorofeev";
		population = 2000000;
		salary = 2000000;
		weight_mm = 234;
		stars = 456746455;
		sports = false;
		weight_sm = 7656;
		System.out.println("Age: " + age + "\n" + "RAM: " + ram + "\n"
				+ "Surname: " + surname + "\n" + "Population: " + population
				+ "\n" + "Salary: " + salary + "\n" + "Wight_mm: " + weight_mm
				+ "\n" + "Satars: " + stars + "\n" + "Sports: " + sports + "\n"
				+ "Weight_cm" + weight_sm);
		System.out.println("");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Age: ");
		age = sc.nextInt();
		System.out.println("RAM: ");
		ram = sc.nextFloat();
		System.out.println("Surname: ");
		surname = sc.next();
		System.out.println("Population: ");
		population = sc.nextInt();
		System.out.println("Salary: ");
		salary = sc.nextFloat();
		System.out.println("Weight_mm: ");
		weight_mm = sc.nextFloat();
		System.out.println("Stars: ");
		stars = sc.nextLong();
		System.out.println("Sports: ");
		sports = sc.nextBoolean();
		System.out.println("Weight_sm: ");
		weight_sm = sc.nextFloat();
		System.out.println("Age: " + age + "\n" + "RAM: " + ram + "\n"
				+ "Surname: " + surname + "\n" + "Population: " + population
				+ "\n" + "Salary: " + salary + "\n" + "Wight_mm: " + weight_mm
				+ "\n" + "Satars: " + stars + "\n" + "Sports: " + sports + "\n"
				+ "Weight_cm" + weight_sm);
	}

	public static void main(String[] args) {
		Variables();
	}

}
