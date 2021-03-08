package chainofResponsipilities.solution.ex

import chainofResponsipilities.HttpRequest

class WebServer(private val handler: Handler) {

    fun handle(request: HttpRequest) {
        handler.handle(request)
    }
}