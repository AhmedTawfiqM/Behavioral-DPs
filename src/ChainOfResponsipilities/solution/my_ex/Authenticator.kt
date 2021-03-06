package ChainOfResponsipilities.solution.my_ex

import ChainOfResponsipilities.HttpRequest
import ChainOfResponsipilities.solution.Webserver

class Authenticator : Webserver {

    override fun handle(request: HttpRequest) : Boolean{
        val isSuccess = request.getUsername() == "AtDev"
        println("isSuccess ${isSuccess}")
        return isSuccess
    }
}