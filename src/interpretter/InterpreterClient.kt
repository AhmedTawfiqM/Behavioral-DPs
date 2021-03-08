package interpretter

class InterpreterClient(private val interpreterContext: InterpreterContext) {

    fun interpret(str: String): String {
        var exp: Expression? = null
        //create rules for expressions
        exp = when {
            str.contains("Hexadecimal") -> {
                IntToHexExpression(str.substring(0, str.indexOf(" ")).toInt())
            }
            str.contains("Binary") -> {
                IntToBinaryExpression(str.substring(0, str.indexOf(" ")).toInt())
            }
            else -> return str
        }

        return exp.interpret(interpreterContext)
    }
}