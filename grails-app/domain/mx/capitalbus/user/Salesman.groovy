package mx.capitalbus.user

import mx.capitalbus.security.User

class Salesman extends User{

    String firstName
    String lastName
    Date birthdate


    static constraints = {
    }

    static mapping = {
        id generator: 'identity'
    }
}
