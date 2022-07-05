data class Post(
    var id: Int = 0,
    val ownerId: Int,
    var fromId: Int,
    var createdBy: Int,
    val date: Int,
    var text: String,
    var replyOwnerId: Int,
    var replyPostId: Int,
    var friendsOnly: Boolean = false,
    var comments: Comments,
    var copyright: Copyright,
    var likes: Likes,
    var reposts: Reposts,
    var views: Views,
    var postType: PostType,

    var postSource: PostSource?,
    var attachments: Array<Attachment>?,
    var geo: Geo?,
    var signerId: Int,
    var copyHistory: Array<Reposts>?,

    var canPin: Boolean = false,
    var canDelete: Boolean = false,
    var canEdit: Boolean = false,
    var isPinned: Boolean = false,
    var markedAsAds: Boolean = false,
    var isFavorite: Boolean = false,
    var donut: Donut,
    var postponedId: Int
)

enum class PostType {
    Post, Copy, Reply, Postpone, Suggest
}

data class Comments(
    val count: Int,
    val canPost: Boolean = false,
    val groupsCanPost: Int,
    val canClose: Boolean = false,
    val canOpen: Boolean = false
)

data class Copyright(
    val id: Int,
    val link: String,
    val name: String,
    val type: String
)

data class Likes(
    val count: Int,
    val userLikes: Boolean = false,
    val canLike: Boolean = false,
    val canPublish: Boolean = false
)

data class Reposts(
    val count: Int,
    val userReposted: Boolean = false
)

data class Views(
    val count: Int
)

data class PostSource(
    val type: Type?,
    val platform: String?,
    val data: String?,
    val url: String
) {
    enum class Type {
        Vk, Widget, Api, Rss, Sms
    }
}

data class Geo(
    val type: String,
    val coordinates: String,
    val place: Place?
) {
    data class Place(
        val id: Int,
        val title: String,
        val latitude: Int,
        val longitude: Int,
        val created: Int,
        val icon: String,
        val checkins: Int,
        val updated: Int,
        val type: Int,
        val country: Int,
        val city: Int,
        val address: String
    )
}

data class Donut(
    val isDonut: Boolean = false,
    val paidDuration: Int,
    val placeHolder: String, // ? Object
    val canPublishFreeCopy: Boolean = false,
    val editMode: EditMode
) {
    enum class EditMode {
        all, duration
    }
}
