import java.text.DecimalFormat;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class PerToCGPA {
	public static void main(String[] args) {
		System.out.println("=== Program to convert Percentage to CGPA ===");
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");

		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm");
		String dateTime = now.format(formatter);

		System.out.println("Date : " + dateTime);

		// Checking if the percentage is exceeding 100 or not.
		System.out.print("How many subjects do you have: ");
		int subjects = sc.nextInt();
		double marks = 0.0; // Directly use primitive types
		for (int i = 1; i <= subjects; i++) {
			System.out.print("Enter your subject " + i + " marks: ");
			double number = sc.nextDouble();
			marks += number;
		}
		double percentage = marks / subjects;
		double cgpa = percentage / 9.5;

		// Use DecimalFormat to format percentage and cgpa
		System.out.println("Your current percentage is " + df.format(percentage) + " and CGPA is " + df.format(cgpa));
	}
}
