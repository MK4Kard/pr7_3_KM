fun main() {
    try {
        val x = readLine()!!.toDouble()
        val y = readLine()!!.toDouble()

        fun area(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): Double {
            return Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0
        }

        val totalArea1a = area(-3.0, 0.0, 0.0, 1.0, 0.0, 0.0)
        val ABP1a = area(-3.0, 0.0, 0.0, 1.0, x, y)
        val BCP1a = area(0.0, 1.0, 0.0, 0.0, x, y)
        val CAP1a = area(0.0, 0.0, -3.0, 0.0, x, y)
        val totalArea2a = area(0.0, 1.0, 1.0, 0.0, 0.0, 0.0)
        val ABP2a = area(0.0, 1.0, 1.0, 0.0, x, y)
        val BCP2a = area(1.0, 0.0, 0.0, 0.0, x, y)
        val CAP2a = area(0.0, 0.0, 0.0, 1.0, x, y)
        val totalArea3a = area(1.0, 0.0, 0.0, -1.0, 0.0, 0.0)
        val ABP3a = area(1.0, 0.0, 0.0, -1.0, x, y)
        val BCP3a = area(0.0, -1.0, 0.0, 0.0, x, y)
        val CAP3a = area(0.0, 0.0, 1.0, 0.0, x, y)
        val totalArea4a = area(-3.0, 0.0, 0.0, -1.0, 0.0, 0.0)
        val ABP4a = area(-3.0, 0.0, 0.0, -1.0, x, y)
        val BCP4a = area(0.0, -1.0, 0.0, 0.0, x, y)
        val CAP4a = area(0.0, 0.0, -3.0, 0.0, x, y)

        val totalArea1b = area(1.0, 0.0, 0.0, 2.0, 0.0, 0.0)
        val ABP1b = area(1.0, 0.0, 0.0, 2.0, x, y)
        val BCP1b = area(0.0, 2.0, 0.0, 0.0, x, y)
        val CAP1b = area(0.0, 0.0, 1.0, 0.0, x, y)
        val totalArea2b = area(-1.0, 0.0, 0.0, 2.0, 0.0, 0.0)
        val ABP2b = area(-1.0, 0.0, 0.0, 2.0, x, y)
        val BCP2b = area(0.0, 2.0, 0.0, 0.0, x, y)
        val CAP2b = area(0.0, 0.0, -1.0, 0.0, x, y)

        val totalArea1g = area(-2.0, 0.0, 0.0, 0.9, 0.0, 0.0)
        val ABP1g = area(-2.0, 0.0, 0.0, 0.9, x, y)
        val BCP1g = area(0.0, 0.9, 0.0, 0.0, x, y)
        val CAP1g = area(0.0, 0.0, -2.0, 0.0, x, y)
        val totalArea2g = area(0.0, 1.0, 1.0, 0.0, 0.0, 0.0)
        val ABP2g = area(0.0, 1.0, 1.0, 0.0, x, y)
        val BCP2g = area(1.0, 0.0, 0.0, 0.0, x, y)
        val CAP2g = area(0.0, 0.0, 0.0, 1.0, x, y)
        val totalArea3g = area(1.0, 0.0, 0.0, -2.0, 0.0, 0.0)
        val ABP3g = area(1.0, 0.0, 0.0, -2.0, x, y)
        val BCP3g = area(0.0, -2.0, 0.0, 0.0, x, y)
        val CAP3g = area(0.0, 0.0, 1.0, 0.0, x, y)
        val totalArea4g = area(-2.0, 0.0, 0.0, -2.0, 0.0, 0.0)
        val ABP4g = area(-2.0, 0.0, 0.0, -2.0, x, y)
        val BCP4g = area(0.0, -2.0, 0.0, 0.0, x, y)
        val CAP4g = area(0.0, 0.0, -2.0, 0.0, x, y)

        when {
            ((totalArea1a == ABP1a + BCP1a + CAP1a) || (totalArea2a == ABP2a + BCP2a + CAP2a) || (totalArea3a == ABP3a + BCP3a + CAP3a) || (totalArea4a == ABP4a + BCP4a + CAP4a)) -> println("Точка ($x, $y) находится внутри или на границе фигуры а.")
            else -> println("Точка ($x, $y) находится вне фигуры а.")
        }
        when {
            ((totalArea1a == ABP1a + BCP1a + CAP1a) || (totalArea2a == ABP2a + BCP2a + CAP2a) || x<=1 || x>=-1 || y>=-2) -> println("Точка ($x, $y) находится внутри или на границе фигуры б.")
            else -> println("Точка ($x, $y) находится вне фигуры б.")
        }
        when {
            ((x*x+y*y)<=1+1 || x<=1 || x>=-1 || y<=2) -> println("Точка ($x, $y) находится внутри или на границе фигуры в.")
            else -> println("Точка ($x, $y) находится вне фигуры в.")
        }
        when {
            ((totalArea1g == ABP1g + BCP1g + CAP1g) || (totalArea2g == ABP2g + BCP2g + CAP2g) || (totalArea3g == ABP3g + BCP3g + CAP3g) || (totalArea4g == ABP4g + BCP4g + CAP4g)) -> println("Точка ($x, $y) находится внутри или на границе фигуры г.")
            else -> println("Точка ($x, $y) находится вне фигуры г.")
        }
    }
    catch (e:Exception){
        println("неверный ввод")
    }
}
