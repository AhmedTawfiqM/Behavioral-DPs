package state.solution.ex_real_scenario.base

import state.solution.ex_real_scenario.Mail

class ReceivedState : MailState {

    override fun next(mail: Mail) {
        println("This package is already received by a client.")
    }

    override fun previous(mail: Mail) {
        mail.setState(DeliveredState())
    }

    override fun print() {
        println("This package is already received by a client.")
    }
}