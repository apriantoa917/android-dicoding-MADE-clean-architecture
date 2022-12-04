package com.aprianto.cleanarchitecture.data

import com.aprianto.cleanarchitecture.domain.IMessageRepository
import com.aprianto.cleanarchitecture.domain.MessageEntity
/*
* TODO 7 :
*  - merupakan implementasi dari abstraksi / interface repository dalam layer domain
*  - bergantung kepada abstraksi dari layer domain
*  - berisikan logic untuk memproses / menyimpan data menggunakan interface data source
* */
class MessageRepository(private val  messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity = messageDataSource.getMessageFromSource(name)
}