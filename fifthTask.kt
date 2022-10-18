fun main(){
    val read1 = readLine()!!.split(" ").map { it.toInt() }
    val read2 = mutableListOf<String>()
    for (i in 0 until read1.first()){
        val iteratingItem = readLine()!!
        read2.add(iteratingItem)
    }
    val read2Sorted = read2.sorted()
    val read3ListOfLists = mutableListOf<MutableList<String>>()
    for (i in 0 until read1.last()){
        val iteratingItem = readLine()!!.split(" ").toMutableList()
        read3ListOfLists.add(iteratingItem)
    }

    for (i in read3ListOfLists){
        read2Sorted.filter { it.startsWith(i.last()) }.toMutableList()
        try {
            val target = read2Sorted.filter { it.startsWith(i.last()) }.toMutableList()[i.first().toInt() - 1]
            val index = read2.indexOf(target) + 1
            println(index)
        } catch (e: IndexOutOfBoundsException) {
            println(-1)
        }
    }
}