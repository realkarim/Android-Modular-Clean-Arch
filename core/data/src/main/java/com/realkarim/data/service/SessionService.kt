package com.realkarim.data.service

import com.realkarim.data.response.TokenResponse
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header

const val BASE_URL = "https://allure.com/"
const val REFRESH_TOKEN = "refreshToken"

interface SessionService {

  @GET("/Auth/GetSession")
  fun getTokens(
    @Header(REFRESH_TOKEN) refreshToken: String,
  ): Deferred<Response<TokenResponse>>

  @DELETE("/Auth/DeleteSession")
  fun logout(
    @Header(REFRESH_TOKEN) refreshToken: String,
  ): Deferred<Response<Unit>>
}
