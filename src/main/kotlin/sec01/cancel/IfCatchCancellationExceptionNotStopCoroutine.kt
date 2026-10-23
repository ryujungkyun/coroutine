package org.example.sec01.cancel

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.example.sec01.printWithThread

fun main(): Unit = runBlocking {

    // 2. launch가 인식 못함
    val job = launch {
        try {
            //1. stop 호출시 delay에서 예외가 발생
            delay(1_000L)
        } catch (e: CancellationException) {
            //아무것도 안함
        } finally {
            //catch는 안하고 if-finally를 통해 자원 정리가능
        }
    }
    printWithThread("delay에 의해 취소 되지 않는다")

    delay(100L)
    printWithThread("취소 시작")
    job.cancel()
}