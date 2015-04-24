/**
 * Created by Nikita on 22.02.2015.
 */
public class VisualMatrix {
    public static int checkColomnOver(int i, int j, GenerateMatrix matrix) {
        for (int k = i; k >= 0; k--)
            if (matrix.getMatr()[k][j] < 0)
                return 1;
            else
                continue;
        return -1;
    }
    public static int checkColomnUnder(int i, int j, GenerateMatrix matrix) {
        for (int k = i; k <= (matrix.getSize() - 1); k++)
            if (matrix.getMatr()[k][j] < 0)
                return 1;
            else
                continue;
        return -1;
    }
}
