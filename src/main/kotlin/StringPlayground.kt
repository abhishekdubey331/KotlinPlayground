object StringPlayground {

    fun capitalizeSentence(string: String): String {
        val result = buildString {
            string.split(" ").map {
                this.append(it.replaceFirst(it.first(), it.first().uppercaseChar()))
                append(" ")
            }
        }
        return result.trim()
    }
}