package chainofResponsipilities.solution.my_ex

import chainofResponsipilities.HttpRequest
import chainofResponsipilities.solution.Webserver

class TaskHandler {
    private val tasks = ArrayList<Webserver>()

    fun addTask(task: Webserver){
        tasks.add(task)
    }

    fun execute(request: HttpRequest){
        tasks.forEach { it.handle(request) }
    }
}