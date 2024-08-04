package arraycounter.groovy

class ArrayController {
    def arrayService

    def index() {
        render view: 'form'
    }

    def count() {
        def numbers = params.numbers
        def result = arrayService.countElements(numbers)
        render view: 'result', model: [result: result]
    }
}
