package ru.netology.service

import ru.netology.data.Post

class WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += if(posts.isEmpty()) post.copy(id = 1) else post.copy(id = posts.last().id + 1)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for(i in posts.indices){
            if(posts[i].id == post.id){
                posts[i] = post.copy(id = posts[i].id, ownerId = posts[i].ownerId, date = posts[i].date)
                return true
            }
        }
        return false
    }
}