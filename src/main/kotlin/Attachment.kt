abstract class Attachment {
    abstract val type: String
}

data class Photo(
    val id: Int,
    val albumId: Int,
    val ownerId: Int,
    val userId: Int,
    val albumName: String
)

data class Video(
    val id: Int,
    val albumId: Int,
    val ownerId: Int,
    val userId: Int,
    val videoName: String
)

data class Audio(
    val id: Int,
    val albumId: Int,
    val ownerId: Int,
    val userId: Int,
    val albumName: String
)

data class Doc(
    val id: Int,
    val ownerId: Int,
    val userId: Int,
    val docType: String,
    val totalPagesNumber: Int
)

data class Contact(
    val id: Int,
    val ownerId: Int,
    val userId: Int,
    val contactType: String,
    val phoneNumber: String
)

data class PhotoAttachment(
    override val type: String = "photo",
    val photo: Photo
) : Attachment()

data class VideoAttachment(
    override val type: String = "video",
    val video: Video
) : Attachment()

data class AudioAttachment(
    override val type: String = "audio",
    val audio: Audio
) : Attachment()

data class DocAttachment(
    override val type: String = "doc",
    val doc: Doc
) : Attachment()

data class ContactAttachment(
    override val type: String = "contact",
    val contact: Contact
) : Attachment()