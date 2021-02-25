package strategy.problem

class ImageStorage(
    private var compresser: String = "",
    private var filter: String = ""
) {

    fun store() {
        when (compresser) {
            "PNG" -> println("compress PNG")
            "JPEG" -> println("compress JPEG")
            "JPG" -> println("compress JPG")
        }

        when (filter) {
            "B&W" -> println("filter B&W")
            "Contract" -> println("filter Contract")
        }
    }

    //todo the problem here is Violate Solid ,, OOP
    //todo, So difficult to increase types (imagine on Complexity) , Duplication , no flexibility
    //todo not maintainable

}