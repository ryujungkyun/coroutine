package org.example.sec01.cancel

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.example.sec01.printWithThread

fun main():Unit = runBlocking {
    val job1 = launch {
        delay(1_000L)
    }

    val job2 = launch {
        delay(1_000L)
        printWithThread("Job 2")
    }

    //job1을 취소시킬 수 있었던 이유는 job1이 delay, yield와 같은
    //suspend 함수이기 때문이다
    delay(100)
    job1.cancel()
}