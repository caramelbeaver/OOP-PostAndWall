class WallService {
    var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        val postId = assignPostId()
        return if (posts.contains(post) && postId > 0) {
            post
        } else {
            if (postId == -1) {
                post.id = 1
            } else {
                post.id = postId
            }
            posts += post
            posts.last()
        }
    }

    fun update(postIn: Post): Boolean {
        for ((index) in posts.withIndex()) {
            if (posts[index].id == postIn.id) {
                posts[index].fromId = postIn.fromId
                posts[index].createdBy = postIn.createdBy
                posts[index].text = postIn.text
                posts[index].replyOwnerId = postIn.replyOwnerId
                posts[index].replyPostId = postIn.replyPostId
                posts[index].friendsOnly = postIn.friendsOnly
                posts[index].comments = postIn.comments
                posts[index].copyright = postIn.copyright
                posts[index].likes = postIn.likes
                posts[index].reposts = postIn.reposts
                posts[index].views = postIn.views
                posts[index].postType = postIn.postType
                posts[index].signerId = postIn.signerId
                posts[index].canPin = postIn.canPin
                posts[index].canDelete = postIn.canDelete
                posts[index].canEdit = postIn.canEdit
                posts[index].isPinned = postIn.isPinned
                posts[index].markedAsAds = postIn.markedAsAds
                posts[index].isFavorite = postIn.isFavorite
                posts[index].donut = postIn.donut
                posts[index].postponedId = postIn.postponedId
                return true
            }
        }
        return false
    }

    private fun assignPostId(): Int {
        return if (posts.isNotEmpty() && posts.last().id >= 0) {
            posts.last().id + 1
        } else {
            -1
        }
    }
}