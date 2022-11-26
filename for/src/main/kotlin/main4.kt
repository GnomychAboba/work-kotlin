fun main() {
    print("Введите первое число: ")
    val a: Int = readLine()!!.toInt()
    print("Введите второе число: ")
    val b: Int = readLine()!!.toInt()
    var sum : Int = 0
    for (i in a..b) {
        sum =+ i
        println(sum)
    }
}