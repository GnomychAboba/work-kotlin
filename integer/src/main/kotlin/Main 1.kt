fun main(){
    print("Введите количество секунд: ")
    val sec : Int = readLine()!!.toInt()
    val min : Int = sec / 60
    val day : Int = min / 1440
    println("Секунды - $sec")
    println("Минуты - $min")
    println("Дни - $day")
}