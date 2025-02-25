class SortNum{
	public static void main(String[] args){
		int[] arr = new int[] {5,1,7,2,3};
		
		System.out.println("Original Array is given below");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
		for(int i = 0; i < arr.length-1; i++){
			for(int j = i+1; j < arr.length; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("\nSorted Array is: ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}