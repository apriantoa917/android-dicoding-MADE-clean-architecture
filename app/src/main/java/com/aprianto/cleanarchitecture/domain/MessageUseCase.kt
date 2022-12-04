package com.aprianto.cleanarchitecture.domain

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}