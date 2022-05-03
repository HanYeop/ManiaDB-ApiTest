package com.hanyeop.maniadb

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.hanyeop.maniadb.databinding.ActivityMainBinding
import com.hanyeop.maniadb.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.lifecycleOwner = this
        binding.vm = mainViewModel

        initObserver()
    }

    private fun initObserver(){
        mainViewModel.mySong.observe(this@MainActivity){

        }
    }
}