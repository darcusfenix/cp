package mx.capitalbus.bracelet

import mx.capitalbus.circuit.Circuit

class CostBracelet {

    float cost
    PersonDuration personDuration
    Circuit circuit

    static constraints = {
    }

    static mapping = {
        id generator: 'identity'
    }
}
