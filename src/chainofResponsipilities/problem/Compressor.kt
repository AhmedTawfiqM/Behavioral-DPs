package chainofResponsipilities.problem

import chainofResponsipilities.HttpRequest

class Compressor(private val request: HttpRequest) {

    fun compress() = print("compress ${request.getUsername()}")
}