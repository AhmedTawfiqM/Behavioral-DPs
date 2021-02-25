package strategy.solution.compressors

import strategy.solution.Compresser

class JPEGCompressor : Compresser {

    override fun compress(fileName: String) {
        println("compress $fileName with JPEG")
    }
}