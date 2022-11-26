fun main(){
    print("Введите первое число: ")
    val a : Int = readLine()!!.toInt()
    print("Введите второе число: ")
    val b : Int = readLine()!!.toInt()
    for (i in a ..b){
        println(i)
    }
    val n : Int = b - a + 1
    print("Всего чисел: $n ")
}