fun main(){
    print ("Введите число A: ")
    val a : Int = readLine()!!.toInt()
    print("Введите число B: ")
    val b : Int = readLine()!!.toInt()
    if ((a > 2) && (b <= 3)){
        println("Справедливо")
    }
    else{
        println("Неверно")
    }
}