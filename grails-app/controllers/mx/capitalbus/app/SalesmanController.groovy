package mx.capitalbus.app

import grails.converters.JSON
import mx.capitalbus.app.repository.SalesmanRepository
import mx.capitalbus.user.Salesman


class SalesmanController {

    SalesmanRepository salesmanRepository

    def index(String q) {
        render(salesmanRepository.getBySearch(q ?: params.list('q')) as JSON)
    }
    def get(Integer id) {

        def v = Salesman.findById(id ?: params.int('id'))
        if (v != null) {
            render(v as JSON);
        } else {
            response.status = 404
            render([message: message(code: "vendedor.notFound")] as JSON)
        }
        render(results as JSON)
    }
}
