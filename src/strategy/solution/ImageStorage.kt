package strategy.solution

class ImageStorage {

    fun store(fileName: String, compressor: Compresser, filter: Filter) {
        compressor.compress(fileName)
        filter.apply(fileName)
    }
}