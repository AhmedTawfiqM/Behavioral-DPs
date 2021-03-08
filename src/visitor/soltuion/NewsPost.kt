package visitor.soltuion

class NewsPost : IPost {

    override fun execute(visitor: Visitor) {
        visitor.apply(this)
    }

}