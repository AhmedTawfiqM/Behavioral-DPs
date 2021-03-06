package ChainOfResponsipilities.solution.ex

import ChainOfResponsipilities.HttpRequest

class Authenticator(next: Handler?) : Handler(next) {

    override fun doHandle(request: HttpRequest): Boolean {
        println("Authenticator : ${request.getUsername()}")
        return false
    }
}