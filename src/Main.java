public class Main {

    public static void main(String[] args) {
        int[] n = {1, 3, 5, 7, 8, 9};

        System.out.println("isPalindrome: " + Algorithm.isPalindrome(2332));
        System.out.println("isPalindrome: " + Algorithm.isPalindrome("SOSA"));
        System.out.println("isPalindromeCharAt: " + Algorithm.isPalindromeCharAt("ABBA"));
        System.out.println("isPrime: " + Algorithm.isPrime(7));
        System.out.println("averageOfNumbers: " + Algorithm.averageOfNumbers(n));
        System.out.println("factorial: " + Algorithm.factorial(6));
        System.out.println("factorialRecursive: " + Algorithm.factorialRecursive(5));
        System.out.println("fibonacciRecursive: " + Algorithm.fibonacciRecursive(5));
        System.out.println("multipleOfDigitsOfNumber: " + Algorithm.multipleOfDigitsOfNumber(334));
        System.out.println("reverseOfNumber: " + Algorithm.reverseOfNumber(364));
        System.out.println("sumOfDigitsOfNumber: " + Algorithm.sumOfDigitsOfNumber(134));
        System.out.println("greedyForATM: " + Algorithm.greedyForATM(66));
    }
}