#include <stdio.h>
#include <conio.h>

int front = -1;
int rear = -1;
int capacity = 5;
int queue[5];
void enque();
void deque();
void display();

void main(){
	int repeat=1, choice;
	clrscr();
	while(repeat){
		printf("Choose an option\n");
		printf("1. Insert\n");
		printf("2. Delete\n");
		printf("3. Front\n");
		printf("4. Rear\n");
		printf("5. Display\n");

		scanf("%d", &choice);
		switch(choice){
			case 1:
				enque();
				clrscr();
				break;
			case 2:
				deque();
				clrscr();
				break;
			case 3:
				printf("\nFront element is: %d",queue[front]);
				break;
			case 4:
				printf("\nRear element is: %d",queue[rear]);
				break;
			case 5:
				display();
				break;
			default:
				printf("\nInvalid input\n");
		}
		printf("\nWant to continue 0/1 ");
		scanf("%d", &repeat);
	}
}
void enque(){
	if(rear == capacity-1){
		printf("\nQueue is Full\n");
	}
	else{
		rear++;
		printf("\nEnter the no: ");
		scanf("%d", &queue[rear]);
		if(front == -1){
			front = 0;
		}
		printf("%d is inserted successfully\n",queue[rear]);
	}
}
void deque(){
	if(rear == -1){
		printf("\nQueue is empty\n");
	}
	else{
		printf("\n%d is deleted\n",queue[rear]);
		rear--;
	}
}
void display(){
	if(rear == -1){
		printf("\nQueue is empty\n");
	}
	else{
		int i;
		printf("\nQueue elements are : ");
		for(i= front; i <= rear; i++){
			printf("%d ",queue[i]);
		}
		printf("\n");
	}
}
