object MathPlayground {

    fun getOdd(listOfInt: List<Int>): List<Int> {
        return listOfInt.filter {
            it % 2 != 0
        }
    }

    fun containsRange(intRangeFirst: IntRange, intRangeSecond: IntRange): Boolean {
        /***
         *  Given two ranges implement a function which checks if range1 contains range2.
         *  containsRange(5..8, 5..9) // false
         */
        var isValid = false
        if (intRangeFirst.first <= intRangeSecond.first && intRangeFirst.last >= intRangeSecond.last) {
            isValid = true
        }
        return isValid
    }

    fun addUpTo(num: Int): Int {
        return num * (num + 1) / 2
    }

    fun getIndex(listOf: List<String>, s: String): Int {
        for ((index, char) in listOf.withIndex()) {
            if (char == s) {
                return index
            }
        }
        return -1
    }

    fun countDown(num: Int): List<Int> {
        val listOfInt = mutableListOf<Int>()
        var localNum = num
        repeat(num.plus(1)) {
            listOfInt.add(it)
            localNum -= 1
        }
        return listOfInt.asReversed()
    }
}