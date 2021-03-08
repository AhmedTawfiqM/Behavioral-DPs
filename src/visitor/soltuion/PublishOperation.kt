package visitor.soltuion

class PublishOperation :Visitor {

    override fun apply(newsPost: NewsPost) {
        println("apply NewsPost")
    }

    override fun apply(general: GeneralPost) {
        println("apply GeneralPost")
    }

    override fun apply(streamPost: StreamPost) {
        println("apply StreamPost")
    }
}