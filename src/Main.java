import java.util.*;

//Ввести с консоли n -размерность матрицы а[n][n]
//Задать значения элементов матрицы в интервале значений от -n до n с помощью генератора случайных чисел.
//10.Найти максимальный элемент(ы) в матрице и удалить из матрицы все строки и столбцы, его содержащие.

/**
 * @version 1
 * @author=Maksim Kosach
 */
public class Main {
    /**
     * Ввести с консоли n -размерность матрицы а[n][n]
     * Задать значения элементов матрицы в интервале значений от -n до n с помощью генератора случайных чисел.
     * Найти максимальный элемент(ы) в матрице и удалить из матрицы все строки и столбцы, его содержащие.
     */
    public static void showAuthorAndDate(Date dateOfReceipt) {
        Date dateNow = new Date();
        System.out.println("\n***********************");
        System.out.println("©Maksim Kosach, 2022");
        System.out.println("Date of receipt of the task:\t" + dateOfReceipt);
        System.out.println("Date of completion of the task:\t" + dateNow);
    }

    public static void main(String[] args) {
        Date date1 = new Date(1645086000000L);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the dimension of the matrix and press <Enter>:");
        int dim = scan.nextInt();
        scan.close();

        int matrix[][] = new int[dim][dim];
        Random random = new Random();

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                matrix[i][j] = random.nextInt(2 * dim + 1) - dim;
            }
        }
        System.out.println("Original matrix:");
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        int max = -dim;
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if (matrix[i][j] > max)
                    max = matrix[i][j];
            }
        }
        System.out.println("Maximum element of the matrix: " + max);

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                {
                    if (matrix[i][j] == max) {
                        for (int k = 0; k < dim; k++)
                            matrix[i][k] = -dim - 1;
                        for (int k = 0; k < dim; k++)
                            matrix[k][j] = -dim - 1;
                    }
                }
            }
        }

        System.out.println("New matrix:");
        boolean flag = false;
        for (int i = 0; i < dim; i++) {
            flag = false;
            for (int j = 0; j < dim; j++) {
                if (matrix[i][j] != -dim - 1) {
                    System.out.printf("%4d", matrix[i][j]);
                    flag = true;
                }
            }
            if (flag)
                System.out.println();
        }
        Main.showAuthorAndDate(date1);
    }

}