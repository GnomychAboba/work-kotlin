fun main(){
    print("Введите число: ")
    val x : Int = readLine()!!.toInt()
    print("Введите число: ")
    val y : Int = readLine()!!.toInt()
    if ((x > 0)&&(y > 0)){
        println("Первая четверть")
    }
    if ((x < 0)&&(y > 0)){
        println("Вторая четверть")
    }
    if ((x < 0)&&(y < 0)){
        println("Третья четверть")
    }
    if ((x > 0)&&(y < 0)){
        println("Четвёртая четверть")
    }
}