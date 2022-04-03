package ru.netology.data

data class StickerAttachment(val sticker: Sticker) : Attachment {
    override val type: String = "sticker"
}