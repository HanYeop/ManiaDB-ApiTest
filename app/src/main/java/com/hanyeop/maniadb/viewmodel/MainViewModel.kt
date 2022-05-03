package com.hanyeop.maniadb.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hanyeop.maniadb.model.Item
import com.hanyeop.maniadb.repository.Repository
import com.hanyeop.maniadb.util.TAG
import kotlinx.coroutines.launch

class MainViewModel() : ViewModel() {

    private val repository = Repository()

    val mySong : MutableLiveData<List<Item>> = MutableLiveData()

    fun getSong(){
        viewModelScope.launch {
            val response = repository.getSong()
            if(response.isSuccessful){
                Log.d(TAG, "getSong: ${response.body()}")
                Log.d(TAG, "getSong: ${response.body()!!.channel!!.itemList.toString()}")
                mySong.value = response.body()!!.channel!!.itemList
            }
            else{
                Log.d(TAG, "getSong: ${response.code()}")
            }
        }
    }
}