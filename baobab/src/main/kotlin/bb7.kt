fun main(){
    print ("Введите число A: ")
    val x : Int = readLine()!!.toInt()
    print("Введите число B: ")
    val y : Int = readLine()!!.toInt()
    if ((x < 0)&&(y > 0)){
        println("Лежит во II координатной плоскости")
    }
    else{
        println("Не лежит, а стоит!!!")
    }
}