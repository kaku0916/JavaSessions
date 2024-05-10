package AssisgmentOne;

public class Assigment3 {

	public static void main(String[] args) {
		
		boolean a=true;
		boolean b=false;
		// if single false(if finds false shortcircut) in && or & resultant will be false 
		//if single true in ||(if finds true will go inside next) or | resultant will be true 
		
		boolean result =a && b;//true && fasle-fasle
		//boolean result =a || b;//true && fasle-true
		System.out.println(result);

		
		boolean reslutVal=a & b;//true & false -false
		//boolean reslutVal=a | b;//true & false -false
		System.out.println(reslutVal);
	}

}
