package ru.netology.data

data class Sticker(
    val productId: Int, //Идентификатор набора
    val stickerId: Int, //Идентификатор стикера
    val images: Array<ImagesCopy>, //Изображения для стикера с прозраным фоном
    val imagesWithBackground: Array<ImagesWithBackgroundCopy> //Изображения для стикера с непрозрачным фоном
)