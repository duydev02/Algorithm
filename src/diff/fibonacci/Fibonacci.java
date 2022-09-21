package diff.fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter fibonacci chain length: ");
        int n = scanner.nextInt();
        long f0 = 0, f1 = 1, fn = 0;
        List<Long> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (i < 2) {
//                System.out.print(i + "    ");
                list.add((long) i);
            } else {
                fn = f0 + f1;
                f0 = f1;
                f1 = fn;
//                System.out.print(fn + "    ");
                list.add(fn);
            }
        }
        System.out.println(list.toString());
    }
}
