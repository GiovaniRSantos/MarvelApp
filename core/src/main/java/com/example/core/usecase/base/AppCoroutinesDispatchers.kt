package com.example.core.usecase.base

import kotlinx.coroutines.CoroutineDispatcher

class AppCoroutinesDispatchers(
    val io: CoroutineDispatcher,
    val computation: CoroutineDispatcher,
    val main: CoroutineDispatcher
)