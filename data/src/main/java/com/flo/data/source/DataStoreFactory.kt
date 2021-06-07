package com.flo.data.source

import com.flo.data.repository.DataStore
import javax.inject.Inject

class DataStoreFactory
@Inject constructor(private val remoteDataStore: RemoteDataStore) {

    fun retrieveDataStore(): DataStore = remoteDataStore

}