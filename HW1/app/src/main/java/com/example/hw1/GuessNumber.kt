package com.example.hw1
import kotlin.random.Random

fun main() {
    val targetNumber = Random.nextInt(0, 101)
    var remainingAttempts = 3

    println("Tahmin ettiğim sayıyı bulabilecek misin? (0-101)")

    while (remainingAttempts > 0) {
        print("Tahmininiz: ")
        val guess = readLine()?.toIntOrNull()

        if (guess != null) {
            if (guess == targetNumber) {
                println("TEBRİKLER! DOĞRU TAHMİN..")
                return
            } else {
                remainingAttempts--
                if (guess > targetNumber) {
                    println("Daha küçük bir sayı dene")
                } else {
                    println("Daha büyük bir sayı dene")
                }
                if (remainingAttempts > 0) {
                    println("Kalan tahmin hakkınız: $remainingAttempts")
                }
            }
        } else {
            println("Geçersiz tahmin.")
        }
    }
    println("Tahmin hakkın bitti. Doğru cevap: $targetNumber")
}