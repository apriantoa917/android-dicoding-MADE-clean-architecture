package com.aprianto.cleanarchitecture.domain
/*
* TODO 2 :
*  - interface repository digunakan sebagai blueprint dari proses bisnis yang diimplement dalam use case
*
* */
interface IMessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
}