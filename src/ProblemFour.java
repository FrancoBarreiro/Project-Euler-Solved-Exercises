import java.math.BigInteger;

public class ProblemFour {

    /*
     * Un número palindrómico se lee igual en ambos sentidos.
     * El palíndromo más grande hecho del producto de dos números de 2 dígitos es 9009 = 91 × 99.
     *
     * Encuentra el palíndromo más grande hecho del producto de dos números de n dígitos.
     */

    public int largestPalindromeProduct(int n) {

        int from = 0;
        int to = 0;

        switch (n) {
            case 1:
                from = 0;
                to = 9;
                break;
            case 2:
                from = 10;
                to = 99;
                break;
            case 3:
                from = 100;
                to = 999;
                break;
            case 4:
                from = 1000;
                to = 9999;
                break;
        }
        boolean isPalindrome;
        int largestPalindrome = 0;
        int multiplication = 0;
        int numberOne = 0;
        int numberTwo = 0;
        for (int i = from; i <= to; i++) {
            for (int j = from; j <= to; j++) {
                isPalindrome = true;
                multiplication = i * j;
                String multiString = String.valueOf(multiplication);
                for (int k = 0; k < multiString.length() / 2; k++) {
                    if (multiString.charAt(k) != multiString.charAt(multiString.length() - k - 1)) {
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome && multiplication > largestPalindrome) {
                    largestPalindrome = multiplication;
                    numberOne = i;
                    numberTwo = j;
                }
            }
        }
        System.out.println("El palindromo más grande es: " + largestPalindrome + " formado por la operación " +
                numberOne +" * "+ numberTwo);
        return largestPalindrome;
    }

}
