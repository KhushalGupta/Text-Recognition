// Software: Handwriting Recognition Software in Java

package LibOCR;

public class Enhance {

    static int mask[][] = {{1, 2, 1}, {2, 4, 2}, {1, 2, 1}};

    public static int get(int InfoGray[][], int x, int y, int width, int height) {
        if ((x < 0) || (x >= width) || (y < 0) || (y >= height)) {
            return 0;
        }
        return InfoGray[x][y];
    }

    public static int Calculate(int InfoGray[][], int x, int y, int width, int height) {
        int i, j, u, v, res;
        res = 0;
        for (i = -1; i <= 1; i++) {
            for (j = -1; j <= 1; j++) {
                u = x + i;
                v = y + j;
                res += get(InfoGray, u, v, width, height) * mask[1 + i][1 + j];
            }
        }
        return res / 16;
    }

    public static void Execute(int InfoGray[][], int width, int height) {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                InfoGray[x][y] = Calculate(InfoGray, x, y, width, height);
            }
        }
    }

}
