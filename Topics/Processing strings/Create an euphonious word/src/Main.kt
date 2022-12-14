fun main() {
    val input = readln()
    val vowel = "aeiouy"
    var vowelsCount = 0
    var consonantsCount = 0
    var charactersCount = 0

    for (ch in input) {
        val isVowel = vowel.contains(ch)

        if (isVowel) {
            vowelsCount++
            consonantsCount = 0
            if (vowelsCount == 3) {
                charactersCount++
                vowelsCount = 1
                consonantsCount = 1
            }
        } else {
            consonantsCount++
            vowelsCount = 0
            if (consonantsCount == 3) {
                charactersCount++
                vowelsCount = 1
                consonantsCount = 1
            }
        }
    }

    println(charactersCount)
}
