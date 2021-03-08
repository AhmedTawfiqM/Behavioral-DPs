package chainofResponsipilities.solution.my_ex

import chainofResponsipilities.HttpRequest
import chainofResponsipilities.solution.Webserver

class Authenticator : Webserver {

    override fun handle(request: HttpRequest) : Boolean{
        val isSuccess = request.getUsername() == "AtDev"
        println("isSuccess ${isSuccess}")
        return isSuccess
    }
}