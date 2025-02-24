#include <stdio.h>
#include <conio.h>
#define MAX 10

void main(){
	int n,key,i,j,arr[MAX],start,end,mid;
	clrscr();
	printf("=== Binary Search ===");
	printf("\nEnter the array size : ");
	scanf("%d",&n);


	for(i = 0; i< n;i++){

		printf("Enter the %d element : ",(i+1));
		scanf("%d", &arr[i]);
	}
	//Sorting the element.
	/*
	for(i=0; i < n-1; i++){
		for(j = i+1; j < n;j++){
			if(arr[i] > arr[j]){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}*/
	printf("\nEnter the value to search : ");
	scanf("%d",&key);

	// Now we have sorted array
	// We can now use binary search
	start = 0;
	end = n-1;
	while(start <= end){
		mid = (start+end)/2;

		if(arr[mid] == key){
			printf("Element found %d.",arr[mid]);
			break;
		}
		else{
			if(arr[mid] > key){
				end = mid - 1;
			}
			else{
				start = mid + 1;
			}
		}
	}
	if(start > end){
		printf("Element Not Found");
	}
	getch();
}