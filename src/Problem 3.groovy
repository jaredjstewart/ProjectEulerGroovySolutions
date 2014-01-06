/** Problem 3
 *The prime factors of 13195 are 5, 7, 13 and 29.
 *What is the largest prime factor of the number 600851475143 ?
 */
class Problem3 {

    def static answer(BigInteger n) {
        return factor(n).last()

    }

    def static factor(BigInteger n) {
        int divisor = 1
        def factors = []

        while (n > 1) {
            BigInteger it
            divisor += 1
            while (n % divisor == 0) {
                factors << divisor
                n /= divisor
            }
        }
        return factors


    }
}
