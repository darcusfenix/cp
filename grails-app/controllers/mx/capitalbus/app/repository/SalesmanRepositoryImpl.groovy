package mx.capitalbus.app.repository

import mx.capitalbus.user.Salesman

/**
 * Created by becm on 2/10/16.
 */
class SalesmanRepositoryImpl implements SalesmanRepository{
    def getBySearch(String s){
        def v = Salesman.createCriteria()
        def results = v.list {
            and {
                eq("enabled", true)
            }
            or {
                like("username", "%" + s + "%")
                like("email", "%" + s + "%")
                like("firstName", "%" + s + "%")
                like("lastName", "%" + s + "%")
            }
            maxResults(25)
        }
        results
    }
}
