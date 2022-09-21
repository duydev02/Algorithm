package diff.solonthu2;

public class DuyetMang2Lan {

    static void print2largest(int arr[], int arr_size) {
        int i, second;

        if (arr_size < 2) {
            System.out.print("Khong hop le");
            return;
        }

        int largest = second = Integer.MIN_VALUE;

        // Tim phan tu lon nhat
        for (i = 0; i < arr_size; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Tim phan tu lon nhat trong cac phan tu con lai, loai tru largest
        for (i = 0; i < arr_size; i++) {
            if (arr[i] != largest) {
                second = Math.max(second, arr[i]);
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("Khong ton tai phan tu lon thu 2");
        } else {
            System.out.println("Phan tu lon thu 2: " + second);
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 35, 2};
        int n = arr.length;
        print2largest(arr, n);
    }
}
