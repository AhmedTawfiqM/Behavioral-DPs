package visitor.soltuion

object Client {

    @JvmStatic
    fun main(args: Array<String>) {

        val manager = PostsManager()
        manager.addPost(NewsPost())
        manager.addPost(GeneralPost())
        //Now u can add new type
        manager.addPost(StreamPost())

        manager.execute(PublishOperation())
        //now can add Algorithm without affect other algorithms
        //Visitor is a behavioral design pattern that lets you separate algorithms from the objects on which they operate.
        //open for Extension Closed for modification In Action
        println("..............Archive Operation....................")
        manager.execute(ArchiveOperation())
    }
}