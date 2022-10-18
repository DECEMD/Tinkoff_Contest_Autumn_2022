fun main(){
    val str = readLine()!!
    val n = readLine()!!.toInt()
    val bondaries = mutableListOf<MutableList<Int>>()
    for (i in 0 until n){
        val kek = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
        bondaries.add(kek)
    }
    for (bondary in bondaries){
        val str_ = str.subSequence(bondary[0]-1,bondary[1]).split("").drop(1).dropLast(1)
        val strSorted = str_.sorted()
        var steps = 0
        for (letter in strSorted){
            if (letter == str_[steps%bondary[1]]){
                steps++
            } else {
                while (letter != str_[steps%bondary[1]]){
                    steps++
                }
            }
        }
        if (str_[0] == strSorted[0]){
            steps--
        }
        println(steps)
    }
}