package AssisgmentOne;

public class Assisgment {

	public static void main(String[] args) {
		// Add two String
//		String a="Hello";
//		String b="Naveen K";
//      //String con=a+b;
//		//if i add a+b and store in variable and then print that variable 
//      System.out.println(a+" "+b);

		// Add two numbers
		/*
		 * int a=74; int b=36; System.out.println(a+b);
		 */
		// WAJP divide 2 numbers
		int a = 50 / 3;
		float b = 50 / 3;
		System.out.println(a);
		System.out.println(b);

		// Write a Java program to compute the specified expressions and print the
		// output. Go to the editor
		float expression = (float) ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));

		System.out.println(expression);
		
		
		//Try to concat "Hello Selenium" with a character 't'.
		String s1="Hello Selenium";
		char c='t';
		System.out.println(s1+c);
		
		//Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 

		//"Your Total  amount is. 3700"
		
		int f=100;
		int g=200;
		int h=3400;
		int sum=f+g+h;
		System.out.println("Your Total  amount is." +sum);
		
		//Print the ASCII value of the character 'h'
		
		char chr='h';
		System.out.println((int)chr);
		//Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
		
		char ch1='d';
		char ch2=(char)(3+ch1);//100-d,103-g
		System.out.println(ch2);
		
		//Write a program to find the square of the number 3.9.
		float f1=3.9f;
		//float f2=f1*f1;
		System.out.println(f1*f1);
	}

}
