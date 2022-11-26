fun main(){
    print("Введите первое число: ")
    val a : Int = readLine()!!.toInt()
    print("Введите второе число: ")
    val b : Int = readLine()!!.toInt()
    for (i in b-1 downTo  a + 1){
        println(i)
    }
    val n : Int = b - a - 1
    print("Всего целых чисел: $n ")
}