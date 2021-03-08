package interpretter

object Client {

    @JvmStatic
    fun main(args: Array<String>) {
        //interpret input to show as a custom output
        //like convert Xml to GUI , JSON to Some Words Language
        val interpreterClient = InterpreterClient(InterpreterContext())

        val str1 = "28 in Binary";
        val str2 = "28 in Hexadecimal";
        println(interpreterClient.interpret(str1))
        println(interpreterClient.interpret(str2))
    }

    //https://www.journaldev.com/1635/interpreter-design-pattern-java#:~:text=The%20best%20example%20of%20interpreter,output%20interpreted%20in%20another%20language.
    //https://sourcemaking.com/design_patterns/interpreter
}