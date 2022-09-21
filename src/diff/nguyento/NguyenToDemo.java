package diff.nguyento;

import java.util.Scanner;

public class NguyenToDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap do dai cua mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Cac so nguyen to la: ");
        for (int i = 0; i < n; i++) {
            if (isPrimeNumber(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
