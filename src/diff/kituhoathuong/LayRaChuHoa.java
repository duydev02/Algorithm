package diff.kituhoathuong;

public class LayRaChuHoa {

    public static void main(String[] args) {
        char[] arr = {'a', 'B', 'c', 'D', 'E', 'f'};
        int n = arr.length;
        System.out.println("Cac phan tu in hoa co trong mang: ");
        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(arr[i]) && i % 2 != 0) {
                System.out.print(arr[i] + "\t");
            }
        }
    }
}
