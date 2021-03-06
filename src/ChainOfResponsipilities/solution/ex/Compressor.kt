package ChainOfResponsipilities.solution.ex

import ChainOfResponsipilities.HttpRequest

class Compressor(next: Handler?) : Handler(next) {

    override fun doHandle(request: HttpRequest): Boolean {
        println("Compressor : ${request.getUsername()}")
        return false
    }
}