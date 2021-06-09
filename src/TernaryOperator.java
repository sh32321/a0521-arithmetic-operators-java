
public class TernaryOperator {

	public static void main(String[] args) {
		int x = 12;
		boolean y;
		
		y = (10 == x) ? true : false;
		
		System.out.println(y);
		
		int ageOfBoy = 37;
		int ageOfGirl = 18;
		boolean result;
		result = ((ageOfBoy >= 21) && (ageOfGirl >= 18)) ? true : false;
		System.out.println(result);

	}

}
