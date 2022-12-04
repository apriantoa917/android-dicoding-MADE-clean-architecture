package com.aprianto.cleanarchitecture.domain
/*
* TODO 4 :
*  - merupakan implementasi dari abstraksi use case
*  - berisikan perhitungan atau logic dari aplikasi
*  - tidak diganggu gugat & tidak bergantung pada layer lainnya
* */
class MessageInteractor(private val messageRepository: IMessageRepository): MessageUseCase {
    override fun getMessage(name: String): MessageEntity {
        return messageRepository.getWelcomeMessage(name)
    }
}