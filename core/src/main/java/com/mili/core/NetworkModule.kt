package com.mili.core

import com.mili.data.notes.BuildConfig
import dagger.Module
import dagger.Provides
import okhttp3.Dispatcher
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
class NetworkModule {

    @Provides
    fun provideOkHttp(): OkHttpClient {
        return getOkhttpClient()
    }



    @Provides
    fun provideRetrofitModule(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl("https://www.google.com")
            .build()
    }

    private fun getOkhttpClient(): OkHttpClient {
        val builder = OkHttpClient.Builder()
            .dispatcher(Dispatcher())
        if (BuildConfig.DEBUG) {
            val logging = HttpLoggingInterceptor()
            logging.setLevel(HttpLoggingInterceptor.Level.BODY)
            builder.addInterceptor(logging)
        }
        return builder.build()
    }
}