package state.solution.ex_real_scenario

import state.solution.ex_real_scenario.base.MailState

class Mail {
    private lateinit var mailState: MailState

    fun setState(mailState: MailState) {
        this.mailState = mailState
    }

    fun next() {
        mailState.next(this)
    }

    fun prev() = mailState.previous(this)
    fun print() = mailState.print()
}