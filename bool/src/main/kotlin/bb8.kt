fun main(){
    print ("Введите число A: ")
    val a : Int = readLine()!!.toInt()
    print("Введите число B: ")
    val b : Int = readLine()!!.toInt()
    print("Введите число С: ")
    val c : Int = readLine()!!.toInt()
    if ((a+b)>c && (a+c)>b && (b+c)>a){
        println("True")
    }
    else{
        println("False")
    }
}