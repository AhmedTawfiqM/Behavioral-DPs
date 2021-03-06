package ChainOfResponsipilities.solution.my_ex

import ChainOfResponsipilities.HttpRequest
import ChainOfResponsipilities.solution.Webserver

class Compressor : Webserver {

    override fun handle(request: HttpRequest): Boolean {

        println("compress ${request.getUsername()}")
        return true
    }
}