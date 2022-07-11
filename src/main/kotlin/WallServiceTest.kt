import org.junit.Test
import org.junit.Assert.*

class WallServiceTest {

    @Test(expected = WallService.PostNotFoundException::class)
    fun shouldThrow() {
        val service = WallService()

        service.add(Post(0,
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
            Post.PostType.Post,
            Post.PostSource(Post.PostSource.Type.Vk,"",""," https://vk.com/"),
            attachments = arrayOf(
                Post.Attachment.Photo.FhotoAttachment(Post.Attachment.Photo(Post.Attachment.Type.Photo, 1, 4, 18, 4, "MyTripToSouth"),"My New Photo Attached File"),
                Post.Attachment.Video.VideoAttachment(Post.Attachment.Video(Post.Attachment.Type.Video, 2, 25, 12, "My walk", 128),"My New Video Attached File"),
                Post.Attachment.Audio.AudioAttachment(Post.Attachment.Audio(Post.Attachment.Type.Audio, 3, 17, 3, 309, "Florida", 2), "My New Audio Attached File"),
                Post.Attachment.Document.DocumentAttachment(Post.Attachment.Document(Post.Attachment.Type.Document, 8, 402, 15, ".doc", 153),"My New Document Attached File"),
                Post.Attachment.Contact.ContactAttachment(Post.Attachment.Contact(Post.Attachment.Type.Contact, 11, 42, 10, "+7-918-356-37-82"), "My New Contact Attached File")
            ),
            Post.Geo("","",Post.Geo.Place(1,"",253511,101537,1647797883,"",5,1647797883,2,159,25,"")),
            25,
            copyHistory = (arrayOf(Post.Reposts(49, false), Post.Reposts(50, true))),
            //copyHistory = null,
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = true,
            markedAsAds = false,
            isFavorite = false,
            Post.Donut(false, 102, placeHolder = "Some String", false, Post.Donut.EditMode.all),
            42))

        val commentBelongToPost = Comment(21,5,15,"New Comment For PostId = 1",4,"photo",15,"GUID NUMBER")
        service.createComment(commentBelongToPost)
    }

    @Test
    fun shouldNotThrow() {
        val service = WallService()

        service.add(Post(0,
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
            Post.PostType.Post,
            Post.PostSource(Post.PostSource.Type.Vk,"",""," https://vk.com/"),
            attachments = arrayOf(
                Post.Attachment.Photo.FhotoAttachment(Post.Attachment.Photo(Post.Attachment.Type.Photo, 1, 4, 18, 4, "MyTripToSouth"),"My New Photo Attached File"),
                Post.Attachment.Video.VideoAttachment(Post.Attachment.Video(Post.Attachment.Type.Video, 2, 25, 12, "My walk", 128),"My New Video Attached File"),
                Post.Attachment.Audio.AudioAttachment(Post.Attachment.Audio(Post.Attachment.Type.Audio, 3, 17, 3, 309, "Florida", 2), "My New Audio Attached File"),
                Post.Attachment.Document.DocumentAttachment(Post.Attachment.Document(Post.Attachment.Type.Document, 8, 402, 15, ".doc", 153),"My New Document Attached File"),
                Post.Attachment.Contact.ContactAttachment(Post.Attachment.Contact(Post.Attachment.Type.Contact, 11, 42, 10, "+7-918-356-37-82"), "My New Contact Attached File")
            ),
            Post.Geo("","",Post.Geo.Place(1,"",253511,101537,1647797883,"",5,1647797883,2,159,25,"")),
            25,
            copyHistory = (arrayOf(Post.Reposts(49, false), Post.Reposts(50, true))),
            //copyHistory = null,
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = true,
            markedAsAds = false,
            isFavorite = false,
            Post.Donut(false, 102, placeHolder = "Some String", false, Post.Donut.EditMode.all),
            42))

        val commentNotToOnePost = Comment(52,1,17,"New Comment For PostId = 2",4,"video",17,"GUID NUMBER")
        service.createComment(commentNotToOnePost)
    }

    @Test
    fun add() {
        val serviceEnter0 = WallService()
        serviceEnter0.add(Post(0,
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
            Post.PostType.Post,
            Post.PostSource(Post.PostSource.Type.Vk,"",""," https://vk.com/"),
            attachments = arrayOf(
                Post.Attachment.Photo.FhotoAttachment(Post.Attachment.Photo(Post.Attachment.Type.Photo, 1, 4, 18, 4, "MyTripToSouth"),"My New Photo Attached File"),
                Post.Attachment.Video.VideoAttachment(Post.Attachment.Video(Post.Attachment.Type.Video, 2, 25, 12, "My walk", 128),"My New Video Attached File"),
                Post.Attachment.Audio.AudioAttachment(Post.Attachment.Audio(Post.Attachment.Type.Audio, 3, 17, 3, 309, "Florida", 2), "My New Audio Attached File"),
                Post.Attachment.Document.DocumentAttachment(Post.Attachment.Document(Post.Attachment.Type.Document, 8, 402, 15, ".doc", 153),"My New Document Attached File"),
                Post.Attachment.Contact.ContactAttachment(Post.Attachment.Contact(Post.Attachment.Type.Contact, 11, 42, 10, "+7-918-356-37-82"), "My New Contact Attached File")
            ),
            Post.Geo("","",Post.Geo.Place(1,"",253511,101537,1647797883,"",5,1647797883,2,159,25,"")),
            25,
            copyHistory = (arrayOf(Post.Reposts(49, false), Post.Reposts(50, true))),
            //copyHistory = null,
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = true,
            markedAsAds = false,
            isFavorite = false,
            Post.Donut(false, 102, placeHolder = "Some String", false, Post.Donut.EditMode.all),
            42))

        val serviceCheck0 = Post(1,
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
            Post.PostType.Post,
            Post.PostSource(Post.PostSource.Type.Vk,"",""," https://vk.com/"),
            attachments = arrayOf(
                Post.Attachment.Photo.FhotoAttachment(Post.Attachment.Photo(Post.Attachment.Type.Photo, 1, 4, 18, 4, "MyTripToSouth"),"My New Photo Attached File"),
                Post.Attachment.Video.VideoAttachment(Post.Attachment.Video(Post.Attachment.Type.Video, 2, 25, 12, "My walk", 128),"My New Video Attached File"),
                Post.Attachment.Audio.AudioAttachment(Post.Attachment.Audio(Post.Attachment.Type.Audio, 3, 17, 3, 309, "Florida", 2), "My New Audio Attached File"),
                Post.Attachment.Document.DocumentAttachment(Post.Attachment.Document(Post.Attachment.Type.Document, 8, 402, 15, ".doc", 153),"My New Document Attached File"),
                Post.Attachment.Contact.ContactAttachment(Post.Attachment.Contact(Post.Attachment.Type.Contact, 11, 42, 10, "+7-918-356-37-82"), "My New Contact Attached File")
            ),
            Post.Geo("","",Post.Geo.Place(1,"",253511,101537,1647797883,"",5,1647797883,2,159,25,"")),
            25,
            //copyHistory = (arrayOf(Post.Reposts(49, false), Post.Reposts(50, true))),
            copyHistory = null,
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = true,
            markedAsAds = false,
            isFavorite = false,
            Post.Donut(false, 102, placeHolder = "Some String", false, Post.Donut.EditMode.all),
            42)

        assertEquals(serviceCheck0.id, serviceEnter0.posts[0].id)

        val serviceEnterId8 = serviceEnter0
        serviceEnterId8.add(Post(2,
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
            Post.PostType.Suggest,
            Post.PostSource(Post.PostSource.Type.Rss,null,null," https://vk.com/"),
            attachments = arrayOf(
                Post.Attachment.Photo.FhotoAttachment(Post.Attachment.Photo(Post.Attachment.Type.Photo, 1, 4, 18, 4, "MyTripToSouth"),"My New Photo Attached File"),
                Post.Attachment.Video.VideoAttachment(Post.Attachment.Video(Post.Attachment.Type.Video, 2, 25, 12, "My walk", 128),"My New Video Attached File"),
                Post.Attachment.Audio.AudioAttachment(Post.Attachment.Audio(Post.Attachment.Type.Audio, 3, 17, 3, 309, "Florida", 2), "My New Audio Attached File"),
                Post.Attachment.Document.DocumentAttachment(Post.Attachment.Document(Post.Attachment.Type.Document, 8, 402, 15, ".doc", 153),"My New Document Attached File"),
                Post.Attachment.Contact.ContactAttachment(Post.Attachment.Contact(Post.Attachment.Type.Contact, 11, 42, 10, "+7-918-356-37-82"), "My New Contact Attached File")
            ),
            Post.Geo("","",Post.Geo.Place(2,"",253511,101580,1647797905,"",5,1647797905,1,183,29,"")),
            47,
            //copyHistory = (arrayOf(Post.Reposts(49, false), Post.Reposts(51, false))),
            copyHistory = null,
            canPin = false,
            canDelete = false,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavorite = true,
            Post.Donut(true, 102, placeHolder = "Some Second String", true, Post.Donut.EditMode.all),
            70))

        assertEquals(2, serviceEnterId8.posts[1].id)
    }

    @Test
    fun updateExisting() {
        // создаём целевой сервис
        val service = WallService()

        // заполняем несколькими постами
        service.add(Post(0,
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
            Post.PostType.Post,
            Post.PostSource(null,null,null," https://vk.com/"),
            attachments = arrayOf(
                Post.Attachment.Photo.FhotoAttachment(Post.Attachment.Photo(Post.Attachment.Type.Photo, 1, 4, 18, 4, "MyTripToSouth"),"My New Photo Attached File"),
                Post.Attachment.Video.VideoAttachment(Post.Attachment.Video(Post.Attachment.Type.Video, 2, 25, 12, "My walk", 128),"My New Video Attached File"),
                Post.Attachment.Audio.AudioAttachment(Post.Attachment.Audio(Post.Attachment.Type.Audio, 3, 17, 3, 309, "Florida", 2), "My New Audio Attached File"),
                Post.Attachment.Document.DocumentAttachment(Post.Attachment.Document(Post.Attachment.Type.Document, 8, 402, 15, ".doc", 153),"My New Document Attached File"),
                Post.Attachment.Contact.ContactAttachment(Post.Attachment.Contact(Post.Attachment.Type.Contact, 11, 42, 10, "+7-918-356-37-82"), "My New Contact Attached File")
            ),
            Post.Geo("MyTypePlace","N:253511,W:101537",null),
            25,
            //copyHistory = (arrayOf(Post.Reposts(49, false), Post.Reposts(50, true))),
            copyHistory = null,
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = true,
            markedAsAds = false,
            isFavorite = false,
            Post.Donut(false, 102, placeHolder = "Some String", false, Post.Donut.EditMode.all),
            42))

        service.add(Post(2,
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
            Post.PostType.Suggest,
            Post.PostSource(Post.PostSource.Type.Api,"",""," https://vk.com/"),
            attachments = arrayOf(
                Post.Attachment.Photo.FhotoAttachment(Post.Attachment.Photo(Post.Attachment.Type.Photo, 1, 4, 18, 4, "MyTripToSouth"),"My New Photo Attached File"),
                Post.Attachment.Video.VideoAttachment(Post.Attachment.Video(Post.Attachment.Type.Video, 2, 25, 12, "My walk", 128),"My New Video Attached File"),
                Post.Attachment.Audio.AudioAttachment(Post.Attachment.Audio(Post.Attachment.Type.Audio, 3, 17, 3, 309, "Florida", 2), "My New Audio Attached File"),
                Post.Attachment.Document.DocumentAttachment(Post.Attachment.Document(Post.Attachment.Type.Document, 8, 402, 15, ".doc", 153),"My New Document Attached File"),
                Post.Attachment.Contact.ContactAttachment(Post.Attachment.Contact(Post.Attachment.Type.Contact, 11, 42, 10, "+7-918-356-37-82"), "My New Contact Attached File")
            ),
            Post.Geo("","",Post.Geo.Place(2,"",253511,101580,1647797905,"",5,1647797905,1,183,29,"")),
            47,
            copyHistory = (arrayOf(Post.Reposts(49, false), Post.Reposts(51, false))),
            //copyHistory = null,
            canPin = false,
            canDelete = false,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavorite = true,
            Post.Donut(true, 102, placeHolder = "Some Second String", true, Post.Donut.EditMode.all),
            70))

        service.add(Post(id = 3,
            ownerId = 63,
            fromId = 13,
            createdBy = 75,
            date = 19,
            text = "Updated Netology Post",
            replyOwnerId = 135,
            replyPostId = 66,
            friendsOnly = true,
            comments = Post.Comments(9, true, 5, canClose = true, canOpen = true),
            copyright = Post.Copyright(85, "https://site-updated", "Some Updated Name", "Some Updated Type"),
            likes = Post.Likes(96, userLikes = false, canLike = true, canPublish = false),
            reposts = Post.Reposts(8, false),
            views = Post.Views(7),
            postType = Post.PostType.Postpone,
            postSource = Post.PostSource(Post.PostSource.Type.Rss,"",""," https://vk.com/"),
            attachments = arrayOf(
                Post.Attachment.Photo.FhotoAttachment(Post.Attachment.Photo(Post.Attachment.Type.Photo, 1, 4, 18, 4, "MyTripToSouth"),"My New Photo Attached File"),
                Post.Attachment.Video.VideoAttachment(Post.Attachment.Video(Post.Attachment.Type.Video, 2, 25, 12, "My walk", 128),"My New Video Attached File"),
                Post.Attachment.Audio.AudioAttachment(Post.Attachment.Audio(Post.Attachment.Type.Audio, 3, 17, 3, 309, "Florida", 2), "My New Audio Attached File"),
                Post.Attachment.Document.DocumentAttachment(Post.Attachment.Document(Post.Attachment.Type.Document, 8, 402, 15, ".doc", 153),"My New Document Attached File"),
                Post.Attachment.Contact.ContactAttachment(Post.Attachment.Contact(Post.Attachment.Type.Contact, 11, 42, 10, "+7-918-356-37-82"), "My New Contact Attached File")
            ),
            geo = Post.Geo("","",Post.Geo.Place(2,"",253511,101580,1647797905,"",5,1647797905,1,183,29,"")),
            signerId = 61,
            copyHistory = (arrayOf(Post.Reposts(49, false), Post.Reposts(51, false))),
            //copyHistory = null,
            canPin = true,
            canDelete = false,
            canEdit = true,
            isPinned = false,
            markedAsAds = true,
            isFavorite = true,
            donut = Post.Donut(true, 8, "Some Old String", false, Post.Donut.EditMode.all),
            postponedId = 40))

        // создаём информацию об обновлении для true
        val update = Post(id = 3,
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
            postType = Post.PostType.Reply,
            postSource = Post.PostSource(Post.PostSource.Type.Sms,"",""," https://vk.com/"),
            attachments = arrayOf(
                Post.Attachment.Photo.FhotoAttachment(Post.Attachment.Photo(Post.Attachment.Type.Photo, 1, 4, 18, 4, "MyTripToSouth"),"My New Updated Photo Attached File"),
                Post.Attachment.Video.VideoAttachment(Post.Attachment.Video(Post.Attachment.Type.Video, 2, 25, 12, "My walk", 128),"My New Updated Video Attached File"),
                Post.Attachment.Audio.AudioAttachment(Post.Attachment.Audio(Post.Attachment.Type.Audio, 3, 17, 3, 309, "Florida", 2), "My New Updated Audio Attached File"),
                Post.Attachment.Document.DocumentAttachment(Post.Attachment.Document(Post.Attachment.Type.Document, 8, 402, 15, ".doc", 153),"My New Updated Document Attached File"),
                Post.Attachment.Contact.ContactAttachment(Post.Attachment.Contact(Post.Attachment.Type.Contact, 11, 42, 10, "+7-918-356-37-82"), "My New Updated Contact Attached File")
            ),
            geo = Post.Geo("","",Post.Geo.Place(2,"",253511,101580,1647797905,"",5,1647797905,1,183,29,"")),
            signerId = 61,
            //copyHistory = (arrayOf(Post.Reposts(49, false), Post.Reposts(51, false))),
            copyHistory = null,
            canPin = false,
            canDelete = false,
            canEdit = true,
            isPinned = false,
            markedAsAds = true,
            isFavorite = false,
            donut = Post.Donut(false, 118, "Some Updated String", true, Post.Donut.EditMode.duration),
            postponedId = 38)

        val result = service.update(update)
        assertTrue(result)

        val updateFalse = Post(id = 6,
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
            postType = Post.PostType.Reply,
            postSource = Post.PostSource(Post.PostSource.Type.Widget,"",""," https://vk.com/"),
            attachments = arrayOf(
                Post.Attachment.Photo.FhotoAttachment(Post.Attachment.Photo(Post.Attachment.Type.Photo, 1, 4, 18, 4, "MyTripToSouth"),"My New Updated Photo Attached File"),
                Post.Attachment.Video.VideoAttachment(Post.Attachment.Video(Post.Attachment.Type.Video, 2, 25, 12, "My walk", 128),"My New Updated Video Attached File"),
                Post.Attachment.Audio.AudioAttachment(Post.Attachment.Audio(Post.Attachment.Type.Audio, 3, 17, 3, 309, "Florida", 2), "My New Updated Audio Attached File"),
                Post.Attachment.Document.DocumentAttachment(Post.Attachment.Document(Post.Attachment.Type.Document, 8, 402, 15, ".doc", 153),"My New Updated Document Attached File"),
                Post.Attachment.Contact.ContactAttachment(Post.Attachment.Contact(Post.Attachment.Type.Contact, 11, 42, 10, "+7-918-356-37-82"), "My New Updated Contact Attached File")
            ),
            geo = Post.Geo("","",Post.Geo.Place(2,"",253511,101580,1647797905,"",5,1647797905,1,183,29,"")),
            signerId = 61,
            //copyHistory = (arrayOf(Post.Reposts(49, false), Post.Reposts(51, false))),
            copyHistory = null,
            canPin = false,
            canDelete = false,
            canEdit = true,
            isPinned = false,
            markedAsAds = true,
            isFavorite = false,
            donut = Post.Donut(false, 118, "Some Updated String", true, Post.Donut.EditMode.duration),
            postponedId = 38)

        val resultFalse = service.update(updateFalse)
        assertFalse(resultFalse)
    }
}