package ru.netology.data

data class Like(
    val count: Int, //Число пользователей, которым понравилась запись
    val userLikes: Boolean, //Наличие отметки «Мне нравится» от текущего пользователя (True — есть, False — нет)
    val canLike: Boolean, //Информация о том, может ли текущий пользователь поставить отметку «Мне нравится»
    // (True — может, False — не может)
    val canPublish: Boolean //Информация о том, может ли текущий пользователь сделать репост записи
    // (True — может, False — не может)
)