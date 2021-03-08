package interpretter

class IntToBinaryExpression(val value: Int) : Expression {

    override fun interpret(interpreterContext: InterpreterContext) : String {
        return interpreterContext.getBinaryFormat(value)!!
    }
}