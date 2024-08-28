package TCSNQT;

public class printAllPrimeInGivenRange {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false; // Numbers less than 2 are not prime
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // n is divisible by i, so it's not prime
            }
        }
        return true; // n is prime
    }

    // Method to count the number of prime numbers up to n
    public static int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) { // Start from 2, as 1 is not prime
            if (isPrime(i)) {
                count++; // Increment the count if i is prime
                System.out.print(i+" ");
            }
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10)); // Expected output: 4 (2, 3, 5, 7)
    }
}
