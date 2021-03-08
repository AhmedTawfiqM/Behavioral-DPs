package visitor.problem

class PostsManager {
    private val posts = ArrayList<IPost>()

    fun addPost(post: IPost) = posts.add(post)

    fun publish() {
        posts.forEach {
            it.publish()
        }
    }
}