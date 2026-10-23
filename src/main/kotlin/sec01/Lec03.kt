package org.example.sec01

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        printWithThread("RUN BLOCKING START")
        launch {
            delay(2_000) //yield()
            printWithThread("LAUNCH END")
        }
        printWithThread("RUN BLOCKING END")
    }

    //여기 코드로 넘어오지 않게 된다
    printWithThread("MAIN END")
}