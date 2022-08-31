fun main(args: Array<String>) {
    println(capitalizeSentence("flower"))
    println(capitalizeSentence("this is a house"))
}

fun capitalizeSentence(string: String): String {
    val result = buildString {
        string.split(" ").map {
            this.append(it.replaceFirst(it.first(), it.first().uppercaseChar()))
            append(" ")
        }
    }
    return result.trim()
}