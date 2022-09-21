package codethieunhi.floodfill;

import java.util.Arrays;

public class Solution {
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];

        if (color != newColor) DFS(image, sr, sc, color, newColor);

        return image;
    }

    public static void DFS(int[][] image, int x, int y, int color, int newColor) {
        if (image[x][y] == color) {
            image[x][y] = newColor;

            if (x >= 1) DFS(image, x - 1, y, color, newColor);
            if (y >= 1) DFS(image, x, y - 1, color, newColor);
            if (x + 1 < image.length) DFS(image, x + 1, y, color, newColor);
            if (y + 1 < image[0].length) DFS(image, x, y + 1, color, newColor);
        }
    }

    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1, sc = 1, color = 2;
        System.out.println(Arrays.deepToString(floodFill(image, sr, sc, color)));
    }
}
