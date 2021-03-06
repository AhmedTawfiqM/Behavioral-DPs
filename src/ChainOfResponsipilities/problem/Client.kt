package ChainOfResponsipilities.problem

import ChainOfResponsipilities.HttpRequest

object Client {

    @JvmStatic
    fun main(args: Array<String>) {

        //todo the problem here is Client is Tightly coupled on all classes here (new) and the if constructors changed the clients will affect
        val request = HttpRequest("Tawfiq", "12122")

        val authentication = Authenticator(request)
        val compressor = Compressor(request)
        val logger = Logger(request)

        authentication.authenticate()
        compressor.compress()
        logger.log()
    }
}