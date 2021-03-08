package visitor.soltuion


class PostsManager  {

    private val posts = ArrayList<IPost>()

    fun addPost(post: IPost) = posts.add(post)

    fun execute(visitor: Visitor) {
        posts.forEach {
            it.execute(visitor)
        }
    }


}