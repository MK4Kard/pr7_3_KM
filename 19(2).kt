fun main() {
    try{
        println("Введите левую нижнюю точку П1")
        var x1 = readLine()!!.toDouble()
        var y1 = readLine()!!.toDouble()
        println("Введите правую верхнюю точку П!")
        var x2 = readLine()!!.toDouble()
        var y2 = readLine()!!.toDouble()
        println("Введите левую нижнюю точку П2")
        var x3 = readLine()!!.toDouble()
        var y3 = readLine()!!.toDouble()
        println("Введите правую верхнюю точку П2")
        var x4 = readLine()!!.toDouble()
        var y4 = readLine()!!.toDouble()
        var left = 0.0
        var top = 0.0
        var right = 0.0
        var bottom = 0.0
        when {
            (x1>x3) -> left = x1
            (x1<x3) -> left = x3
            else -> left = x1
        }
        when {
            (y2<y4) -> top = y2
            (y2>y4) -> top = y4
            else -> top = y2
        }
        when {
            (x2<x4) -> right = x2
            (x2>x4) -> right = x4
            else -> right = x2
        }
        when {
            (y1>y3) -> bottom = y1
            (y1<y3) -> bottom = y3
            else -> bottom = y1
        }
        var width = right - left
        var height = top - bottom
        when {
            (width < 0) -> return println("Нет точек соприкосновения")
            (height < 0) -> return println("Нет точек соприкосновения")
        }
        println("Площадь пересечения: "+String.format("%.2f",(width*height)))
    }
    catch (e:Exception){
        println("неверный ввод")
    }
}