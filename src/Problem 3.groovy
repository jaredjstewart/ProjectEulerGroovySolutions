/**
 * Created by Jared on 1/5/14.
 */
class Problem3 {
    BigInteger numberToFactor
    def primes = []


    Problem3(BigInteger numberToFactor) {
        this.numberToFactor = numberToFactor
    }


    def generatePrimes() {
        primes = []
        for (int i = 2; i < (int) Math.sqrt(numberToFactor); i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break; // exit the inner for loop
                }
            }

            if (isPrimeNumber) {
                primes << i;
            }
        }
    }

    def findLargestPrimeDivisor() {
        int largestPrimeDivisor = 1
        for (int prime : primes) {
            if ((numberToFactor % prime == 0) && prime > largestPrimeDivisor) {
                largestPrimeDivisor = prime
            }
        }
        return largestPrimeDivisor

    }


}
