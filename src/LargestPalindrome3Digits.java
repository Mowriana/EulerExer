public class LargestPalindrome3Digits {
    public static boolean isPalindrome(int integer) {
        String number = String.valueOf(integer);
        return number.equals(new StringBuilder(number).reverse().toString());
    }

    public static void main(String[] args) {

        int max = 0;

        for ( int i = 999 ; i >= 100 ; i--) {
            for (int j = 999 ; j >= 100 ; j-- ) {
                int p = i * j;
                if ( max < p && isPalindrome(p) ) {
                    max = p;
                }
            }
        }
        System.out.println(max);
    }
}
