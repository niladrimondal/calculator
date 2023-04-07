package calculation;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * While Loop
		int i = 0;
		int sum = 0;
		while(i < 5) {
		System.out.println(i);	
		i ++;
		sum = sum + i;
		}
		System.out.println(sum);
		
		//do while loop
		int i =0;
		do {
			i ++;
			System.out.println(i);
			
		}while(i < 5);
		
		for (int i=0; i<5; i++) {
			System.out.println(i);
		};
		*/
		Calculator calc = new Calculator();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The First Number \n");
		int num1= scanner.nextInt();
		
		System.out.println("Enter The Second Number \n");
		int num2= scanner.nextInt();	
		
		int sum = calc.sum(num1,num2);
		int multiply = calc.multiply(10, 20);
		int substruc = calc.substruct(30, 10);
		int division = calc.division(40,20);
		
		System.out.println("Sum of the Number:"+ sum);
		System.out.println("Multiply of the Number:"+ multiply);
		System.out.println("Substruction of the Number:"+ substruc);
		System.out.println("Division of the Number:"+ division);
		
	}

}
