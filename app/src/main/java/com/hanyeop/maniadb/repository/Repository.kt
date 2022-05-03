package com.hanyeop.maniadb.repository

import android.content.Context
import com.hanyeop.maniadb.api.RetrofitInstance
import com.hanyeop.maniadb.model.ManiaDBClientResponse
import retrofit2.Response

class Repository private constructor(context: Context){

    suspend fun getSong(keyword: String) : Response<ManiaDBClientResponse>{
        return RetrofitInstance.api.getSong(keyword)
    }

    // 싱글톤
    companion object {
        private var INSTANCE: Repository? = null

        fun initialize(context: Context) {
            if (INSTANCE == null) {
                INSTANCE = Repository(context)
            }
        }

        fun get(): Repository {
            return INSTANCE ?:
            throw IllegalStateException("Repository must be initialized")
        }
    }
}