package org.example.sec01.lec05

import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {

    //자식은 예외를 던진다 자식의 예외가 부모로 전파되기 때문이다
    val job = async(SupervisorJob()) {
        throw IllegalAccessException()
    }

    delay(1_000L)

    //await 호출시 예외
    job.await()
}