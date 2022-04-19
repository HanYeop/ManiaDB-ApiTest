package com.hanyeop.maniadb.api

import com.hanyeop.maniadb.util.BASE_URL
import com.tickaroo.tikxml.TikXml
import com.tickaroo.tikxml.retrofit.TikXmlConverterFactory
import retrofit2.Retrofit

// 인터페이스를 사용하는 인스턴스. Builder는 BASE_URL와  Converter를 설정
object RetrofitInstance {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create())
            .addConverterFactory(TikXmlConverterFactory.create(TikXml.Builder().exceptionOnUnreadXml(false).build()))
            .build()
    }

//    val api : SimpleApi by lazy {
//        retrofit.create(SimpleApi::class.java)
//    }

    val api : ManiaDbApi by lazy {
        retrofit.create(ManiaDbApi::class.java)
    }
}