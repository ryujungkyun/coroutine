package org.example.sec01.lec04.cancel

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.example.sec01.printWithThread

fun main(): Unit = runBlocking {
    val job1 = launch {
        delay(10)
        printWithThread("Job 1")
    }


    //실행 취소 지연이 실행보다 시간이 길기 떄문에 취소할 수 없다
    delay(100)
    job1.cancel()
}

