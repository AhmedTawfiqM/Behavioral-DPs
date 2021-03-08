package interpretter

interface Expression {
    fun interpret(interpreterContext: InterpreterContext) : String
}