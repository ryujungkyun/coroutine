package org.example.sec01.lec05

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.example.sec01.printWithThread

fun main(): Unit = runBlocking {
    launch {
        try {
            throw IllegalArgumentException()
        } catch (e: IllegalArgumentException) {
            printWithThread("정상 종료")
        }
    }
}