package capitalbus

import grails.converters.JSON
import mx.capitalbus.bracelet.Bracelet

class MainController {

    def index() {
        render ( ["aaa" : Bracelet.findById(1)] as JSON)
    }
}
