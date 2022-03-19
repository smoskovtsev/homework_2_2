package ru.netology

import ru.netology.data.*
import ru.netology.service.WallService

fun main() {
    val wall = WallService()
    val post1 = Post(
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
        signerId = 33333,
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

    val post2 = Post(
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
        signerId = 22222,
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
    wall.add(post1)
    wall.add(post1)
    wall.update(post2)
}