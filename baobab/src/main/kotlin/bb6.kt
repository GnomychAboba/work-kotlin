fun main(){
    print ("Введите число A: ")
    val a : Float = readLine()!!.toFloat()
    print("Введите число B: ")
    val b : Float = readLine()!!.toFloat()
    print("Введите число С: ")
    val c : Float = readLine()!!.toFloat()
    var d : Float = 0.0F
    d = (b * b) - (4 * a * c)
    if (d >= 0){
        println("Истина: $d")
    }
    else {
        println("Ложь: $d")
    }
}