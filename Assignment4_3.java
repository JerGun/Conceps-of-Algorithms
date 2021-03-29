package Works.Assignment4;

public class Assignment4_3 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 6, 7, 8, 9, 10 };
        int merge[] = new int[a.length + b.length];

        for (int i = 0, j = 0, k = 0; i < (a.length + b.length); i++) {
            if (j < a.length) {
                merge[i] = a[j];
                j++;
            } else if (k < b.length) {
                merge[i] = b[k];
                k++;
            }
            System.out.print(merge[i]);
            if (i != (a.length + b.length - 1)) {
                System.out.print(", ");
            }
        }
    }
}
