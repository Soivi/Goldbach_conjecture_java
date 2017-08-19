
public class Goldbach_conjecture {
	public static void main(String[] args) {
		int result = 0;
		int totalNumber = 10000;
		// Check only the other half of the totalNumber. Minus calculation and secondPrime check handles checking of bigger numbers
		for (int firstPrime = 2; firstPrime <= totalNumber / 2; firstPrime++) {
			boolean firstIsPrime = checkPrime(firstPrime);
			if (firstIsPrime) {
				// If the firstNumber was prime then minus from the totalNumber and check if the second is prime
				int secondPrime = totalNumber - firstPrime;
				boolean secondIsPrime = checkPrime(secondPrime);
				// If the second number was prime +1 to result
				if (secondIsPrime) {
					System.out.println(firstPrime + "+" + secondPrime + "=" + totalNumber);
					result++;
				}
			}
		}
		System.out.println(result);
	}
	
	// Give integer get boolean was the integer prime number
	private static boolean checkPrime(int checkNum) {
		boolean isPrime = true;
		int remainderNum;
		// Check remainder of all smaller numbers than checkNum
		for (int i = 2; i <= checkNum / 2; i++) {
			remainderNum = checkNum % i;
			// If remainder is 0 it isn't prime and stop checking
			if (remainderNum == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
