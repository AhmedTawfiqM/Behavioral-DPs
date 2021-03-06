package ChainOfResponsipilities.solution.ex

import ChainOfResponsipilities.HttpRequest


object Client {

    @JvmStatic
    fun main(args: Array<String>) {

        val request = HttpRequest("Atdev","43423432")

        //Encryption
        val encryption  =Encryption(null)
        //(Pipeline) = authenticator -> Compressor - Logger
        val logger = Logger(encryption)
        val compressor = Compressor(logger)
        val authenticator = Authenticator(compressor)

        val server = WebServer(authenticator)
        server.handle(request)
    }
}