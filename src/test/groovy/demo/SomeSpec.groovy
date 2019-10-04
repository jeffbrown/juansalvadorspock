package demo

import spock.lang.Specification
import spock.lang.Unroll

class SomeSpec extends Specification {

    // from https://stackoverflow.com/questions/58234273/spock-datatable-just-accepting-integers-in-speck-inputs
    @Unroll
    void 'test to demostrate Spock is just accepting integer in datatable column value'() {
        expect:
        Math.round(value) == result
        where:
        value     | result
        1234      | 1234
        4321.56d  | 4322d
        1111.56f  | 1112d
    }
}
