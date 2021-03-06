package ChainOfResponsipilities.solution.ex

import ChainOfResponsipilities.HttpRequest

abstract class Handler(val next: Handler?) {

    protected abstract fun doHandle(request: HttpRequest): Boolean

    fun handle(request: HttpRequest) {
        if (doHandle(request))
            return

        next?.handle(request)
    }
}