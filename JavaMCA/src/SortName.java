import java.util.Scanner;
class SortName{
	public static void main(String[] args){
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("How many names you want to enter : ");
		n = scan.nextInt();
		String[] arr = new String[n];
		for(int i = 0; i < n; i++){
			System.out.print("Enter the " + (i+1) + "th element : ");
			arr[i] = scan.next();
		}
		
		for(int i = 0; i < n-1; i++){
			for(int j = i+1; j < n; j++){
				if(arr[i].compareTo(arr[j]) > 0){
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.print("\nSorted Names are: ");
		for(int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
	}
}