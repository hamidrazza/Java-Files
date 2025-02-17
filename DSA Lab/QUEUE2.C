#include <stdio.h>
#include <conio.h>
#define MAX 5

int queue[MAX];
int front = -1;
int size = 0;
int rear = -1;

void enque();
void deque();
void display();

void main(){
	int choice, repeat=1;
	clrscr();
	printf("Circular Queue\n");
	while(repeat){
		printf("\n1. Insert\n");
		printf("2. Delete\n");
		printf("3. Display\n");
		printf("0. Exit\n");

		printf("Enter your choice : ");
		scanf("%d", &choice);

		switch(choice){
			case 1:
				enque();
				break;
			case 2:
				deque();
				break;
			case 3:
				display();
				break;
			case 0:
				repeat = 0;
				break;
			default:
				printf("Invalid Input\n");
		}
	}
}
void enque(){
	if(size == MAX){
		printf("Queue is Full");
	}
	else{
		rear = (front+size)%MAX;
		printf("Enter an element : ");
		scanf("%d", &queue[rear]);
		size++;
	}
}
void deque(){
	if(size == 0){
		printf("Queue is empty\n");
	}
	else{
	      printf("Deleted element is : %d\n", queue[front]);
	      queue[front] = NULL;
	      front = (front+1)%MAX;
	      size--;
	}
}
void display(){
	if(size == 0){
		printf("Queue is empty\n");
	}
	else if(front > rear){
		int i;
		for(i = front; i < MAX; i++){
			printf("%d ",queue[i]);
		}
		for(i = 0; i <= rear; i++){
			printf("%d ", queue[i]);
		}
	}
	else{
		int i;
		for(i=front; i <= rear; i++){
			printf("%d ", queue[i]);
		}
	}
}