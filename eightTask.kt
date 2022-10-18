fun main(){
    val n = readLine()!!.split(" ").map { it.toInt() }
    val listOfDomains = mutableListOf<String>()
    for (i in 0 until n.first()){
        val iteratingElement = readLine()!!
        listOfDomains.add(iteratingElement)
    }
    val req = mutableListOf<MutableList<String>>()
    for (i in 0 until n.last()){
        val iteratingElement = readLine()!!.split(" ").toMutableList()
        req.add(iteratingElement)
    }
    var kek = 0
    for (i in req){
        for (j in listOfDomains){
            if (j.startsWith(i.first()) && j.endsWith(i.last())){
                kek++
            }
        }
        println(kek)
        kek = 0
    }
}