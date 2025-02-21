fun main() {
    try{
        println("Введите k")
        var k = readLine()!!.toInt()
        println("Введите l")
        var l = readLine()!!.toInt()
        println("Введите n")
        var n = readLine()!!.toInt()
        println("Введите m")
        var m = readLine()!!.toInt()
        println(l%k)
        println(n%k)
        println(m%k)
        when(l%k) {
            0 -> when(n%k) {
                0 -> when(m%k) {
                    0 -> println("k делитель всех чисел")
                    else -> println("k не делитель m")
                }
                else -> println("k не делитель n")
            }
            else -> println("k не делитель l")
        }
    }
    catch (e:Exception){
        println("неверный ввод")
    }
}