package com.example.buchi.data.repository

import com.example.buchi.data.model.PetsResponse
import com.example.buchi.utils.ApiService
import com.example.buchi.utils.Resource
import kotlinx.coroutines.Dispatchers
import retrofit2.Response
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject


class PetsRepository @Inject constructor(
    private val apiService: ApiService
) {
    suspend fun getPets(): Flow<Resource<PetsResponse>> = flow {
        var response: Resource<PetsResponse>
        response = Resource.loading(null)
        apiService.getPets().let {
            response = if (it.isSuccessful){
                Resource.success(it.body())
            }else{
                Resource.error(it.errorBody().toString(), null)
            }
        }
        emit(response)
    }.flowOn(Dispatchers.IO)

}