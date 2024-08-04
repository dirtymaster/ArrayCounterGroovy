package arraycounter.groovy

import grails.gorm.transactions.Transactional

@Transactional
class ArrayService {
    Map<String, Long> countElements(String input) {
        if (!input) return [:]

        input.split(',')
                .collect { it.trim() }
                .findAll { it }
                .groupBy { it }
                .collectEntries { k, v -> [(k): v.size() as Long] }
    }
}
