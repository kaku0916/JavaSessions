package AssisgmentOne;

public class LoopAssigment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. WAP to print following output: I am Batman﻿ I am Batman﻿ I am Batman﻿ I am
		 * Batman I am Batman
		 */

		String name = "I am Batman";

		for (int i = 0; i < 5; i++) {
			System.out.println(name);
		}

		/*
		 * 2. WAP to print following output: I am Batman 1 I am Batman 2 I am Batman 3 I
		 * am Batman 4 I am Batman 5 I am Batman 6 I am Batman 7 I am Batman 8 I am
		 * Batman 9
		 */
		System.out.println("<-------------------------->");
		String name1 = "I am Batman";

		for (int i = 1; i <= 9; i++) {
			System.out.println(name1 + " " + i);
		}

		// 3.WAP to print 10 to 1 using for, while and do-while loop
		System.out.println("<-------------------------->");
		// while
		int i = 10;
		while (i >= 1) {
			System.out.println(i);// 109871
			i--;// 987
		}

		System.out.println("<-------------------------->");
		// Do while

		int j = 10;
		do {
			System.out.println(j);
			j--;
		} while (j >= 1);

		// 4. Write a program in Java to print "Hello World" ten times using while loop

		int k = 1;

		while (k <= 10) {

			System.out.println("Hello World");
			k++;
		}

		// 5. Write a program in Java to print all the multiplication of 5 from 1 to 100
		// using while /for/do-while loop

		System.out.println("Mutiplicatoion of 5 between 1 to 100");
      
		for (int r = 1; r <= 100; r++) {
			if (r % 5 == 0) {
				System.out.print(r+" ");
			}
		}
		System.out.println("<-------------------------->");
		//while loop
		System.out.println("Mutiplicatoion of 5 between 1 to 100");
	      
		int x=1;
		while(x<=100) {
			if (x % 5 == 0) {
				System.out.print(x+" ");
			}
			x++;
	}
		
		// do while
		System.out.println("<-------------------------->");
		
		System.out.println("Mutiplicatoion of 5 between 1 to 100");
	      
		int y=1;
		do {
			if (y % 5 == 0) {
				System.out.print(y+" ");
			}
			y++;
	}while(y<=100) ;
		
		
		
		//Print all odd and even numbers between 1 to 100
		
		int z=1;
		while(z<=100) {
			if (x % 2 == 0) {
				System.out.print(x+" ");
			}
			else {
				
			}
			z++;
	}
		
		
		//check output
//		int g = 1;
//
//		while(g<=1){
//
//		System.out.println("Hi Java");
//
//		}
		
		
		
}}
