import Jama.Matrix;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Nikita on 21.02.2015.
 */
public class MainClass{
    public static void main(String[] args) throws IOException {
        boolean variable = true;
        while(variable) {
            try {
                    System.out.print("Enter dimension of the matrix: n = ");
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    String buf = br.readLine();
                    int n = Integer.parseInt(buf);
                    variable = false;
                    GenerateMatrix matrix = new GenerateMatrix(n);
                    matrix.showMatrix();
                    Matrix matrix1 = new Matrix(matrix.getMatr());
                    System.out.println("Determinant of it's matrix: det = " + (int) matrix1.det());
            }
            catch(NumberFormatException e){
                System.out.println("Enter number!");
            }
        }

    }
}