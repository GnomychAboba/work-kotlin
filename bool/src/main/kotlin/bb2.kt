fun main(){
    print("Введите число: ")
    val a : Int = readLine()!!.toInt()
    if (a % 2 == 0){
        println("Чётное")
    }
    else{
        println("Нечётное")
    }
}