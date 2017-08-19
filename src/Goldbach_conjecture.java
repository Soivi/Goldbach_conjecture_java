
public class Goldbach_conjecture {

	public static void main(String[] args) {
		int checkedNumber = 10;
		for (int checkNum = 2; checkNum <= checkedNumber; checkNum++) {
			boolean checkOtherPrime = checkPrime(checkNum);
			if (checkOtherPrime) {
				System.out.println(checkNum + " is Prime Number");
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
