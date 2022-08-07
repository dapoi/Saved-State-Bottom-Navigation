package com.dapascript.bottom.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<Int>()
    val text: LiveData<Int> = _text

    init {
        _text.value = 0
    }
}