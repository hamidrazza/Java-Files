#include <stdio.h>
#include <conio.h>

int top = -1;
int capacity = 10;
int stack[10];
void push();
void pop();
void display();

void main()
{

	int repeat = 1, choice;
	while (repeat)
	{
		printf("1. push\n");
		printf("2. pop\n");
		printf("3. Display\n");
		scanf("%d", &choice);
		switch (choice)
		{
		case 1:
			//clrscr();
			push();
			break;
		case 2:
			//clrscr();
			pop();
			break;
		case 3:
			//clrscr();
			display();
			break;
		default:
			//clrscr();
			printf("Please enter the valid option\n");
			break;
		}
		printf("Enter 1 to continue, OR 0 for exit ");
		scanf("%d", &repeat);
	}
}
void push()
{
	if (top == capacity - 1)
	{
		printf("Stack is Full");
	}
	else
	{
		top++;
		printf("Enter the element: ");
		scanf("%d", &stack[top]);
	}
}
void pop()
{
	if (top == -1)
	{
		printf("Stack is empty");
	}
	else
	{
		printf("Popped element is : %d\n", stack[top]);
	}
}
void display()
{
	int i;
	if (top == -1)
	{
		printf("Stack is empty");
	}
	else
	{
		for (i = top; i >= 0; i--)
		{
			printf("%d ", stack[i]);
		}
		printf("\n");
	}
}
