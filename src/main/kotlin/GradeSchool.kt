class School {
	
    private val roster = mutableMapOf<Int, List<String>>()

    fun db(): Map<Int, List<String>> = roster

    fun add(student: String, grade: Int) =
        roster.put(grade, grade(grade).plusElement(student))

    fun grade(grade: Int): List<String> =
        roster.getOrDefault(grade, listOf())

    fun sort(): Map<Int, List<String>> =
        roster.mapValues { it.value.sorted() }.toSortedMap()
}