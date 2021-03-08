package chainofResponsipilities.solution

import chainofResponsipilities.HttpRequest

interface Webserver {
    fun handle(request: HttpRequest) : Boolean
}