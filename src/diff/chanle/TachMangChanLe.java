package diff.chanle;

import java.util.Arrays;
import java.util.Scanner;

public class TachMangChanLe {

    public static void main(String[] args) {
        int n, c, d;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhap vao so phan tu cua mang: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int A[] = new int[n];
        int ch[] = new int[n];
        int le[] = new int[n];

        System.out.println("Nhap cac phan tu cho mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            A[i] = scanner.nextInt();
        }

        c = d = 0;

        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                ch[c] = A[i];
                c++;
            } else {
                le[d] = A[i];
                d++;
            }
        }

        System.out.println("Cac phan tu cua mang ch la: ");
        for (int i = 0; i < c; i++) {
            System.out.print(ch[i] + "\t");
        }

        System.out.println("\nCac phan tu cua mang le la: ");
        for (int i = 0; i < d; i++) {
            System.out.print(le[i] + "\t");
        }
    }
}
