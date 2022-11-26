fun main(){
    println("!!Программа для вывода суммы сложения и произведения трёзначных чисел!!!")
    print("Введите первое число: ")
    val a : Int = readLine()!!.toInt()
    print("Введите второе число: ")
    val b : Int = readLine()!!.toInt()
    val c : Int = a + b
    val d : Int = a * b
    if ((a < 1000) && (b < 1000)) {
        println("Сумма сложения: $c")
        println("Сумма произведения: $d")
    }
    else {
        println("Неверная операция!!")
    }
}
