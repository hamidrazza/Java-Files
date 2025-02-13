#include <stdio.h>
#include <conio.h>
#define max 5

// Global variables
int queue[max];
int front = -1;
int rear = -1;

// functions
void insert();
void deleted();
void display();

void main(){
	int repeat = 1, choice;
	clrscr();
	printf("LINEAR QUEUE\n");
	while(repeat){
		printf("1. Insert\n");
		printf("2. Delete\n");
		printf("3. Display\n");
		printf("0. Exit\n");

		printf("Enter your choice : ");
		scanf("%d", &choice);

		switch(choice){
			case 0:
				break;
			case 1:
				insert();
				break;
			case 2:
				deleted();
				break;
			case 3:
				display();
				break;
			default:
				printf("\nInvalid Input");
				break;
		}
		printf("Want to continue 1/0: ");
		scanf("%d", &repeat);
	}

}
// Inserting an element into queue
void insert(){
	int num;
	if(rear >= max){
		printf("\nQueue is Full");
	}
	else{
		if(front == -1 && rear == -1){
			front++;
		}
		printf("\nEnter an element: ");
		scanf("%d", &num);
		rear++;
		queue[rear] = num;
	}

}
// Deleting the element from front
void deleted(){
	if(front == -1 && rear == -1){
		printf("\nQueue is empty");
	}
	else if(front > rear){
		front = -1;
		rear = -1;
	}
	else{
		queue[front] = NULL;
		front++;
	}
}
// Display the queue from front to rear
void display(){
	int i;
	for(i = front; i <= rear; i++){
		printf("%d ", queue[i]);
	}
	printf("\n");
}