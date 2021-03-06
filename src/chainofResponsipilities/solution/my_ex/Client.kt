package chainofResponsipilities.solution.my_ex

import chainofResponsipilities.HttpRequest

object Client {

    @JvmStatic
    fun main(args:  Array<String>){

        val request = HttpRequest("Atdev","asas")

        //todo pipeline of tasks
        val task = TaskHandler()
        task.addTask(Authenticator())
        task.addTask(Logger())
        task.addTask(Compressor())

        task.execute(request)
    }
}