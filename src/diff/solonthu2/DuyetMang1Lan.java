package diff.solonthu2;

public class DuyetMang1Lan {

    static void print2largest(int arr[], int arr_size) {
        int i, first, second;

        if (arr_size < 2) {
            System.out.println("Khong hop le");
            return;
        }

        first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }

            if (arr[i] < first && arr[i] > second) {
                second = arr[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("Khong ton tai phan tu lon thu 2");
        } else {
            System.out.println("Phan tu lon thu 2: " + second);
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int n = arr.length;
        print2largest(arr, n);
    }
}
