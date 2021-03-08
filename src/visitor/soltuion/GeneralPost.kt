package visitor.soltuion

class GeneralPost : IPost {

    override fun execute(visitor: Visitor) {
        visitor.apply(this)
    }
}