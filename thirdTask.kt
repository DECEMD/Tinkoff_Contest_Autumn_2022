fun main(){
    val n = readLine()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val listSubs = mutableListOf<Int>()
    val listUnsubs = mutableListOf<Int>()
    for (i in 0 until a.size step 2){
        listSubs.add(a[i])
    }
    for (i in 1 until a.size step 2){
        listUnsubs.add(a[i])
    }
    val minOfSubs = listSubs.minOrNull()
    val maxOfUnsubs = listUnsubs.maxOrNull()
    val returned = listSubs.sum() - minOfSubs!! * 2 + maxOfUnsubs!! * 2 - listUnsubs.sum()
    println(returned)
}