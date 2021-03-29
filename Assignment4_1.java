package Works.Assignment4;

import java.util.Scanner;

public class Assignment4_1 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int A[] = { 10, 13, 14, 5, 7, 20, 3, 6, 1, 15 };
        int B[] = new int[A.length];
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < B.length; i++) {
            B[i] = scanner.nextInt();
            if (A[i] == B[i]) {
                count++;
            }
        }

        if (count == A.length) {
            System.out.println("A equal B");
        } else if (count >= 1) {
            System.out.println("A intersect B");
        } else {
            System.out.println("A disjoint B");
        }
    }
}