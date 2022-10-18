import kotlin.math.max

fun main(){
    val n = readLine()!!.toInt()
    val iteratedList = mutableListOf<String>()
    for (i in 0 until n){
        val toList = readLine()!!
        iteratedList.add(toList)
    }
    val result = iteratedList.map { it.split(" ")
        .sortedWith(compareBy({it.length}, {it})) }
        .groupBy{it}
        .maxByOrNull { it.value.size }?.value?.size
    println(result)
}