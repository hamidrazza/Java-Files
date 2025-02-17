import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class PerToCGPA{
	public static void main(String[] args){
		System.out.println("=== Program to convert Percentage to CGPA ===");
		Scanner sc = new Scanner(System.in);

		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm");
		String dateTime = now.format(format);

		System.out.println("Date : " + dateTime);
		// Checking if the percentage is exceeding 100 or not.
		System.out.print("How many subjects do you have : ");
		int subject = sc.nextInt();
		double marks = 0;
		for (int i = 1; i <= subject; i++) {
			System.out.print("Enter your subject " + i + " marks : ");
			double number = sc.nextDouble();
			marks += number;
		}
		double percentage =  marks / subject;
		double cgpa = percentage/9.5;
		System.out.println("Your current percentage is " + String.format("%.2f",percentage) + " and CGPA is " + String.format("%.2f",cgpa));
	}
}