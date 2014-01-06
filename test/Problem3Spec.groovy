import spock.lang.Specification


/**
 * Created by Jared on 1/5/14.
 */
class Problem3Spec extends Specification {
    def "Problem 3 Correct Answer" () {

    expect:
   assert Problem3.answer(600851475143) == 6857
    }

}