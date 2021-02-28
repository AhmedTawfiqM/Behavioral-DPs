package command.solution.ex3_photoshop

import command.solution.ICommand

class BlackWhiteImage : ICommand {

    override fun execute() {
        println("BlackWhite Image Command")
    }
}