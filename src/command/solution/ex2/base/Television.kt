package command.solution.ex2.base

class Television : ElectronicService {

    var volume = 0

    override fun on() {
        println("Television on")
    }

    override fun off() {
        println("Television off")
    }

    override fun volumeUp() {
        volume++
        println("Television  volumeUp $volume")
    }

    override fun volumeDown() {
        --volume
        println("Television  volumeDown $volume")
    }
}