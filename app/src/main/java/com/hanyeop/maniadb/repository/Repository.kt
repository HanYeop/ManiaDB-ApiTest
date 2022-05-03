package com.hanyeop.maniadb.repository

import com.hanyeop.maniadb.api.RetrofitInstance
import com.hanyeop.maniadb.model.ManiaDBClientResponse
import retrofit2.Response

class Repository {

    suspend fun getSong() : Response<ManiaDBClientResponse>{
        return RetrofitInstance.api.getSong()
    }
}