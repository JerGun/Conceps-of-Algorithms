package Works.Assignment4;

import java.util.Scanner;

public class Assignment4_4 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int row, column;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Row: ");
        row = scanner.nextInt();
        System.out.print("Column: ");
        column = scanner.nextInt();

        int array[][] = new int[row][column];
        int transpose[][] = new int[column][row];

        System.out.print("Enter Matrix (E.g. 1 2 3 4): ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("");

        System.out.println("Matrix");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                transpose[j][i] = array[i][j];
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.println("Transpose Matrix");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
