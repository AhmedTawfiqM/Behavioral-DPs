package command.solution


class Button(private val ICommand: ICommand) {

    fun click(){
        ICommand.execute()
    }
}