package com.aprianto.cleanarchitecture.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aprianto.cleanarchitecture.domain.MessageEntity
import com.aprianto.cleanarchitecture.domain.MessageUseCase
/*
* TODO 8 :
*  - membuat view model sebagai presenter / bertindak untuk binding data dari data source ke UI
*  - berisi logic yang digunakan untuk mengatur data yang diperoleh ke UI secara dinamis
*  - terpisah dengan logic untuk penyimpanan data, hanya bertindak sebagai presenter
* */
class MainViewModel(private  val messageUseCase: MessageUseCase): ViewModel() {
    private val _message = MutableLiveData<MessageEntity>()
    val message: LiveData<MessageEntity>
        get() = _message

    fun setName(name: String) {
        _message.value = messageUseCase.getMessage(name)
    }
}