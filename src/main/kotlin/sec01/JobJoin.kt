package org.example.sec01

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    val job1 = launch {
        delay(1_000L)
        printWithThread("Job 1")
    }

    job1.join()

    val job2 = launch {
        delay(1_000L)
        printWithThread("Job 2")
    }


    printWithThread("Job 3")
}