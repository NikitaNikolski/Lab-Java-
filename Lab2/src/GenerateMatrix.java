/**
 * Created by Nikita on 21.02.2015.
 */

public class GenerateMatrix{
    private int size = 0;
    private double matr[][];

    public int getSize() {
        return size;
    }

    public double[][] getMatr() {
        return matr;
    }

    public GenerateMatrix(int n) {
        this.size = n;
        this.matr = new double[size][size];
        generateMatrix(this.size);
    }
    public void generateMatrix(int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                this.matr[i][j] = (int) ((Math.random() * 2 - 1) * size);
        }
    }
    public void showMatrix() {
        for (int i = 0; i < size; i++){
            for(int j = 0; j < size; j++) {
                if(i != 0 && VisualMatrix.checkColomnOver(i, j, this) == 1 && this.matr[i][j] >= 0) {
                    System.out.print(" " + (int)this.matr[i][j] + " ");
                } else
                if((i + 1) <= (size - 1) && this.matr[i][j] >= 0 && VisualMatrix.checkColomnOver(i, j, this) != 1 &&
                        VisualMatrix.checkColomnUnder(i, j, this) == 1) {
                    System.out.print(" " + (int)this.matr[i][j] + " ");
                } else
                    System.out.print((int)this.matr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
