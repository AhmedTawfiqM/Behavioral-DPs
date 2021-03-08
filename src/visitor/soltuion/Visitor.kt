package visitor.soltuion

interface Visitor {
    fun apply(newsPost: NewsPost)
    fun apply(general: GeneralPost)
    fun apply(streamPost: StreamPost)
}