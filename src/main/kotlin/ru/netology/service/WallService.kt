package ru.netology.service

import ru.netology.data.*

class PostNotFoundException(message: String) : RuntimeException(message)

class WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comments>()

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

    fun createComment(comment: Comments) {
        var isAdded = false
        for(i in posts.indices){
            if(posts[i].id == comment.postId){
                comments += comment
                isAdded = true
            }
        }
        if(!isAdded) throw PostNotFoundException("No post with id ${comment.postId}")
    }
}