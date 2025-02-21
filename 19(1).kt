fun main() {
    try{
        var p = 7.9
        var m = 56.0
        var na = 6.02*Math.pow(10.0, 23.0)
        println("Введите объем")
        var v = readLine()!!.toDouble()
        when {
            (v<=0) -> return println("Объем меньеш или равен 0")
        }
        var n = (p*v*na)/m
        println("Число атомов "+String.format("%.2f",n))
    }
    catch (e:Exception){
        println("неверный ввод")
    }
}