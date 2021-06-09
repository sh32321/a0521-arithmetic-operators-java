
public class ArithmeticOperators {

	public static void main(String[] args) {
		
		int i = 2 + 1;
		System.out.println(i);
		
		//this isn't an arithmetic operation
		String s = "Hello " + "World";
		System.out.println(s);
		
		int z = 12 + 1;
		z = 12 - 1;
		z = 12 * 2;
		z = 12 / 2;
		System.out.println(z);
		
		int mod = 13%2;
		System.out.println(mod);
		
		int x = 10;
		System.out.println(x++); //post fix to x
		System.out.println(x);
		
		int incrementPrefix = 15;
		System.out.println(++incrementPrefix); // prefix
		
		int decrement = 5;
		System.out.println(--decrement);

	}

}
