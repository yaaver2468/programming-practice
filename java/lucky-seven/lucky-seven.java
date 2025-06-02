public class NumbersTrio {
  public static boolean luckySeven(int[] r) {
    int firstIdx = 0, secondIdx = 1, thirdIdx = 2;
    int GOAL = 7;

    if (r.length >= 3) {
      while (firstIdx < r.length) {
        while (secondIdx < r.length) {
          while (thirdIdx < r.length) {
            if (r[firstIdx] + r[secondIdx] + r[thirdIdx] == GOAL) {
              return true;
            }
            thirdIdx++;
          }
          secondIdx++;
          thirdIdx = secondIdx + 1;
        }
        firstIdx++;
        secondIdx = firstIdx + 1;
        thirdIdx = secondIdx + 1;
      }
    }
      
    return false;
  }
}