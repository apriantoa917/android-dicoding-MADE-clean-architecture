package com.aprianto.cleanarchitecture.data

import com.aprianto.cleanarchitecture.domain.IMessageRepository
import com.aprianto.cleanarchitecture.domain.MessageEntity

class MessageRepository(private val  messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity = messageDataSource.getMessageFromSource(name)
}