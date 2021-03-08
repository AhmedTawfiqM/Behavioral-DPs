package interpretter

class IntToHexExpression(val value: Int) : Expression {

    override fun interpret(interpreterContext: InterpreterContext) : String{
        return  interpreterContext.getHexadecimalFormat(value)!!
    }
}