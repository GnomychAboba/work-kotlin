fun main(){
    print("Введите число: ")
    val x : Double = readLine()!!.toDouble()
    var f : Double = 0.0
    if (x <= 0){
        f = (-x)
        println(f)
    }
    if ((0<x) && (x < 2)){
        f = (x * x)
        println(f)
    }
    if (x >= 2){
        println(4)
    }
}