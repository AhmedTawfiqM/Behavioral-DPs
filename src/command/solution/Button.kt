package command.solution


class Button(private val command: Command) {

    fun click(){
        command.execute()
    }
}