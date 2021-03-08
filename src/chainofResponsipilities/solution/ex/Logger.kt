package chainofResponsipilities.solution.ex

import chainofResponsipilities.HttpRequest

class Logger(next: Handler?) : Handler(next) {

    override fun doHandle(request: HttpRequest): Boolean {
        println("Logger : ${request.getUsername()}")
        return false
    }

}