package ru.skillbranch.devintensive.models

import java.util.*

class TextMessage (
    id:String,
    from:User?,
    chat:Chat,
    isIncome : Boolean = false,
    date: Date = Date(),
    val text:String?
):BaseMessage(id,from, chat, isIncome, date) {
    override fun formatMessage(): String {
        return "$id";
    }
}