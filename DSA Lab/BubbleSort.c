#include <stdio.h>

// BUBBLE SORTING
void main()
{
    int arr[20], n, p, s;
    printf("How many elements you want in your array : ");
    scanf("%d", &n);
    
    // Loop for entering the data in our array
    printf("\n");
    for (int i = 0; i < n; i++) {
        printf("Enter the %d value : ",(i+1));
        scanf("%d",&arr[i]);
    }
    printf("Array before Sorting : ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
    // Now we're going to do sorting
    for (int i = 0; i < n; i++) {
        for(int j = 0; j < (n-i-1); j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    // Printing the sorted array
    printf("\nArray after Sorting : ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
}