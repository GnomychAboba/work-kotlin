fun main() {
    val a = 1
    print("Введите число: ")
    val b  = readLine()!!.toInt()
    var sum = 0.0
    for (i in a..b){
        sum += a/i.toDouble()
        println(sum)
    }
}