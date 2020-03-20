import java.security.SecureRandom;

public class RandomIntegers {

	public static void main(String[] args) {
		//random number object will produce secure random numbers
		SecureRandom secureRandom = new SecureRandom();
		
		//loop 20 times
		for (int counter = 1; counter <= 20; counter++ ) {
			//pick random integer among 1 and 6
			int face = 1 + secureRandom.nextInt(100);
			
			System.out.printf("%d ", face);
			
			
		}

	}

}
