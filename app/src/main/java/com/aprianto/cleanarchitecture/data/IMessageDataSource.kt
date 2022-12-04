package com.aprianto.cleanarchitecture.data

import com.aprianto.cleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}