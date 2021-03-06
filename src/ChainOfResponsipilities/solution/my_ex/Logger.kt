package ChainOfResponsipilities.solution.my_ex

import ChainOfResponsipilities.HttpRequest
import ChainOfResponsipilities.solution.Webserver

class Logger : Webserver {

    override fun handle(request: HttpRequest): Boolean {
        println("log ${request.getUsername()}")
        return true
    }
}