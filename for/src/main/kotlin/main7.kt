fun main(){
    print("Введите первое число: ")
    val n: Int = readLine()!!.toInt()
    var res = 1
    for (i in n downTo 1) {
        res *= i
        println(res)
    }
    println("Ответ: $res")
}