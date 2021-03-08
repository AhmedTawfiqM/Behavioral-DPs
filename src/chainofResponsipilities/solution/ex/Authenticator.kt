package chainofResponsipilities.solution.ex

import chainofResponsipilities.HttpRequest

class Authenticator(next: Handler?) : Handler(next) {

    override fun doHandle(request: HttpRequest): Boolean {
        println("Authenticator : ${request.getUsername()}")
        return false
    }
}