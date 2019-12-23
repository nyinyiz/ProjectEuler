package com.rinda.nyinyi.myanmarmop.domain.network

class ProjectEuler {

    fun problem1() {

        var sum = 0
        for(i in 1..999) {
            if((i%3 == 0) || ( i%5 == 0)) {
                sum += i
            }
        }
        println(sum)
    }

    fun problem1Other() {

        val sum = (1..1000).toList()
            .filter { (it%3 == 0) || ( it%5 == 0) }
            .reduce { acc, intRange -> acc + intRange }

        println(sum)


    }

    fun problem2() {

        var sum = 0
        var actualResult = 0

        var firstNumber = 1
        var secondNumber = 2

        println(firstNumber)
        println(secondNumber)

        for(i in 100 downTo 1) {
            sum = firstNumber + secondNumber

            firstNumber = secondNumber
            secondNumber = sum

            if (actualResult <= 4000000) {
                if (sum%2 == 0) {
                    actualResult += sum
                }
                println(actualResult+2)
            }

        }
    }



}