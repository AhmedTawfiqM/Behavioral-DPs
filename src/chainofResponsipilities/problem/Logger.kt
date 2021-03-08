package chainofResponsipilities.problem

import chainofResponsipilities.HttpRequest

class Logger(private val request: HttpRequest) {

    fun log() = print("log ${request.getUsername()}")
}