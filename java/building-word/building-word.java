public class Challenge {
	public static boolean canBuild(String[] arr) {
		int x = 0;
		while (x < arr.length - 1) {
			if (!checkPair(arr[x++], arr[x])) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkPair(String a, String b) {
		if (a.length() == b.length() - 1 
			&& (
				a.charAt(0) == b.charAt(0)
				|| a.charAt(a.length() - 1) == b.charAt(b.length() - 1)
			)
			&& b.contains(a)
			) {
			return true;
		}
		return false;
	}
}