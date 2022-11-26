fun main(){
    println("Введите число: ")
    val a : Int = readLine()!!.toInt()
    val V : Int = a * a * a
    val S : Int = 6 * (a * a)
    println(V)
    println(S)
}