package com.aprianto.cleanarchitecture.data

import com.aprianto.cleanarchitecture.domain.MessageEntity
/*
* TODO 5 :
*  - merupakan abstraksi dari data source yang diimplementasikan nantinya
*  - bergantung pada class entity yang digunakan
* */
interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}