/**
 * Created by Jared on 1/5/14.
 */
class Problem4 {

    static boolean isPalindrome(int n) {
        if ((new Integer(n)).toString() == (new Integer(n)).toString().reverse()){
            return true;
        }
        return false;
    }


    def static answer() {
        int product;
        int largestPalindrome = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = i; j < 1000; j++) {
                product = i * j
                if (largestPalindrome < product && isPalindrome(product)) {
                    largestPalindrome = product
                }
            }
        }
        return largestPalindrome
    }

}
