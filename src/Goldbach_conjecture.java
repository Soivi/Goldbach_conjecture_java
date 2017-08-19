
public class Goldbach_conjecture {

	public static void main(String[] args) {
		int totalNumber = 10;
		for (int firstPrime = 2; firstPrime <= totalNumber; firstPrime++) {
			boolean checkOtherPrime = checkPrime(firstPrime);
			if (checkOtherPrime) {
				int secondPrime = totalNumber - firstPrime;
				System.out.println(secondPrime + " is Prime Number");
			}
		}
		// System.out.println(result);
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
