package chainofResponsipilities.solution.my_ex

import chainofResponsipilities.HttpRequest
import chainofResponsipilities.solution.Webserver

class Compressor : Webserver {

    override fun handle(request: HttpRequest): Boolean {

        println("compress ${request.getUsername()}")
        return true
    }
}