package visitor.soltuion

class ArchiveOperation : Visitor {

    override fun apply(newsPost: NewsPost) {
        println("archive NewsPost")
    }

    override fun apply(general: GeneralPost) {
        println("archive GeneralPost")
    }

    override fun apply(streamPost: StreamPost) {
        println("archive StreamPost")
    }
}