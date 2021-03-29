package Works.Assignment4;

import java.util.Scanner;

public class Assignment4_2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int array[] = new int[10];
        int value = 1;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print(i + 1 + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Value: ");
        value = scanner.nextInt();

        while (value != 0) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] == value) {
                    System.out.println("Index: " + j);
                    return;
                }
            }
            System.out.println("-1");
            System.out.print("Value: ");
            value = scanner.nextInt();
        }
    }
}
