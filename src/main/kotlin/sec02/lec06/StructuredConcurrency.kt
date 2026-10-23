package org.example.sec02.lec06

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.example.sec01.printWithThread

fun main(): Unit = runBlocking {
    val job1 = launch {
        delay(600L)
        printWithThread("A")
    }

    // A 출력 안한다! 부모로 전파 -> 부모 취소 -> 다른 자식에게도 취소 요청
    // 이처럼 한몸처럼 움직이는 것을 Structured Concurrency라고 한다
    val job2 = launch {
        delay(500L)
        throw IllegalArgumentException("코루틴 실패!")
    }
}