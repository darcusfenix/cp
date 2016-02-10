package mx.capitalbus.bracelet

import mx.capitalbus.circuit.Bus
import mx.capitalbus.user.Salesman

class Bracelet {
    String code
    Date activationDate
    Salesman salesman
    BraceletState braceletState
    Date deliveryDate
    CostBracelet costBracelet
    Bus currentBus

    static constraints = {
    }

    static mapping = {
        id generator: 'identity'
        code sqlType: "char", length: 10, unique: true
        currentBus nullable: true
        salesman nullable: true
        deliveryDate nullable: true
        currentBus nullable: true
    }
}
