package com.rinda.nyinyi.myanmarmop.domain.network

class ProjectEuler {
    
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun problem1() {

        var sum = 0
        for(i in 1..999) {
            if((i%3 == 0) || ( i%5 == 0)) {
                sum += i
            }
        }
        assertEquals(0,sum)
    }

    @Test
    fun problem1Other() {

        val sum = (1..1000).toList()
            .filter { (it%3 == 0) || ( it%5 == 0) }
            .reduce { acc, intRange -> acc + intRange }

        assertEquals(0,sum)


    }

    @Test
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

    @Test
    fun problem3() {
        val givenNumber : Long = 600851475143
        var result : Long = 1

        for(i in 2..givenNumber) {
            if ((givenNumber%i).toInt() == 0) {
                println("This number is $i")
                result *= i

                if (givenNumber == result) {
                    println("This is your result $result")
                    break
                }
            }
        }
    }

    @Test
    fun problem4() {
        var result = 999

        for (i in result downTo 100) {
            for(j in i downTo 100) {
                val palin = getpalindroNumber((i*j))
                if ((i*j) == palin) {
                    if (i > 900 && j > 900) {
                        println("This is your result : $i and $j = $palin")
                    }
                    break
                }
            }
        }
    }

    fun getpalindroNumber(number : Int) : Int {
        var remainder = 0
        var reverseVal = 0
        var loopVal = number

        while (loopVal != 0) {
            remainder = loopVal % 10
            reverseVal = reverseVal * 10 + remainder
            loopVal /= 10
        }

        return reverseVal
    }
    
        @Test
    fun problem5() {
        var result = 0
        var count = 0

        while(true) {

            result++
            for(j in 20 downTo 1) {
                if(result%j != 0) {
                    break
                }else {
                    count++
                }
            }

            if (count == 20) {
                break
            }else {
                count = 0
            }
        }
        println(result)

    }

    
    @Test
    fun problem7() {

        var count = 0
        var primeNumber = 2

        while(true) {
            if (getPrimeNumber(primeNumber) == 0 ) {
                primeNumber++
            }else if (getPrimeNumber(primeNumber) == primeNumber){
                println(primeNumber)
                primeNumber++
                count++
            }

            if(count == 10001) {
                break
            }
        }




    }

    fun getPrimeNumber(givenNumber : Int) : Int {
        var currentResult = 0
        for (i in 2..givenNumber) {
            if (givenNumber%i == 0 ) {
                if (i == givenNumber ) {
                    currentResult = i
                }
                if (currentResult != givenNumber) {
                    return 0
                }
            }
        }

        if (currentResult == givenNumber) {
            return currentResult
        }

        return 0
    }
    
}
