package org.example.sec01.lec05

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.example.sec01.printWithThread

fun main(): Unit = runBlocking {
    val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        printWithThread("예외 발생")
        throw throwable
    }

    // 새 스레드를 만든 이유는 부모 스레드가 있다면 작동 안하기 떄문에
    val job = CoroutineScope(Dispatchers.Default).launch(exceptionHandler) {
        throw IllegalArgumentException()
    }

    delay(1_000)
}