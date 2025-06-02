import java.util.ArrayList;
import java.util.List;

public class Challenge {
	public static String happyAlgorithm(int num) {
		int[] digits = extractDigits(num);
		List<Integer> stepValues = new ArrayList<>();
		int steps = 0;

		while (num != 1 && !stepValues.contains(num)) {
			stepValues.add(num);
			num = getHappySum(digits);
			digits = extractDigits(num);
			steps++;
		}

		steps = steps == 0 ? steps + 1 : steps;
		return num == 1 ? String.format("HAPPY %d", steps) : String.format("SAD %d", steps);
	}

	public static int getHappySum(int[] digits) {
		int sum = 0;
		for (int x = 0; x < digits.length; x++) {
			sum += Math.pow(digits[x], 2);
		}
		return sum;
	}

	public static int[] extractDigits(int num) {
		int[] digits = new int[getIntLength(num)];
		for (int x = digits.length - 1; x >= 0; x--) {
			digits[x] = num % 10;
			num /= 10;
		}
		return digits;
	}

	public static int getIntLength(int num) {
		int length = 0;
		long temp = 1;
		while (temp <= num) {
			length++;
			temp *= 10;
		}
		return length;
	}
}