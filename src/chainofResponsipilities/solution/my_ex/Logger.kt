package chainofResponsipilities.solution.my_ex

import chainofResponsipilities.HttpRequest
import chainofResponsipilities.solution.Webserver

class Logger : Webserver {

    override fun handle(request: HttpRequest): Boolean {
        println("log ${request.getUsername()}")
        return true
    }
}