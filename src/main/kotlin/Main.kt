fun main() {     // функция main - только для ручного тестирования
    val original = Post(
        id = 0,
        ownerId = 111,
        fromId = 56,
        createdBy = 15,
        date = 1649166635,
        text = "First Netology Post",
        replyOwnerId = 103,
        replyPostId = 87,
        friendsOnly = false,
        comments = Comments(2, true, 4, canClose = false, canOpen = false),
        copyright = Copyright(83, "https://--", "Some Name", "Some Type"),
        likes = Likes(95, userLikes = false, canLike = true, canPublish = false),
        reposts = Reposts(47, true),
        views = Views(2),
        postType = PostType.Post,
        postSource = PostSource(PostSource.Type.Vk,null,null," https://vk.com/"),
        attachments = arrayOf(
            VideoAttachment("video", Video(25, 12, 2, 5,"My walk")),
            AudioAttachment("audio", Audio( 3, 17, 3, 309, "Florida")),
            PhotoAttachment("photo", Photo( 5, 10, 3, 38, "MyTripToSouth")),
            DocAttachment("doc", Doc(8, 402, 15, ".doc", 153)),
            ContactAttachment("contact", Contact( 11, 42, 10, "Home","+7-918-356-37-82")),
        ),
        geo = Geo("","", Geo.Place(1,"",253511, 101537, 1647797883,"", 5, 1647797883, 2, 159, 25,"")),
        25,
        copyHistory = (arrayOf(Reposts(49, false), Reposts(50, true))),
        canPin = true,
        canDelete = false,
        canEdit = false,
        isPinned = true,
        markedAsAds = false,
        isFavorite = false,
        donut = Donut(false, 102, placeHolder = "Some String", false, Donut.EditMode.all),
        42
    )

    val copy = Post(
        id = 0,
        ownerId = 14,
        fromId = 37,
        createdBy = 12,
        date = 1649166710,
        text = "Second Netology Post",
        replyOwnerId = 103,
        replyPostId = 87,
        friendsOnly = false,
        comments = Comments(2, true, 4, canClose = false, canOpen = false),
        copyright = Copyright(83, "https://--", "Some Name", "Some Type"),
        likes = Likes(95, userLikes = false, canLike = true, canPublish = false),
        reposts = Reposts(47, true),
        views = Views(2),
        postType = PostType.Post,
        postSource = PostSource(PostSource.Type.Vk,null,null," https://vk.com/"),
        attachments = arrayOf(
            VideoAttachment("video", Video(25, 12, 2, 5,"My walk")),
            AudioAttachment("audio", Audio( 3, 17, 3, 309, "Florida")),
            PhotoAttachment("photo", Photo( 5, 10, 3, 38, "MyTripToSouth")),
            DocAttachment("doc", Doc(8, 402, 15, ".doc", 153)),
            ContactAttachment("contact", Contact( 11, 42, 10, "Home","+7-918-356-37-82")),
        ),
        geo = Geo("","", Geo.Place(1,"",253511, 101537, 1647797883,"", 5, 1647797883, 2, 159, 25,"")),
        25,
        copyHistory = (arrayOf(Reposts(49, false), Reposts(50, true))),
        canPin = true,
        canDelete = false,
        canEdit = false,
        isPinned = true,
        markedAsAds = false,
        isFavorite = false,
        donut = Donut(false, 102, placeHolder = "Some String", false, Donut.EditMode.all),
        42
    )

    val copyUpdated = Post(
        id = 2,
        ownerId = 96,
        fromId = 11,
        createdBy = 102,
        date = 1649166833,
        text = "Updated Netology Post",
        replyOwnerId = 103,
        replyPostId = 87,
        friendsOnly = false,
        comments = Comments(2, true, 4, canClose = false, canOpen = false),
        copyright = Copyright(83, "https://--", "Some Name", "Some Type"),
        likes = Likes(95, userLikes = false, canLike = true, canPublish = false),
        reposts = Reposts(47, true),
        views = Views(2),
        postType = PostType.Post,
        postSource = PostSource(PostSource.Type.Vk,null,null," https://vk.com/"),
        attachments = arrayOf(
            VideoAttachment("video", Video(15, 12, 2, 5,"My updated walk")),
            AudioAttachment("audio", Audio( 16, 17, 3, 309, "Updated Florida")),
            PhotoAttachment("photo", Photo( 17, 10, 3, 38, "Updated MyTripToSouth")),
            DocAttachment("doc", Doc(18, 13, 15, ".doc", 153)),
            ContactAttachment("contact", Contact( 19, 42, 10, "Home","+7-918-356-37-82")),
        ),
        geo = Geo("","", Geo.Place(1,"",253511, 101537, 1647797883,"", 5, 1647797883, 2, 159, 25,"")),
        25,
        copyHistory = (arrayOf(Reposts(49, false), Reposts(50, true))),
        canPin = true,
        canDelete = false,
        canEdit = false,
        isPinned = true,
        markedAsAds = false,
        isFavorite = false,
        donut = Donut(false, 102, placeHolder = "Some String", false, Donut.EditMode.all),
        70
    )

    val temp1 = WallService()
    println(temp1.add(original))
    val temp2 = temp1
    println(temp2.add(copy))
    val temp3 = temp2
    println(temp3.update(copyUpdated))
    val temp4: Post = temp3.posts[1]
    println(temp4)
}