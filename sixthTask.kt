fun main() {
    var results = mutableListOf<Int>()
    fun check(array: MutableList<MutableList<Int>>, last: Int): Boolean {
        var r = false
        for (i in array) {
            if (i[0] == last) {
                r = true
                break
            }
        }
        return r
    }
    fun chain_size(array: MutableList<MutableList<Int>>, chain: MutableList<MutableList<Int>>): Int {
        var last = chain.last().last()
        if (check(array, last)) {
            for (lift in array) {
                if (lift[0] == last) {
                    var array_ = array.toMutableList()
                    var chain_ = chain.toMutableList()
                    chain_.add(lift)
                    array_.remove(lift)
                    results.add(chain_size(array_, chain_))
                }
            }
        } else {
            return (chain).size - 1
        }
        return 0
    }
    var chain = mutableListOf(mutableListOf(0,0))
    var kek = mutableListOf<Int>()
    val n = readLine()!!
    var array = mutableListOf<MutableList<Int>>()
    for (i in 0 until n.toInt()){
        val iterated = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
        array.add(iterated)
    }
    for(lst in array){
        kek.add(lst.first())
    }
    if (0 in kek) {
        chain_size(array, chain)
        println(results.maxOrNull())
    } else {
        println(0)
    }
}





