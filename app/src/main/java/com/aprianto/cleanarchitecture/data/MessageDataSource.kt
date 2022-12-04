package com.aprianto.cleanarchitecture.data

import com.aprianto.cleanarchitecture.domain.MessageEntity

/*
* TODO 6 :
*  - merupakan implementasi dari abstraksi / interface yang sudah dibuat
*  - berisi logic untuk memproses / mengembalikan nilai dari data source yang ada (local / network)
* */
class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String) = MessageEntity("Hello $name! Welcome to Clean Architecture")
}