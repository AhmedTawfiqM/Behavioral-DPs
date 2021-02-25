package state.solution.ex_real_scenario.base

import state.solution.ex_real_scenario.Mail

class DeliveredState : MailState {

    override fun next(mail: Mail) {
        mail.setState(ReceivedState())
    }

    override fun previous(mail: Mail) {
        mail.setState(OrderedState())
    }

    override fun print() {
        println("Package delivered to post office, not received yet.")
    }
}