package com.flo.remote.service

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object MusicServiceFactory {
    private const val BASE_URL = "https://grepp-programmers-challenges.s3.ap-northeast-2.amazonaws.com/2020-flo/"

    fun musicService(isDebug: Boolean) = makeMusicService(
            okHttpClient = makeOkHttpClient(makeLoggingInterceptor(isDebug)),
            gson = GsonBuilder().setLenient().create()
    )

    private fun makeMusicService(
            okHttpClient: OkHttpClient,
            gson: Gson
    ): MusicService = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(MusicService::class.java)

    private fun makeOkHttpClient(loggingInterceptor: HttpLoggingInterceptor) = OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)
        .connectTimeout(120, TimeUnit.SECONDS)
        .readTimeout(120, TimeUnit.SECONDS)
        .build()

    private fun makeLoggingInterceptor(isDebug: Boolean) = HttpLoggingInterceptor()
        .apply {
            level = if (isDebug) HttpLoggingInterceptor.Level.BODY
                    else HttpLoggingInterceptor.Level.NONE
        }

}