package org.example.sec01.lec05

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {


    //예외 출력 후 종료
    val job = CoroutineScope(Dispatchers.Default).launch {
        throw IllegalAccessException()
    }

    delay(1_000L)
}