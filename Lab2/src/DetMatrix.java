import Jama.Matrix;

/**
 * Created by Nikita on 28.02.2015.
 */
public class DetMatrix {
    public static double gauss (Matrix mt1) {
        int rows = mt1.getSize().getRows();
        int cols = mt1.getSize().getColumns();
        double result = 1;
        int count;
    /*копируем полученную матрицу в "рабочую" матрицу mt (Она обрабатывается
     в циклах)*/
        Matrix mt = new Matrix();
        mt.setSize(rows, cols);
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                mt.setElem(i, j, mt1.getElem(i, j));
            }
        }
    /*копируем полученную матрицу в "статическую" матрицу mt2, в неё
     копируется "рабочая матрица" mt, после зануления очередного столбца*/
        Matrix mt2 = new Matrix();
        mt2.setSize(rows, cols);
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                mt2.setElem(i, j, mt1.getElem(i, j));
            }
        }
    /*Матрицы mt и mt2 необходимы, чтобы не испортить получаемую матрицу mt1,
    которая может быть использована в других областях программы
    строим треугольную матрицу*/
        for (int i=0; i<cols; i++){

            //проверка на НЕнулевой i-тый элемент строки
            if (mt.getElem(i, i)==0 && i<rows-1)
            {
                count = i;
                do{
                    mt.getElem(count, 0);
                    count++;
                }while(mt.getElem(count, 0) == 0);
                mt = MatrixCalculator.swapLine(i, count, mt);
                result = -result; // Если была совершена перестановка —
            }                 // меняем знак определителя

        /*копирование "рабочей" матрицы в "статическую", необходимо
        для корректного расчета коофициентов умножения строк перед вычитанием*/
            for (int x=0; x<rows; x++){
                for (int y=0; y<cols; y++){
                    mt2.setElem(x, y, mt.getElem(x, y));
                }
            }

            //зануление i-того столбца
            for (int j=i+1; j<rows; j++){
                for (int k=i; k<cols; k++){
                    double tmp = mt.getElem(j, k)-((mt.getElem(i, k)*mt2.getElem(j, i))/mt.getElem(i, i));
                    mt.setElem(j, k, tmp);
                }
            }

        }
        //Вычисление определителя
        for (int x=0; x<rows; x++){
            result = result*mt.getElem(x, x);
        }

        return result;
    }
}
