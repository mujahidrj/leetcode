import java.util.*;

// floodFill
public class day10 {
  public int[][] floodFillHelper(int[][] image, int sr, int sc, int newColor, int oldColor) {
    if (sr >= image.length || sc >= image[0].length || sr < 0 || sc < 0)
      return image;

    if (image[sr][sc] != oldColor)
      return image;

    if (image[sr][sc] == newColor)
      return image;

    image[sr][sc] = newColor;

    image = floodFillHelper(image, sr - 1, sc, newColor, oldColor);
    image = floodFillHelper(image, sr + 1, sc, newColor, oldColor);
    image = floodFillHelper(image, sr, sc - 1, newColor, oldColor);
    image = floodFillHelper(image, sr, sc + 1, newColor, oldColor);
    return image;
  }

  public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    int oldColor = image[sr][sc];
    return floodFillHelper(image, sr, sc, newColor, oldColor);
  }
}