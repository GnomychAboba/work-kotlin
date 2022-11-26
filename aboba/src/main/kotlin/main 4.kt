fun main (){
    print("Введите трёхзначное число: ")
    val x: Int = readLine()!!.toInt()
    val res: Int = (x % 10) + ((x % 100) / 10) * 100 + (x / 100) * 10
    print(res)
}