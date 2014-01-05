import spock.lang.Specification


/**
 * Created by Jared on 1/5/14.
 */
class Problem3Spec extends Specification {
    def "Problem 3 Correct Answer" () {
    given:
    def problem3 = new Problem3(600851475143)

    when:
    problem3.generatePrimes()

    then:
   assert problem3.findLargestPrimeDivisor() == 6857
    }

}