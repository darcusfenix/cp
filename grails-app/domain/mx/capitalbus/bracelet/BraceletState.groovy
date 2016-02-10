package mx.capitalbus.bracelet

class BraceletState {

    String name
    String description

    static constraints = {
    }

    static mapping = {
        id generator: 'identity'
    }
}
