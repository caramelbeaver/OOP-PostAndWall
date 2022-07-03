fun main() {     // функция main - только для ручного тестирования
    val original = Post(
        0,
        25,
        59,
        12,
        1647797692,
        "New Netology Post",
        37,
        84,
        true,
        Post.Comments(2, true, 4, canClose = false, canOpen = false),
        Post.Copyright(83, "https://--", "Some Name", "Some Type"),
        Post.Likes(95, userLikes = false, canLike = true, canPublish = false),
        Post.Reposts(47, true),
        Post.Views(2),
        Post.PostType.post,
        25,
        canPin = true,
        canDelete = false,
        canEdit = false,
        isPinned = true,
        markedAsAds = false,
        isFavorite = false,
        Post.Donut(false, 102, placeHolder = "Some String", false, Post.Donut.EditMode.all),
        42
    )

    val copy = Post(
        0,
        31,
        43,
        14,
        1647797883,
        "Second Netology Post",
        38,
        137,
        false,
        Post.Comments(5, false, 4, canClose = false, canOpen = true),
        Post.Copyright(83, "https://--", "Some Name", "Some Type"),
        Post.Likes(95, userLikes = false, canLike = true, canPublish = true),
        Post.Reposts(47, false),
        Post.Views(15),
        Post.PostType.suggest,
        47,
        canPin = false,
        canDelete = false,
        canEdit = true,
        isPinned = false,
        markedAsAds = false,
        isFavorite = true,
        Post.Donut(true, 102, placeHolder = "Some Second String", true, Post.Donut.EditMode.all),
        70
    )

    val copyUpdated = Post(
        id = 2,
        ownerId = 111,
        fromId = 56,
        createdBy = 15,
        date = 13,
        text = "Updated Netology Post",
        replyOwnerId = 103,
        replyPostId = 87,
        friendsOnly = false,
        comments = Post.Comments(9, false, 5, canClose = true, canOpen = false),
        copyright = Post.Copyright(85, "https://site-updated", "Some Updated Name", "Some Updated Type"),
        likes = Post.Likes(96, userLikes = true, canLike = true, canPublish = true),
        reposts = Post.Reposts(48, false),
        views = Post.Views(10),
        postType = Post.PostType.reply,
        signerId = 61,
        canPin = false,
        canDelete = false,
        canEdit = true,
        isPinned = false,
        markedAsAds = true,
        isFavorite = false,
        donut = Post.Donut(false, 118, "Some Updated String", true, Post.Donut.EditMode.duration),
        postponedId = 38
    )
    val temp1 = WallService()
    println(temp1.add(original))
    val temp2 = temp1
    println(temp2.add(copy))
    val temp3 = temp2
    println(temp3.update(copyUpdated))
    val temp4: Post = temp3.posts[1]
    println(temp4)

//    println(WallService.add(original))
//    println(WallService.add(copy))
//    println(WallService.update(copyUpdated))
//    println(WallService.posts.last())
}