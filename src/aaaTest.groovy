import spock.lang.Specification

class aaaTest extends Specification {

    // 変更
    def "SimpleTest"() {
        when:
           def a = 1
        then:
            assert (a++ == 2*(a++)*(a++))
    }
}