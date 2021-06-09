
public class MakingDecision {

	public static void main(String[] args) {
		
//		int x = 5;
//		
//		if(x == 5) {
//			System.out.println("Value of x is 5");
//		}else {
//			System.out.println("Value of x is not 5");
//		}
//		
//		if(x <= 5) {
//			System.out.println("True");
//		}else {
//			System.out.println("False");
//		}
		
		boolean x = true;
		boolean y = false;
		
		//AND
		if(x && y) {
			System.out.println("Condition is TRUE");
		}else {
			System.out.println("Condition is FALSE");
		}
		
		boolean m = true;
		boolean n = false;
		
		//OR
		if(m || n) {
			System.out.println("Conditon is TRUE");
		}else {
			System.out.println("Condition is FALSE");
		}
		
		int ageOfBoy = 37;
		int ageOfGirl = 18;
		
		if((ageOfBoy >= 21) && !(ageOfGirl >= 18)) { // ! ---> not
			System.out.println("ready to get married!");
		}else {
			System.out.println("wait for it....");
		}
	}

}







