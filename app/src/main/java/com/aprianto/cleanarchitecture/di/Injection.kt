package com.aprianto.cleanarchitecture.di

import com.aprianto.cleanarchitecture.data.IMessageDataSource
import com.aprianto.cleanarchitecture.data.MessageDataSource
import com.aprianto.cleanarchitecture.data.MessageRepository
import com.aprianto.cleanarchitecture.domain.IMessageRepository
import com.aprianto.cleanarchitecture.domain.MessageInteractor
import com.aprianto.cleanarchitecture.domain.MessageUseCase
/*
* TODO 9 :
*  - membuat dependency injection : untuk injeksi
* */
object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}