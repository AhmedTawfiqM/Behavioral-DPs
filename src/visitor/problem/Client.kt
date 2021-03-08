package visitor.problem

object Client {

    @JvmStatic
    fun main(args: Array<String>) {
        val postsManager = PostsManager()
        postsManager.addPost(EventPost())
        postsManager.addPost(LivePost())

        postsManager.publish()
        //todo problem here if u want to add new Functionality to 'IPost' u have to go implement in all Posts
        //todo 2- every time u add new Functionality , u have to mofify 'PostsManager' and that violate Open Closed Principle

        //Visitor is a behavioral design pattern that lets you separate algorithms from the objects on which they operate.
    }
}