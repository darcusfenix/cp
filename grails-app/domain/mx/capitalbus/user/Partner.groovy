package mx.capitalbus.user

import mx.capitalbus.security.User

class Partner extends User{

    String companyName

    static constraints = {
    }

    static mapping = {
        id generator: 'identity'
    }
}
