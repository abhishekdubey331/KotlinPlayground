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

    fun formatTrainRoute(list: List<String>): String {
        val baseString = "Train is calling at"
        return when (list.size) {
            1 -> {
                "$baseString ${list.first()}"
            }

            2 -> {
                "$baseString ${list.first()} and ${list.last()}"
            }
            else -> {
                return buildString {
                    this.append(baseString)
                    for ((index, value) in list.withIndex()) {

                    }
                }
            }
        }
    }
}