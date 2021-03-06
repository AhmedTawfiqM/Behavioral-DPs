package ChainOfResponsipilities.solution.my_ex

import ChainOfResponsipilities.HttpRequest
import ChainOfResponsipilities.solution.Webserver

class TaskHandler {
    private val tasks = ArrayList<Webserver>()

    fun addTask(task: Webserver){
        tasks.add(task)
    }

    fun execute(request: HttpRequest){
        tasks.forEach { it.handle(request) }
    }
}