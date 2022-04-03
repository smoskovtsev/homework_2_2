package ru.netology.service

import org.junit.Test

import org.junit.Assert.*
import ru.netology.data.*

class WallServiceTest {

    @Test
    fun add_IdIsNotZero() {
        val wall = WallService()
        val post = Post(
            id = 1,
            ownerId = 222,
            fromId = 333,
            createdBy = 444,
            date = 1000,
            text = "Первая запись",
            replyOwnerId = 555,
            replyPostId = 3,
            friendsOnly = false,
            comments = Comment(
                count = 5,
                canPost = true,
                groupsCanPost = true,
                canClose = true,
                canOpen = true
            ),
            copyright = Copyright(
                id = 555,
                link = "www.vk.com",
                name = "Netology",
                type = "Type"
            ),
            likes = Like(
                count = 100500,
                userLikes = true,
                canLike = true,
                canPublish = true
            ),
            repost = Repost(
                count = 100,
                userReposted = false
            ),
            views = View(
                count = 555
            ),
            postType = "post",
            postSource = PostSource(
                type = "vk",
                platform = "android",
                data = "profilePhoto",
                url = "www.vk.com"
            ),
            attachments = arrayOf(
                AudioAttachment(
                    audio = Audio(
                        id = 1,
                        ownerId = 2,
                        artist = "Sting",
                        title = "Russians",
                        duration = 300,
                        url = "www.sting.com",
                        lyricsId = null,
                        albumId = null,
                        genreId = 10,
                        date = 1234,
                        noSearch = true,
                        isHq = true
                    )
                ),
                GraffitiAttachment(
                    graffiti = Graffiti(
                        id = 1,
                        ownerId = 25,
                        photo130 = "www.xxx.com",
                        photo604 = "www.yyy.com"
                    )
                ),
                NoteAttachment(
                    note = Note(
                        id = 5,
                        ownerId = 500,
                        title = "Zametka",
                        text = "Text zametki",
                        date = 1234,
                        comments = 500,
                        readComments = 100,
                        viewUrl = "www.viewurl.com"
                    )
                ),
                PostedPhotoAttachment(
                    postedPhoto = PostedPhoto(
                        id = 111,
                        ownerId = 222,
                        photo130 = "www.abc.com",
                        photo604 = "www.xyz.com"
                    )
                ),
                StickerAttachment(
                    sticker = Sticker(
                        productId = 12,
                        stickerId = 21,
                        images = arrayOf(),
                        imagesWithBackground = arrayOf()
                    )
                )
            ),
            geo = Geo(
                type = "place",
                coordinates = "coordinates",
                place = null
            ),
            signerId = 33333,
            copyHistory = null,
            canPin = true,
            canDelete = false,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavourite = false,
            donut = Donut(
                isDonut = false,
                paidDuration = 1000,
                placeholder = Placeholder(),
                canPublishFreeCopy = true,
                editMode = "all"
            ),
            postponedId = 2000
        )
        val addPost = wall.add(post)
        assertTrue(addPost.id != 0)
    }

    @Test
    fun update_Existing() {
        val wall = WallService()
        val post = Post(
            id = 2,
            ownerId = 333,
            fromId = 444,
            createdBy = 555,
            date = 2000,
            text = "Вторая запись",
            replyOwnerId = 666,
            replyPostId = 4,
            friendsOnly = true,
            comments = Comment(
                count = 6,
                canPost = true,
                groupsCanPost = true,
                canClose = true,
                canOpen = true
            ),
            copyright = Copyright(
                id = 666,
                link = "www.netology.ru",
                name = "Kotlin",
                type = "Type"
            ),
            likes = Like(
                count = 100600,
                userLikes = true,
                canLike = true,
                canPublish = true
            ),
            repost = Repost(
                count = 200,
                userReposted = false
            ),
            views = View(
                count = 777
            ),
            postType = "post",
            postSource = PostSource(
                type = "vk",
                platform = "android",
                data = "profilePhoto",
                url = "www.vk.com"
            ),
            attachments = arrayOf(
                AudioAttachment(
                    audio = Audio(
                        id = 1,
                        ownerId = 2,
                        artist = "Sting",
                        title = "Russians",
                        duration = 300,
                        url = "www.sting.com",
                        lyricsId = null,
                        albumId = null,
                        genreId = 10,
                        date = 1234,
                        noSearch = true,
                        isHq = true
                    )
                ),
                GraffitiAttachment(
                    graffiti = Graffiti(
                        id = 1,
                        ownerId = 25,
                        photo130 = "www.xxx.com",
                        photo604 = "www.yyy.com"
                    )
                ),
                NoteAttachment(
                    note = Note(
                        id = 5,
                        ownerId = 500,
                        title = "Zametka",
                        text = "Text zametki",
                        date = 1234,
                        comments = 500,
                        readComments = 100,
                        viewUrl = "www.viewurl.com"
                    )
                ),
                PostedPhotoAttachment(
                    postedPhoto = PostedPhoto(
                        id = 111,
                        ownerId = 222,
                        photo130 = "www.abc.com",
                        photo604 = "www.xyz.com"
                    )
                ),
                StickerAttachment(
                    sticker = Sticker(
                        productId = 12,
                        stickerId = 21,
                        images = arrayOf(),
                        imagesWithBackground = arrayOf()
                    )
                )
            ),
            geo = Geo(
                type = "place",
                coordinates = "coordinates",
                place = null
            ),
            signerId = 22222,
            copyHistory = null,
            canPin = true,
            canDelete = false,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavourite = false,
            donut = Donut(
                isDonut = true,
                paidDuration = 9000,
                placeholder = Placeholder(),
                canPublishFreeCopy = true,
                editMode = "all"
            ),
            postponedId = 2000
        )
        wall.add(post)
        wall.add(post)
        val result = wall.update(post)
        assertTrue(result)
    }

    @Test
    fun update_NotExisting() {
        val wall = WallService()
        val post = Post(
            id = 5,
            ownerId = 333,
            fromId = 444,
            createdBy = 555,
            date = 2000,
            text = "Некая запись",
            replyOwnerId = 666,
            replyPostId = 4,
            friendsOnly = true,
            comments = Comment(
                count = 6,
                canPost = true,
                groupsCanPost = true,
                canClose = true,
                canOpen = true
            ),
            copyright = Copyright(
                id = 666,
                link = "www.netology.ru",
                name = "Kotlin",
                type = "Type"
            ),
            likes = Like(
                count = 100600,
                userLikes = true,
                canLike = true,
                canPublish = true
            ),
            repost = Repost(
                count = 200,
                userReposted = false
            ),
            views = View(
                count = 777
            ),
            postType = "post",
            postSource = PostSource(
                type = "vk",
                platform = "android",
                data = "profilePhoto",
                url = "www.vk.com"
            ),
            attachments = arrayOf(
                AudioAttachment(
                    audio = Audio(
                        id = 1,
                        ownerId = 2,
                        artist = "Sting",
                        title = "Russians",
                        duration = 300,
                        url = "www.sting.com",
                        lyricsId = null,
                        albumId = null,
                        genreId = 10,
                        date = 1234,
                        noSearch = true,
                        isHq = true
                    )
                ),
                GraffitiAttachment(
                    graffiti = Graffiti(
                        id = 1,
                        ownerId = 25,
                        photo130 = "www.xxx.com",
                        photo604 = "www.yyy.com"
                    )
                ),
                NoteAttachment(
                    note = Note(
                        id = 5,
                        ownerId = 500,
                        title = "Zametka",
                        text = "Text zametki",
                        date = 1234,
                        comments = 500,
                        readComments = 100,
                        viewUrl = "www.viewurl.com"
                    )
                ),
                PostedPhotoAttachment(
                    postedPhoto = PostedPhoto(
                        id = 111,
                        ownerId = 222,
                        photo130 = "www.abc.com",
                        photo604 = "www.xyz.com"
                    )
                ),
                StickerAttachment(
                    sticker = Sticker(
                        productId = 12,
                        stickerId = 21,
                        images = arrayOf(),
                        imagesWithBackground = arrayOf()
                    )
                )
            ),
            geo = Geo(
                type = "place",
                coordinates = "coordinates",
                place = null
            ),
            signerId = 22222,
            copyHistory = null,
            canPin = true,
            canDelete = false,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavourite = false,
            donut = Donut(
                isDonut = true,
                paidDuration = 9000,
                placeholder = Placeholder(),
                canPublishFreeCopy = true,
                editMode = "all"
            ),
            postponedId = 2000
        )
        wall.add(post)
        wall.add(post)
        val result = wall.update(post)
        assertFalse(result)
    }

    @Test
    fun comment_Existing() {
        val wall = WallService()
        val post = Post(
            id = 2,
            ownerId = 333,
            fromId = 444,
            createdBy = 555,
            date = 2000,
            text = "Вторая запись",
            replyOwnerId = 666,
            replyPostId = 4,
            friendsOnly = true,
            comments = Comment(
                count = 6,
                canPost = true,
                groupsCanPost = true,
                canClose = true,
                canOpen = true
            ),
            copyright = Copyright(
                id = 666,
                link = "www.netology.ru",
                name = "Kotlin",
                type = "Type"
            ),
            likes = Like(
                count = 100600,
                userLikes = true,
                canLike = true,
                canPublish = true
            ),
            repost = Repost(
                count = 200,
                userReposted = false
            ),
            views = View(
                count = 777
            ),
            postType = "post",
            postSource = PostSource(
                type = "sms",
                platform = "iphone",
                data = "someAction",
                url = "www.vk.ru"
            ),
            attachments = arrayOf(
                AudioAttachment(
                    audio = Audio(
                        id = 2,
                        ownerId = 3,
                        artist = "Timati",
                        title = "Black star",
                        duration = 300,
                        url = "www.timati.com",
                        lyricsId = null,
                        albumId = null,
                        genreId = 10,
                        date = 1234,
                        noSearch = true,
                        isHq = true
                    )
                ),
                GraffitiAttachment(
                    graffiti = Graffiti(
                        id = 1,
                        ownerId = 25,
                        photo130 = "www.aaa.com",
                        photo604 = "www.bbb.com"
                    )
                ),
                NoteAttachment(
                    note = Note(
                        id = 5,
                        ownerId = 500,
                        title = "Pometka",
                        text = "Text pometki",
                        date = 1234,
                        comments = 500,
                        readComments = 100,
                        viewUrl = "www.checkurl.com"
                    )
                ),
                PostedPhotoAttachment(
                    postedPhoto = PostedPhoto(
                        id = 111,
                        ownerId = 222,
                        photo130 = "www.def.com",
                        photo604 = "www.zyx.com"
                    )
                ),
                StickerAttachment(
                    sticker = Sticker(
                        productId = 34,
                        stickerId = 43,
                        images = arrayOf(),
                        imagesWithBackground = arrayOf()
                    )
                )
            ),
            geo = Geo(
                type = "place",
                coordinates = "coordinates",
                place = null
            ),
            signerId = 22222,
            copyHistory = null,
            canPin = true,
            canDelete = false,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavourite = false,
            donut = Donut(
                isDonut = true,
                paidDuration = 9000,
                placeholder = Placeholder(),
                canPublishFreeCopy = true,
                editMode = "all"
            ),
            postponedId = 2000
        )

        val comment = Comments(
            id = 111,
            fromId = 2222,
            postId = 2,
            date = 12345,
            text = "Test",
            replyToUser = 9876,
            replyToComment = 5432,
            attachments = StickerAttachment(
                sticker = Sticker(
                    productId = 34,
                    stickerId = 43,
                    images = arrayOf(),
                    imagesWithBackground = arrayOf()
                )
            ),
            parentsStack = null,
            thread = null
        )

        wall.add(post)
        wall.add(post)
        wall.createComment(comment)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val wall = WallService()
        val post = Post(
            id = 2,
            ownerId = 333,
            fromId = 444,
            createdBy = 555,
            date = 2000,
            text = "Вторая запись",
            replyOwnerId = 666,
            replyPostId = 4,
            friendsOnly = true,
            comments = Comment(
                count = 6,
                canPost = true,
                groupsCanPost = true,
                canClose = true,
                canOpen = true
            ),
            copyright = Copyright(
                id = 666,
                link = "www.netology.ru",
                name = "Kotlin",
                type = "Type"
            ),
            likes = Like(
                count = 100600,
                userLikes = true,
                canLike = true,
                canPublish = true
            ),
            repost = Repost(
                count = 200,
                userReposted = false
            ),
            views = View(
                count = 777
            ),
            postType = "post",
            postSource = PostSource(
                type = "sms",
                platform = "iphone",
                data = "someAction",
                url = "www.vk.ru"
            ),
            attachments = arrayOf(
                AudioAttachment(
                    audio = Audio(
                        id = 2,
                        ownerId = 3,
                        artist = "Timati",
                        title = "Black star",
                        duration = 300,
                        url = "www.timati.com",
                        lyricsId = null,
                        albumId = null,
                        genreId = 10,
                        date = 1234,
                        noSearch = true,
                        isHq = true
                    )
                ),
                GraffitiAttachment(
                    graffiti = Graffiti(
                        id = 1,
                        ownerId = 25,
                        photo130 = "www.aaa.com",
                        photo604 = "www.bbb.com"
                    )
                ),
                NoteAttachment(
                    note = Note(
                        id = 5,
                        ownerId = 500,
                        title = "Pometka",
                        text = "Text pometki",
                        date = 1234,
                        comments = 500,
                        readComments = 100,
                        viewUrl = "www.checkurl.com"
                    )
                ),
                PostedPhotoAttachment(
                    postedPhoto = PostedPhoto(
                        id = 111,
                        ownerId = 222,
                        photo130 = "www.def.com",
                        photo604 = "www.zyx.com"
                    )
                ),
                StickerAttachment(
                    sticker = Sticker(
                        productId = 34,
                        stickerId = 43,
                        images = arrayOf(),
                        imagesWithBackground = arrayOf()
                    )
                )
            ),
            geo = Geo(
                type = "place",
                coordinates = "coordinates",
                place = null
            ),
            signerId = 22222,
            copyHistory = null,
            canPin = true,
            canDelete = false,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavourite = false,
            donut = Donut(
                isDonut = true,
                paidDuration = 9000,
                placeholder = Placeholder(),
                canPublishFreeCopy = true,
                editMode = "all"
            ),
            postponedId = 2000
        )

        val comment = Comments(
            id = 111,
            fromId = 2222,
            postId = 99,
            date = 12345,
            text = "Test",
            replyToUser = 9876,
            replyToComment = 5432,
            attachments = StickerAttachment(
                sticker = Sticker(
                    productId = 34,
                    stickerId = 43,
                    images = arrayOf(),
                    imagesWithBackground = arrayOf()
                )
            ),
            parentsStack = null,
            thread = null
        )

        wall.add(post)
        wall.add(post)
        wall.createComment(comment)
    }
}