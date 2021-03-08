package visitor.problem

class EventPost : IPost {
    override fun publish() {
        println("publish EventPost")
    }
}