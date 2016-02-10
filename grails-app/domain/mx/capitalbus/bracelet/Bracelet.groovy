package mx.capitalbus.bracelet

import mx.capitalbus.circuit.Bus
import mx.capitalbus.user.Salesman

class Bracelet {
    String code
    Date activationDate
    Date deliveryDate
    Date creationDate

    Salesman salesman
    BraceletState braceletState
    CostBracelet costBracelet
    Bus currentBus

    static constraints = {
        currentBus nullable: true
        salesman nullable: true
        deliveryDate nullable: true
        activationDate nullable: true
    }

    static mapping = {
        id generator: 'identity'
        code sqlType: "char", length: 10, unique: true

    }
}
