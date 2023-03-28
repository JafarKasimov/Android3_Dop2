package com.example.android3_dop2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainViewModel : ViewModel() {

    private var list: MutableLiveData<Int> = MutableLiveData()

    fun getRandomNumber(): MutableLiveData<Int> {
        val randomInt = Random.nextInt(99999)
        list.value = randomInt
        return list
    }
}