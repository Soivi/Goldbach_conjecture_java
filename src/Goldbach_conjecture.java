
public class Goldbach_conjecture {

	public static void main(String[] args) {
		for (int checkNum = 2; checkNum <= 10; checkNum++) {
			int remainderNum;
			boolean isPrime = true;
			for (int i = 2; i <= checkNum / 2; i++) {
				remainderNum = checkNum % i;
				if (remainderNum == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.println(checkNum + " is Prime Number");
			else
				System.out.println(checkNum + " is not Prime Number");

			// System.out.println(result);
		}
	}
}
