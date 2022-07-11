data class Comment(
    val ownerId: Int,
    val postId: Int,
    val fromGroup: Int = 0,
    val message: String,
    val replyToComment: Int,
    val attachments: String,
    val stickerId: Int,
    val guid: String

//    val id: Int,
//    val fromId: Int,
//    val date: Int,
//    val text: String,
//    val donut: Post.Donut,
//    val replyToUser: Int,
//    val parentsStack: Array<Comment>?,
//    val thread: Thread
)