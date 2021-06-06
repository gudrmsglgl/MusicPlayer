package com.flo.domain.interactor

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*

interface UseCase<Type, in Param> {

    fun requestData(param: Param? = null): Flow<Type>

    fun execute(
        scope: CoroutineScope,
        param: Param?,
        onSuccess: ((Type) -> Unit)? = null,
        onError: (Throwable) -> Unit,
        onComplete: (() -> Unit)? = null
    ){
        requestData(param)
            .onEach {
                onSuccess?.invoke(it)
            }
            .catch {
                it.printStackTrace()
                onError.invoke(it)
            }
            .flowOn(Dispatchers.IO)
            .launchIn(scope)
    }

}