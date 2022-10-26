package com.fernandez.mia.bullyingsecretalert

import java.io.Serializable

data class User(
    val id: String,
    val name: String,
    val apellido: String,
    val email: String,
    val sexo: String,
    val username: String,
    val password: String,
):Serializable{
    fun getImage() = "\"https://graph.facebook.com/$id/picture?type=large&width=720&height=720\""
}
