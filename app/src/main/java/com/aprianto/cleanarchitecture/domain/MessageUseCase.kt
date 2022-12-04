package com.aprianto.cleanarchitecture.domain
/*
* TODO 3 :
*  - membuat interface yang berisikan abstraksi dari proses bisnis yang dijalankan dalam aplikasi
*  - merupakan core berupa blueprint dari aplikasi yang berisi gambaran fungsi yang digunakan dalam proses bisnis
*  - tidak berkaitan dengan layer lainnya, hanya digunakan yang berhubungan dengan proses inti
* */
interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}