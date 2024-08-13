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

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static boolean isPalindromeCharAt(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }

            if (i == s.length() / 2) {
                return true;
            }
        }

        return true;
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

    public static int fibonacciRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Please enter a non-negative number !");
        }

        if (n < 3) {
            return 1;
        }

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int multipleOfDigitsOfNumber(int n) {
        int s = 1;

        while (n > 0) {
            s *= n % 10;
            n /= 10;
        }

        return s;
    }

    public static int reverseOfNumber(int n) {
        int s = 0;

        while (n != 0) {
            s = s * 10 + n % 10;
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

    public static String greedyForATM(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Please enter a positive number !");
        }

        int[] moneys = {1, 5, 10, 20, 50, 100, 200};
        StringBuilder s = new StringBuilder();

        for (int i = moneys.length - 1; i >= 0; i--) {
            while (n >= moneys[i]) {
                s.append(moneys[i]).append(" ");
                n -= moneys[i];
            }
        }

        return s.substring(0, s.length() - 1);
    }
}