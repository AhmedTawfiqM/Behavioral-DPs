package problem

class Editor {

    //Violate SRP (Solid)
    //Violate OOP (Encapsoluation)
    //this class must represent and create Only (Can Seperate Too)
    //Think after Complexity

    private var content = ""

    //solution 1
    private var lastContentValue = content

    //another Solution 2
    private var lastPosition = 1
    private val prevContents = ArrayList<String>()

    fun setContent(content: String) {
        //this.lastContentValue = this.content
        //solution 2
        prevContents.add(content)
        lastPosition = prevContents.size - 1
        //
        this.content = content
    }

    fun getContent() = content

    fun undo() {
        // this.content = lastContentValue
        //
        if (lastPosition != 0) {
            this.content = prevContents[lastPosition - 1]
            lastPosition -= 1
        } else
            println("this is Last Edit Process")
    }

    //todo (Problems)
    //now the problem is when u has more property like content , size , style : u must has Prev Lists of every single one
    //More Code .. Duplication .. Not Clean .. Violate solid principles

}