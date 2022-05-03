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

    private val repository = Repository.get()

    val mySong : MutableLiveData<List<Item>> = MutableLiveData()

    fun getSong(keyword: String){
        viewModelScope.launch {
            repository.getSong(keyword).let { response ->
                if(response.isSuccessful){
                    val list = response.body()!!.channel!!.itemList
                    if (list != null) {
                        for(i in list){
                            i.title = i.title.replace("&nbsp;"," ")
                        }
                    }
                    mySong.value = list
                }
                else{
                    Log.d(TAG, "getSong: ${response.code()}")
                }
            }
        }
    }
}