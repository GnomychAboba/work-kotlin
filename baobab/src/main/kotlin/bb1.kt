fun main(){
    print("Введите число: ")
    val a : Int = readLine()!!.toInt()
    if (a % 2 != 0){
        println("Нечётное")
    }
    else {
        println("Чётное")
    }
}