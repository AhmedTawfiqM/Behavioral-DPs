package ChainOfResponsipilities.problem

import ChainOfResponsipilities.HttpRequest

class Compressor(private val request: HttpRequest) {

    fun compress() = print("compress ${request.getUsername()}")
}