package mx.capitalbus.app

import grails.converters.JSON

class MainController {

    // static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
/*
    def index() {
        render ( PulseraStatus.list() as JSON)
    }
    def pulseras(){
        def vendedor =  Vendedor.findById(170)
        log.error(vendedor)
        if (vendedor != null)
            render Pulsera.findAllByVendedor(vendedor) as JSON
        else{
            response.status = 500
            render( ["error": 500] as JSON)
        }
    }
    def vendedor(){
        render ( Vendedor.findById(170) as JSON)
    }
    */
}
