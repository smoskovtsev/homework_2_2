package ru.netology.data

data class Donut(
    val isDonut: Boolean, //Запись доступна только платным подписчикам VK Donut
    val paidDuration: Int, //Время, в течение которого запись будет доступна только платным подписчикам VK Donut
    val placeholder: Placeholder, //Заглушка для пользователей, которые не оформили подписку VK Donut
    val canPublishFreeCopy: Boolean, //Можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut
    val editMode: String //информация о том, какие значения VK Donut можно изменить в записи. Возможные значения:
    //all — всю информацию о VK Donut
    //duration — время, в течение которого запись будет доступна только платным подписчикам VK Donut
)