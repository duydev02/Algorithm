package leetcode;

public class _67_Add_Binary {
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i) - '0';
            if (j >= 0) sum += b.charAt(j) - '0';
            sb.append(sum % 2);
            System.out.println("sum :" + sum);
            System.out.println("sb :" + sb);
            carry = sum / 2;
            System.out.println("carry :" + carry);
            i--;
            j--;
        }

        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }

    public static String addBinary2(String a, String b) {
        boolean carry = false;
        int i = a.length() - 1;
        int j = b.length() - 1;
        // Create a buffer with length equal to the bigger input String + 1 to carry overflow
        // Result of '11' + '1' = '100', so length('11') + 1 = 3
        StringBuilder result = new StringBuilder((Math.max(i, j)) + 1);

        while (i >= 0 || j >= 0) {
            // If one of input is shorter, use '0' as operand. '11' + '1' = '11' + '01'
            char charA = (i >= 0) ? a.charAt(i--) : '0';
            char charB = (j >= 0) ? b.charAt(j--) : '0';

            // Cases when adding Binary
            // 0 + 0 = 0
            // 1 + 0 = 1
            // 1 + 1 = 10
            // 1 + 1 + 1 = 11
            if (charA == '1' && charB == '1') { // 1 + 1
                result = (carry) ? result.append('1') : result.append('0'); // result is 11 or 10 ?
                carry = true;
            } else if (charA == '0' && charB == '0') { // 0 + 0
                result = (carry) ? result.append('1') : result.append('0'); // result is 1 or 0 ?
                carry = false;
            } else { // 1 + 0 or 0 + 1
                result = (carry) ? result.append('0') : result.append('1'); // result is 10 or 1 ?
            }
        }

        // carry overflow : '11' + '1' = '00' + 1 overflow = '001'
        if (carry) result.append('1');

        // reverse the result string : '11' + '1' = '001' , so reverse it to obtain '100'
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1110101", "10101110"));
        System.out.println(addBinary2("1110101", "10101110"));
    }
}
