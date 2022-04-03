package ru.netology.data

data class PostedPhoto(
    val id: Int, //Идентификатор фотографии
    val ownerId: Int, //Идетификатор владельца фотографии
    val photo130: String, //URL изображения для предпросмотра
    val photo604: String //URL полноразмерного изображения
)