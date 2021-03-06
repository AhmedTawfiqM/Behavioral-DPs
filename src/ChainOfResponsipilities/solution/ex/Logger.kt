package ChainOfResponsipilities.solution.ex

import ChainOfResponsipilities.HttpRequest

class Logger(next: Handler?) : Handler(next) {

    override fun doHandle(request: HttpRequest): Boolean {
        println("Logger : ${request.getUsername()}")
        return false
    }

}