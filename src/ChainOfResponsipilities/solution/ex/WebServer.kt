package ChainOfResponsipilities.solution.ex

import ChainOfResponsipilities.HttpRequest

class WebServer(private val handler: Handler) {

    fun handle(request: HttpRequest) {
        handler.handle(request)
    }
}