fun main() {
    println("Введите число: ")
    val a : Int = readLine()!!.toInt()
    if (a >= 0){
        println(a+1)
    }
    else{
        println(a)
    }
}