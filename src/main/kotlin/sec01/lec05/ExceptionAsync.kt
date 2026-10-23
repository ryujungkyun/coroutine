package org.example.sec01.lec05

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    val job = CoroutineScope(Dispatchers.Default).async {
        throw IllegalAccessException()
    }

    delay(1_000L)

    //await()를 호출해야 예외가 비로소 터진다 lauch와 다르다
    job.await()

}
