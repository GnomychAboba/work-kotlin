fun main(){
    println("Введите число: ")
    var a : Int = readLine()!!.toInt()
    println("Введите число: ")
    var b : Int = readLine()!!.toInt()
    val c : Int
    c = a
    a = b
    b = c
    println("Results")
    println(a)
    println(b)

}