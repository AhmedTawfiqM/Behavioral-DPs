package ChainOfResponsipilities.solution

import ChainOfResponsipilities.HttpRequest

interface Webserver {
    fun handle(request: HttpRequest) : Boolean
}