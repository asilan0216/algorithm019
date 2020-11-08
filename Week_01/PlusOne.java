
public class PlusOne {

    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length <= 0){
            return digits;
        }
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0){
                return digits;
            }
            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
        }
    }
}