package ru.netology.data

data class Repost(
    val count: Int, //Число пользователей, скопировавших запись
    val userReposted: Boolean //Наличие репоста от текущего пользователя (True — есть, False — нет)
)