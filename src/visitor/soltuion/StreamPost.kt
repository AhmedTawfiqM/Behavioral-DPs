package visitor.soltuion

class StreamPost : IPost {

    override fun execute(visitor: Visitor) {
        visitor.apply(this)
    }
}