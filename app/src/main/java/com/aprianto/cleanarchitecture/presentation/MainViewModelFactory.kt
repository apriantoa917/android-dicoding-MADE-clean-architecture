package com.aprianto.cleanarchitecture.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.aprianto.cleanarchitecture.di.Injection
import com.aprianto.cleanarchitecture.domain.MessageUseCase
/*
* TODO 10 :
*  - untuk provide view model yang akan digunakan sesuai dengan keperluan parameter inputan
*  - bisa menampung lebih dari 1 view model
*  - constructor / parameter bisa berbeda dan bervariasi, tidak disarankan untuk request context sebagai parameter -> memory leak
*  - berisikan instance untuk injeksi view model dengan dependency injection (DI)
* */
class MainViewModelFactory (
    private var messageUseCase: MessageUseCase
) : ViewModelProvider.NewInstanceFactory() {

    companion object {
        @Volatile
        private var instance: MainViewModelFactory? = null

        fun getInstance(): MainViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: MainViewModelFactory(Injection.provideUseCase())
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(MainViewModel::class.java) -> MainViewModel(messageUseCase) as T
            else -> throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
        }
    }
}
