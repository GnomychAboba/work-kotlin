fun main(){
    print("Введите число: ")
    val a : Int = readLine()!!.toInt()
    print("Введите число: ")
    val b : Int = readLine()!!.toInt()
    if (a > b){
        println(b)
    }
    if (a < b){
        println(a)
    }
    if (a == b) {
        println("Равны")
    }
}
