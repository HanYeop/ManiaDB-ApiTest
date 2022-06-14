package com.hanyeop.maniadb

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.hanyeop.maniadb.adapter.MainAdapter
import com.hanyeop.maniadb.databinding.ActivityMainBinding
import com.hanyeop.maniadb.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel by viewModels<MainViewModel>()
    private val mainAdapter = MainAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.apply {
            lifecycleOwner = this@MainActivity
            activity = this@MainActivity
            vm = mainViewModel
            recyclerView.adapter = mainAdapter
        }

        mainViewModel.getAlbum("Remapping The Human Soul")

        initObserver()
    }

    fun getSong(){
        mainViewModel.getSong(binding.editKeyword.text.toString())
    }

    private fun initObserver(){
        mainViewModel.mySong.observe(this@MainActivity){
            mainAdapter.submitList(it)
        }
    }
}