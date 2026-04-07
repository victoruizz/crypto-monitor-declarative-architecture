package com.github.victoruizz.crypto_monitor_declarative_architecture.service

import com.github.victoruizz.crypto_monitor_declarative_architecture.model.TickerResponse
import retrofit2.Response
import retrofit2.http.GET

interface MercadoBitcoinService {

    @GET("api/BTC/ticker/")
    suspend fun getTicker(): Response<TickerResponse>

}