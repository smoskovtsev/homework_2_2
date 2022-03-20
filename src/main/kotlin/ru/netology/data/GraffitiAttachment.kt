package ru.netology.data

data class GraffitiAttachment(val graffiti: Graffiti) : Attachment {
    override val type: String = "graffiti"
}