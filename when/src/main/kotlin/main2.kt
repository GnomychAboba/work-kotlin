fun main(){
    print("Введите первое число: ")
    val a : Double = readLine()!!.toDouble()
    print("Введите второе число: ")
    val b : Double = readLine()!!.toDouble()
    for (n in 1..4){
        when(n){
            1 -> println(a + b)
            2 -> println(a - b)
            3 -> println(a * b)
            4 -> println(a / b)
        }
    }

}