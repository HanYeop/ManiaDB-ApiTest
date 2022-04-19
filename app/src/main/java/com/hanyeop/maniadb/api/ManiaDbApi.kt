package com.hanyeop.maniadb.api

import com.hanyeop.maniadb.model.ManiaDBClientResponse
import retrofit2.Response
import retrofit2.http.GET

interface ManiaDbApi {

    @GET("sunflower/?sr=song&display=10&key=example&v=0.5")
    suspend fun getSong() : Response<ManiaDBClientResponse>
}