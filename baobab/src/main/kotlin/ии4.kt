fun main(){
    print ("Введите число A: ")
    val a : Int = readLine()!!.toInt()
    print("Введите число B: ")
    val b : Int = readLine()!!.toInt()
    if ((a % 2 != 0) && (b % 2 != 0)){
        println("Нечётны")
    }
    else{
        println("Чётны")
    }
}