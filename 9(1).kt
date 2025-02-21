fun main() {
    try{
        println("Введите сторону a")
        var a = readLine()!!.toDouble()
        when {
            (a<=0) -> return println("Длина стороны меньше или равна 0")
        }
        println("Введите сторону b")
        var b = readLine()!!.toDouble()
        when {
            (b<=0) -> return println("Длина стороны меньше или равна 0")
        }
        var s = a * b
        println("Площадь: "+String.format("%.2f",s))
        var p = 2 * (a+b)
        println("Периметр: "+String.format("%.2f",p))
        var q = Math.sqrt(Math.pow(a, 2.0) + Math.pow(b, 2.0))
        println("Длина диагонали: "+String.format("%.2f",q))
    }
    catch (e:Exception){
        println("неверный ввод")
    }
}