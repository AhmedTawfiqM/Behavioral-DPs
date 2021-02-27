package command.solution.ex2

import command.solution.ex2.base.ElectronicService
import command.solution.ex2.base.Television

class TvRemote {

    companion object {
        fun getDevice(): ElectronicService {
            return Television()
        }
    }
}