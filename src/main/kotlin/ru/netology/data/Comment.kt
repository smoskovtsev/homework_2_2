package ru.netology.data

data class Comment(
    val count: Int, //Количество комментариев
    val canPost: Boolean, //Информация о том, может ли текущий пользователь комментировать запись (True — может, False — не может)
    val groupsCanPost: Boolean, //Информация о том, могут ли сообщества комментировать запись
    val canClose: Boolean, //Может ли текущий пользователь закрыть комментарии к записи
    val canOpen: Boolean //Может ли текущий пользователь открыть комментарии к записи
)