fun main(){
    println("Введите число: ")
    val x : Int = readLine()!!.toInt()
    val y : Int = 3 * (x*x*x*x*x*x) - 6*(x*x)-7
    println(y)
}