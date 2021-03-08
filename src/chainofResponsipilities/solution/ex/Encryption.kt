package chainofResponsipilities.solution.ex

import chainofResponsipilities.HttpRequest

class Encryption(next: Handler?) : Handler(next) {

    override fun doHandle(request: HttpRequest): Boolean {
        println("Encryption : ${request.getUsername()}")
        return false
    }
}