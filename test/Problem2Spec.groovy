import spock.lang.Specification


/**
 * Created by Jared on 1/5/14.
 */

class Problem2Spec extends Specification {

    def "Problem 2 correct answer" () {

    expect:
    assert Problem2.answer() == 4613732

    }


}