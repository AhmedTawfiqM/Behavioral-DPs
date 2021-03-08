package interpretter

class InterpreterContext {

    fun getBinaryFormat(i: Int): String? {
        return Integer.toBinaryString(i)
    }

    fun getHexadecimalFormat(i: Int): String? {
        return Integer.toHexString(i)
    }
}