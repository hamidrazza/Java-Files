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

		// flag: To track if input is right or wrong.
		boolean flag = true;
		System.out.println("Date : " + dateTime);
		// Checking if the percentage is exceeding 100 or not.
		while(flag){
			System.out.print("Enter the percentage value: ");
			double per = sc.nextDouble();
			if(per <= 100 && per >= 0){
				flag = false;
				// Calculating the CGPA
				double cgpa = per/9.5;
				System.out.printf("Percentage %.2f to CGPA is %.2f", per, cgpa);
			}
			else{
				System.out.println("Percentage can't be greater than 100 OR less than 0");
			}
		}
		
	}
}