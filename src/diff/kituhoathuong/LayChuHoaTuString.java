package diff.kituhoathuong;

import java.util.*;

public class LayChuHoaTuString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi can kiem tra: ");
        String str = scanner.nextLine();
        takeCharUppercase(str);
    }

    public static void takeCharUppercase(String str) {
        if (str.isBlank()) {
            System.out.println("Chuoi rong khong co ket qua!");
            return;
        }
        char[] chars = str.toCharArray();
        int n = chars.length;
        System.out.println("Cac ki tu in hoa co trong chuoi la: ");
        TreeSet<Character> test = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(chars[i])) {
//                System.out.print(chars[i] + "\t");
                test.add(chars[i]);
            }
        }
//        Iterator<Character> iterator = test.iterator();
//        while (iterator.hasNext()) {
//            System.out.print((Character) iterator.next() + " ");
//        }
        List<Character> alo = new ArrayList<>();
        for (Character element : test) {
            alo.add(element);
        }
        Collections.reverse(alo);
        System.out.println(alo.toString());
    }
}
