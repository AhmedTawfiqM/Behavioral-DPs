package state.solution.ex_real_scenario.base

import state.solution.ex_real_scenario.Mail

class OrderedState : MailState {

    override fun next(mail: Mail) {
        mail.setState(DeliveredState())
    }

    override fun previous(mail: Mail) {
        println("The package is in its root state.")
    }

    override fun print() {
        println("Package ordered, not delivered to the office yet.")
    }
}