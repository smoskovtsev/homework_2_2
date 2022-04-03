package ru.netology.data

class Geo(
    val type: String, //Тип места
    val coordinates: String, //Координаты места
    val place: Place? // Описание места (если оно добавлено)
)
