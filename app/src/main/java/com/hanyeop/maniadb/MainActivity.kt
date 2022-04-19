package com.hanyeop.maniadb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.hanyeop.maniadb.databinding.ActivityMainBinding
import com.hanyeop.maniadb.util.TAG
import com.hanyeop.maniadb.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.lifecycleOwner = this

        initClickListener()

        initObserver()
    }

    private fun initClickListener(){
        binding.apply {
            btn.setOnClickListener {
//                mainViewModel.getPost()
                mainViewModel.getSong()
            }
        }
    }

    private fun initObserver(){
//        mainViewModel.myResponse.observe(this@MainActivity){
//            if(it.isSuccessful){
//                Log.d(TAG, "initClickListener: ${it.body()}")
//            }
//            else{
//                Log.d(TAG, "initClickListener: ${it.code()}")
//            }
//        }
        mainViewModel.mySong.observe(this@MainActivity){
            if(it.isSuccessful){
                Log.d(TAG, "initClickListener: ${it.body()}")
            }
            else{
                Log.d(TAG, "initClickListener: ${it.code()}")
            }
        }
    }
}