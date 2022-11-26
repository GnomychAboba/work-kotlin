fun main(){
    println("Введите число: ")
    val a : Int = readLine()!!.toInt()
    println("Введите число: ")
    val b : Int = readLine()!!.toInt()
    val S : Int = a * b
    val P : Int = 2*(a+b)
    println(S)
    println(P)
}