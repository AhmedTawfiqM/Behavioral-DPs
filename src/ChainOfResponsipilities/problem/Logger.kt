package ChainOfResponsipilities.problem

import ChainOfResponsipilities.HttpRequest

class Logger(private val request: HttpRequest) {

    fun log() = print("log ${request.getUsername()}")
}