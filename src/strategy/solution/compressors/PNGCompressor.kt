package strategy.solution.compressors

import strategy.solution.Compresser

class PNGCompressor  : Compresser {

    override fun compress(fileName: String) {
        println("compress $fileName with PNG")
    }
}