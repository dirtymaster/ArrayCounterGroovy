package arraycounter.groovy

import grails.testing.mixin.integration.Integration
import grails.testing.services.ServiceUnitTest
import spock.lang.Specification
import spock.lang.Unroll

@Integration(applicationClass = Application.class)
class ArrayServiceSpec extends Specification implements ServiceUnitTest<ArrayService> {
    @Unroll
    def "подсчет элементов в строке: #inputString"() {
        given:
        def result

        when:
        result = service.countElements(inputString)

        then:
        result == expectedResult

        where:
        inputString                                        | expectedResult
        "1,3,4,5,1,5,4"                                    | ["1": 2L, "3": 1L, "4": 2L, "5": 2L]
        "  1, 2, 3, 4,  1,    2,  1   "                    | ["1": 3L, "2": 2L, "3": 1L, "4": 1L]
        "apple, banana, orange, apple, apple, orange"      | [apple: 3L, orange: 2L, banana: 1L]
        ""                                                 | [:]
        " , ,,"                                            | [:]
    }
}

