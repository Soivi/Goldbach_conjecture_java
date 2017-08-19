
public class Goldbach_conjecture {

	public static void main(String[] args) {
		int result = 0;
		int totalNumber = 1000;
		for (int firstPrime = 2; firstPrime <= totalNumber / 2; firstPrime++) {
			boolean firstIsPrime = checkPrime(firstPrime);
			if (firstIsPrime) {
				int secondPrime = totalNumber - firstPrime;
				boolean secondIsPrime = checkPrime(secondPrime);
				if (secondIsPrime) {
					System.out.println(firstPrime + "+" + secondPrime + "=" + totalNumber);
					result++;
				}
			}
		}
		System.out.println(result);
	}

	private static boolean checkPrime(int checkNum) {
		boolean isPrime = true;
		int remainderNum;
		for (int i = 2; i <= checkNum / 2; i++) {
			remainderNum = checkNum % i;
			if (remainderNum == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
