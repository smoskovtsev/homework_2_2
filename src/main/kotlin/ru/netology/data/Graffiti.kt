package ru.netology.data

data class Graffiti(
    val id: Int, //Идентификатор граффити
    val ownerId: Int, //Идентификатор автора граффити
    val photo130: String, //URL изображения для предпросмотра
    val photo604: String //URL полноразмерного изображения
)