import spock.lang.Specification


/**
 * Created by Jared on 1/5/14.
 */
class Problem4Spec extends Specification {

    def "1001 is palindrome" () {
        expect: Problem4.isPalindrome(1001)

    }
    def "12 is not palindrome" () {
        expect: !Problem4.isPalindrome(12)
    }
    def "Problem 4 Correct Answer" () {


    expect:
    assert Problem4.answer() ==906609
    }

}