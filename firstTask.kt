import kotlin.math.absoluteValue



fun main(){
    val firstString = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    val secondString = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    val xx = mutableListOf(firstString[0], firstString[2], secondString[0], secondString[2])
    val yy = mutableListOf(firstString[1], firstString[3], secondString[1], secondString[3])
    val xxLength = xx.maxOrNull()!! - xx.minOrNull()!!
    val yyLength = yy.maxOrNull()!! - yy.minOrNull()!!
    println(if (xxLength >= yyLength) xxLength * xxLength else yyLength * yyLength)
}