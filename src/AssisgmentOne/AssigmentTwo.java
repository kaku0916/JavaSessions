package AssisgmentOne;

public class AssigmentTwo {

	public static void main(String[] args) {

		// What will be the output of the following program?
		/*
		 * int i=11; i=i++ + ++i; System.out.println(i);
		 */

		// Guess the output of the following program?
		/*
		 * int a=11, b=22,c;
		 * 
		 * c = a + b + a++ + b++ + ++a + ++b; System.out.println(a);
		 * System.out.println(b); System.out.println(c);
		 */

		/*
		 * int i = 0; i = i++ - --i + ++i - i--; System.out.println(i);
		 */

		// Is the below program written correctly?
		// cannot convert from boolean to integer-we cant apply incremt decremt to
		// boolean
		/*
		 *  boolean b = true; b++; System.out.println(b);
		 */
		//What will be the output of the following program?
		/*int i = 1, j = 2, k = 3;
		int m = i-- - j-- - k--;
		System.out.println("i=" + i);
		System.out.println("j=" + j);
		System.out.println("k=" + k);
		System.out.println("m =" + m );*/
		
		//What will be the value of i, j and k in the below program?
		/*int i=19, j=29, k = 0;
		int m = i-- - j-- - k--;
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("k="+k);
	    System.out.println("m="+m);*/
		
		//What is wrong with the below program? Why it is showing compilation error?
		/*int i=11;
		int j=++(i++);*/
		//Reason-increment and decremt return a value
		
		
		//Guess the value of p in the below program?
		/*int m = 0, n = 0;
		int p = --m * --n * n-- * m--;
		System.out.println("m="+m);
		System.out.println("n="+n);
		System.out.println("p="+p);*/
		
		
		//What will be the output of the following program?
		/*int a=1;
		a = a++ + ++a * --a - a--; 
		System.out.println(a);*/
		
		//What will be the outcome of the below program?-Cannot apply increment and decremt operator to number 
		    /* int a = 11++;
		        System.out.println(a);*/
		
		//What will be the outcome of the below program?
		/*int x='j';
		System.out.println(x++);//106*/
		
		/*char ch='A';
		System.out.println(++ch);*/
		
		double d=1.5 ,D=2.5;
		System.out.println(d++ + ++D);
		
		
	}

}
