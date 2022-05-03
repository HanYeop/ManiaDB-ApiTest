package com.hanyeop.maniadb.api

import com.hanyeop.maniadb.model.ManiaDBClientResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ManiaDbApi {

    @GET("{keyword}/?sr=song&display=10&key=example&v=0.5")
    suspend fun getSong(@Path("keyword") keyword: String) : Response<ManiaDBClientResponse>
}