#include <stdio.h>

int plus(int a, int b) {
	int	sum = a + b;
	printf("%d", sum);
	return sum;
}

int minus(int a, int b) {
	int sum = a - b;
	printf("%d", sum);
	return sum;
}

int multiply(int a, int b) {
	int sum = a * b;
	printf("%d", sum);
	return sum;
}

int divide(int a, int b) {
	int sum = a / b;
	printf("%d", sum);
	return sum;
}

//int main() {
//
//	int a;
//	int b;
//	int c;
//
//	printf("set number");
//	 scanf("%d ", &a);
//	 scanf("%d ", &b);
//		
//	printf("choose operation");
//	 scanf("%d", &c);
//
//	if(c == 1){
//	plus(a, b);
//	}
//	else if (c == 2) {
//	minus(a, b);
//	}
//
//	else if (c == 3){
//	multiply(a, b);
//	}	
//	

//	else if(c == 4) {
//	divide(a, b);
//	}
//	return 0;
//}

void main() {
	int a;
	int b;
	char operation;
	
	printf("make a foumula");
	scanf("%d %c %d",&a,&operation,&b);

	
	switch (operation)
	{
	case '+':
		plus(a, b);
		break;
	case '-':
		minus(a, b);
		break;
	case '*':
		multiply(a, b);
		break;
	case '/':
		divide(a, b);
		break;

 		

	}
	

}
