public class Algorithm {

    public static boolean isPalindrome(int n) {
        int m = n;
        int s = 0;

        while (n != 0) {
            s = s * 10 + n % 10;
            n /= 10;
        }

        return m == s;
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double averageOfNumbers(int[] n) {
        if (n.length == 0) {
            throw new IllegalArgumentException("Please enter a non-empty array !");
        }

        int s = 0;

        for (int i = 0; i < n.length; i++) {
            s += n[i];
        }

        return (double) s / n.length;
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Please enter a non-negative number !");
        }

        int s = 1;

        for (int i = 2; i <= n; i++) {
            s *= i;
        }

        return s;
    }

    public static int factorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Please enter a non-negative number !");
        }

        if (n < 2) {
            return 1;
        }

        return n * factorialRecursive(n - 1);
    }

    public static int multipleOfDigitsOfNumber(int n) {
        int s = 1;

        while (n > 0) {
            s *= n % 10;
            n /= 10;
        }

        return s;
    }

    public static int sumOfDigitsOfNumber(int n) {
        int s = 0;

        while (n > 0) {
            s += n % 10;
            n /= 10;
        }

        return s;
    }
}