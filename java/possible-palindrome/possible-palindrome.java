import java.util.Enumeration;
import java.util.Hashtable;

public class Challenge {
  public static boolean possiblePalindrome(String str) {
    Hashtable<Character, Integer> hash = new Hashtable<>();
    boolean singleUse = false;
    for (int x = 0; x < str.length(); x++) {
      Character c = str.charAt(x);
      Integer val = hash.get(c);
      if (val != null) {
        hash.put(c, val + 1);
      } else {
        hash.put(c, 1);
      }
    }
    Enumeration<Character> keys = hash.keys();
    while (keys.hasMoreElements()) {
      Character key = keys.nextElement();
      Integer keyVal = hash.get(key);
      if (keyVal % 2 != 0) {
        if (!singleUse) {
          singleUse = true;
        } else {
          return false;
        }
      }
    }
    return true;
  }
}