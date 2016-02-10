package mx.capitalbus.app

import grails.converters.JSON
import mx.capitalbus.user.Salesman

class SalesmanController {

    def search(String q) {
        def search = q ?: params.list('q');
        def v = Salesman.createCriteria()
        def results = v.list {
            and {
                eq("enabled", true)
            }
            or {
                like("username", "%" + search + "%")
                like("email", "%" + search + "%")
                like("firstName", "%" + search + "%")
                like("lastName", "%" + search + "%")
            }
            maxResults(25)
        }
        render(results as JSON)
    }
}
