package mx.capitalbus.app

import grails.converters.JSON

import java.text.SimpleDateFormat

class VendedorController {
/*
    def index() {
        render(Vendedor.findAllByTipoUsuarioAndActivo(TipoUsuario.findById(4), true) as JSON)
    }

    def totalPulseras() {
        def v = Vendedor.findById(params.int("id"))

        if (v != null)
            render(Pulsera.countByVendedor(v))
        else {
            response.sendError(404)
            render([message: "error"] as JSON)
        }
    }

    def asignaciones() {
        def v = Vendedor.findById(params.int("id"))

        if (v != null) {
            def p = Pulsera.createCriteria()
            def results = p.list {
                and {
                    eq("vendedor", v)
                }
                projections {
                    groupProperty('fechaCreacion')
                    count("fechaCreacion")
                }
            }
            render(results as JSON)
        } else {
            response.sendError(404)
            render([message: "error"] as JSON)
        }
    }

    def resumenAsignaciones() {
        SimpleDateFormat formatter = new SimpleDateFormat("2016-02-08 00:00:00");
        def v = Vendedor.findById(params.int("id"))
        def pf = params.list("f")
        def f

        if (pf != null) {
            f = formatter.parse(pf)
            def costos = CostoPulsera.list()
            def map = [:]
            costos.each { costo ->
                def c = Pulsera.countByVendedorAndFechaCreacionAndCostoPulsera(v, f, costo)
                map.put(costo.id,c)
            }
            render (map as JSON)
        } else {
            response.sendError(404)
            render([message: "error"] as JSON)
        }
    }

    def show(Integer id) {
        render(Vendedor.findById(id ?: params.int("id")) as JSON)
    }

    def get(Integer id) {
        def idTemp = id ?: params.int("id")

        def vendedor = Vendedor.findByIdAndTipoUsuarioAndActivo(idTemp, TipoUsuario.findById(4), true)
        if (vendedor != null) {
            render(vendedor as JSON);
        } else {
            response.status = 404
            render([message: message(code: "vendedor.notFound")] as JSON)
        }
    }

    def email(String q) {
        def search = q ?: params.int('q');
        def v = Vendedor.createCriteria()
        def results = v.list {
            and {
                eq("tipoUsuario", TipoUsuario.findById(4))
                eq("activo", true)
            }
            or {
                like("username", "%" + search + "%")
                like("nombres", "%" + search + "%")
            }
            maxResults(25)
        }
        render(results as JSON)
    }
    */
}
