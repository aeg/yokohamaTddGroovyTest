import spock.lang.Specification

/**
 * Created with IntelliJ IDEA.
 * User: TDD
 * Date: 12/09/01
 * Time: 1:53
 * To change this template use File | Settings | File Templates.
 */
class aaaTest extends Specification {


    def "SimpleTest"() {
        when:
           def a = 1
        then:
            assert (a++ == 2)
    }
}