public class Challenge {
	public static String addStrNums(String num1, String num2) {
		int idx1 = num1.length() - 1, idx2 = num2.length() - 1, carry = 0;
		int parsed1, parsed2, sum;
		String finalAnswer = "";

		while (idx1 >= 0 || idx2 >= 0) {
			parsed1 = idx1 < 0 ? 0 : parseCharNum(num1.charAt(idx1--));
			parsed2 = idx2 < 0 ? 0 : parseCharNum(num2.charAt(idx2--));
			sum = parsed1 < 0 || parsed2 < 0 ? -1 : parsed1 + parsed2;
			if (sum < 0) {
				return "-1";
			}
			sum += carry;
			finalAnswer = (sum % 10) + finalAnswer;
			carry = sum > 9 ? 1 : 0;
		}

		if (carry > 0) {
			finalAnswer = carry + finalAnswer;
		}

		return stripLeadingZeros(finalAnswer);
	}

	public static int parseCharNum(Character sn) {
		int result = -1;
		try {
			if (Character.isDigit(sn)) {
				result = Integer.parseInt(sn.toString());
			}
		} catch (NumberFormatException e) {
			return -1;
		}
		return result;
	}

	public static String stripLeadingZeros(String answer) {
		String stripped = answer.replaceAll("^0+", "");
		return stripped.length() > 0 ? stripped : "0";
	}
}