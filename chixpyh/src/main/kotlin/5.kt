fun main(){
    print("Введите число: ")
    val x : Double = readLine()!!.toDouble()
    var f : Double = 0.0
    if (x > 0){
        f = 2 * x
        println(f)
    }
    if (x <= 0){
        f = 6 - x
        println(f)
    }
}