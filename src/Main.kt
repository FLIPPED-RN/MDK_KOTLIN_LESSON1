import kotlin.random.Random

fun main() {
//    var numbers1:Array<Int> = arrayOf(1,220,3,412,542)
//    var numbers2 = arrayOf(1,220,5,4132,542)
//    var numbers3 = arrayOfNulls<Int>(3)
//    var numbers4 = Array<Int>(6) { 5 }
//    var i = 1
//    var numbers5 = Array(5) {2 * (i++) + 1}
//    println(numbers5[3])
//    println(numbers5.size)
//    for (i in numbers5) print("$i ")
//    println()
//    var intNumbers:IntArray = intArrayOf(1,2,3,4,521)
//    var shortNumbers:ShortArray = shortArrayOf(1,2,32,4,5)
//    var byteNumbers:ByteArray = byteArrayOf(1,2,3,45,55)
//    var floatNumbers:FloatArray = floatArrayOf(1.5f,2.5f,3.5f)
//    var doubleNumbers:DoubleArray = doubleArrayOf(1.5,2.5)

    //Задача на паре
    var mas = Array(Random.nextInt(10, 50)) {Random.nextInt(10, 50)-30}
    for (i in mas) println("$i ")
    println()
    var positive = 0
    var negative = 0
    var sumPos = 0.0
    var sumNeg = 0.0
    for (i in mas) {
        if (i>0) {
            sumPos+=i
            positive++
        }
        else if(i<0){
            sumNeg+=i
            negative++
        }
    }
    println(String.format("Среднее арифметическое положительных %6.2f", sumPos / positive))
    println(String.format("Среднее арифметическое отрицательных %6.2f", sumNeg / negative))
}