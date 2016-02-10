package capitalbus

import grails.converters.JSON
import mx.capitalbus.circuit.Bus

class MainController {

    def index() {
        render ( Bus.list() as JSON)
    }
}
