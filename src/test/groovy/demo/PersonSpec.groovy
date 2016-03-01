package demo

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Person)
class PersonSpec extends Specification {

    void "test name validation"() {
        expect:
        !new Person(name: 'jeff').validate()
        new Person(name: 'Jeff').validate()
    }
}
