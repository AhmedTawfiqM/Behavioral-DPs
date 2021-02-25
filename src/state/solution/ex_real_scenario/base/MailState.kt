package state.solution.ex_real_scenario.base

import state.solution.ex_real_scenario.Mail

interface MailState {
    fun next(mail: Mail)
    fun previous(mail: Mail)
    fun print()
}

abstract class MailStateC {  //more Clean
    abstract fun next(mail: Mail)
    abstract fun previous(mail: Mail)
    fun print(msg: String) {
        println(msg)
    }
}