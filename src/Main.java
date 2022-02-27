import javax.xml.ws.FaultAction;
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

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the dimension of the matrix and press <Enter>:");
        int n = scan.nextInt();
        scan.close();

        int matrix[][] = new int[n][n];
        Random random = new Random();
       // List<List<Integer>> list= new ArrayList<>();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(2 * n + 1) - n;
            }
        }
        System.out.println("Original matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        int max = -n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > max)
                    max = matrix[i][j];
            }
        }
        System.out.println("Maximum element of the matrix: " + max);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                {
                    if (matrix[i][j] == max) {
                        for (int k = 0; k < n; k++) {
                            // matrix[i][k] = null;
                        }
                        for (int k = 1; k < n; k++) {
                            //matrix[k][j] = null;
                        }
                    }
                }
            }
        }


        System.out.println("New matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //if (matrix[i][j] != null)
                System.out.printf("%4d", matrix[i][j]);
                //   else System.out.printf("    ", matrix[i][j]);
            }
            System.out.println();
        }
        Date dateNow = new Date();
        Date date1 = new Date(1645086000000L);
        System.out.println("\n©Maksim Kosach, 2022");
        System.out.println("Date of receipt of the task: \"+date1");
        System.out.println("Date of completion of the task: " + dateNow);
    }
}
