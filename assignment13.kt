fun main(args: Array<String>) {    
    val mathOperandsArray = arrayOf("+", "-", "*", "/")
    val number1: Int = 12
    val number2: Int = 4
    
    for (i in 0..(mathOperandsArray.size)) {
    	println(mathCalculation(number1, number2, mathOperandsArray[i]))
    }
}

fun mathCalculation(number1: Int, number2: Int, mathOperator: String) {
	when(mathOperator) {
        "+" -> println("$number1 + $number2 = ${number1 + number2}.")
        "-" -> println("$number1 - $number2 = ${number1 - number2}.")
        "*" -> println("$number1 * $number2 = ${number1 * number2}.")
        "/" -> println("$number1 / $number2 = ${number1 / number2}.")
    }
}
