package com.hanyeop.maniadb.adapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

object MyBindingAdapter {

    // 이미지 바인딩
    @BindingAdapter("image")
    @JvmStatic
    fun ImageView.setImage (imageUrl: Any){
        Glide.with(this.context)
            .load(imageUrl)
            .override(100,100)
            .into(this)
    }
}