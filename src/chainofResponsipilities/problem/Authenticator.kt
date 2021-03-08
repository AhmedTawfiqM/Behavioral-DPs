package chainofResponsipilities.problem

import chainofResponsipilities.HttpRequest

class Authenticator(private val request: HttpRequest) {

    fun authenticate(): Boolean {
        return request.getUsername() == "AtDev"
    }
}