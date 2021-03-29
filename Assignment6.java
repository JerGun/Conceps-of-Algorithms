package Works.Assignment6;

import java.util.Scanner;

public class Assignment6 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int size, minimum, index, temp;

        Scanner scanner = new Scanner(System.in);

        // Get Size
        System.out.print("Size of Elements: ");
        size = scanner.nextInt();

        // Create Element[]
        int element[] = new int[size];

        // Get Data
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i+1) + ": ");
            element[i] = scanner.nextInt();
        }

        // Selection Sort
        for (int i = 0; i < size; i++) {
            minimum = element[i];
            temp = element[i];
            index = i;
            for (int j = i; j < size; j++) {
                if (element[j] < minimum) {
                    minimum = element[j];
                    index = j;
                }
            }
            element[i] = minimum;
            element[index] = temp;
        }

        // Output
        System.out.print("Sorted Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(element[i]);
            if (i != size - 1) {
                System.out.print(", ");
            }
        }
    }
}
