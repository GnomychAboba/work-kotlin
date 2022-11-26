fun main(){
    print ("Введите число A: ")
    val a : Int = readLine()!!.toInt()
    print("Введите число B: ")
    val b : Int = readLine()!!.toInt()
    print("Введите число С: ")
    val c : Int = readLine()!!.toInt()
    if ((a >= 0) && (b >= 0) && (c >= 0)){
        println("Числа положительные")
    }
    else{
        println("Ничего не положительно!!!\nИли какое-либо число не является положительным!!!")
    }
}