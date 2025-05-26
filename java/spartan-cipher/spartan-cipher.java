public class GreekSpartans {
  public static String cipher(String message, int nSlide) {
    if (message == null || message.isEmpty())
      return "";

    int messageLength = message.length();
    int columns = (int) Math.ceil((double) messageLength / nSlide);
    char[][] grid = new char[nSlide][columns];
    int idx = 0;
    String encoded = "";

    for (int row = 0; row < nSlide; row++) {
      for (int col = 0; col < columns; col++) {
        if (idx < messageLength) {
          grid[row][col] = message.charAt(idx++);
        } else {
          grid[row][col] = ' ';
        }
      }
    }

    for (int col = 0; col < columns; col++) {
      for (int row = 0; row < nSlide; row++) {
        encoded += grid[row][col];
      }
    }

    return rstrip(encoded.toString());
  }

  public static String rstrip(String input) {
    int x = input.length() - 1;
    while (x >= 0 && Character.isWhitespace(input.charAt(x))) {
      x--;
    }
    return input.substring(0, x + 1);
  }
}