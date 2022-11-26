fun main() {
    print("Введите расстояние в см: ")
    val l : Int = readLine()!!.toInt()
    val res: Int
    res = l / 100
    println("Расстояние в м: $res")
}