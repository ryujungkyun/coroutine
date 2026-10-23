package org.example.sec01

import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    val job = async {
        3 + 5
    }
    val eight = job.await() // await: async의 결과를 가져오는 함수
    printWithThread(eight)
}