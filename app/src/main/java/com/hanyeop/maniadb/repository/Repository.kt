package com.hanyeop.maniadb.repository

import com.hanyeop.maniadb.api.RetrofitInstance
import com.hanyeop.maniadb.model.Post
import retrofit2.Response

class Repository {

    suspend fun getPost() : Response<Post> {
        return RetrofitInstance.api.getPost()
    }

    suspend fun getPost2(number : Int) : Response<Post> {
        return RetrofitInstance.api.getPost2(number)
    }

    suspend fun getCustomPosts(userId : Int) : Response<List<Post>> {
        return RetrofitInstance.api.getCustomPost(userId)
    }

    suspend fun getCustomPosts2(userId : Int, sort : String, order : String) : Response<List<Post>> {
        return RetrofitInstance.api.getCustomPost2(userId,sort,order)
    }

    suspend fun getCustomPosts3(userId : Int, options : Map<String, String>) : Response<List<Post>> {
        return RetrofitInstance.api.getCustomPost3(userId,options)
    }
}