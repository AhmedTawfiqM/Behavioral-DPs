package ChainOfResponsipilities.problem

import ChainOfResponsipilities.HttpRequest

class Authenticator(private val request: HttpRequest) {

    fun authenticate(): Boolean {
        return request.getUsername() == "AtDev"
    }
}