package ChainOfResponsipilities.solution.ex

import ChainOfResponsipilities.HttpRequest

class Encryption(next: Handler?) : Handler(next) {

    override fun doHandle(request: HttpRequest): Boolean {
        println("Encryption : ${request.getUsername()}")
        return false
    }
}