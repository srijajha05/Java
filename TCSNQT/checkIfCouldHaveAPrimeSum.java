package TCSNQT;

public class checkIfCouldHaveAPrimeSum {
    public static boolean isPrime(int n) {
        if (n <= 1){
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
            return false;
            }
        }
        return true;
    }

    public static boolean canBeExpressedAsSumOfTwoPrimes(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println(n + " can be expressed as the sum of " + i + " and " + (n - i));
                return true;
            }
        }
    System.out.println(n + " cannot be expressed as the sum of two prime numbers.");
    return false;
}

    public static void main(String[] args) {
        int n = 74;
        canBeExpressedAsSumOfTwoPrimes(n);
    }
}

