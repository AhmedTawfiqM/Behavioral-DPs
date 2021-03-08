package visitor.problem

class LivePost : IPost {
    override fun publish() {
        println("publish LivePost")
    }
}