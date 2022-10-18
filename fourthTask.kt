fun main(){
    var counter = 0
    val inputValues = mutableListOf<String>()
    try {
        while (true){
            inputValues.add(readln())
        }
    } catch (e: java.lang.RuntimeException){

    }
    val mutableMap = mutableMapOf<String, Int>()
    val listOfMap = mutableListOf<Map<String, Int>>(mutableMap)
    for (k in inputValues){
        if (k != "{" && k != "}"){
            if (listOfMap.size < counter + 1){
                listOfMap.add(mutableMapOf())
            }
            if (k.split("=").last().contains(Regex("\\d"))){
                val a = listOfMap[counter].toMutableMap()
                a[k.split("=").first()] = k.split("=").last().toInt()
                listOfMap[counter] = a
            }
            else {
                var t = true
                for (i in counter downTo 0){
                    if (k.split("=").last() in listOfMap[i].keys){
                        val a = listOfMap[counter].toMutableMap()
                        val b = listOfMap[i]
                        a[k.split("=").first()] = b.getValue(k.split("=").last())
                        listOfMap[counter] = a
                        println(a[k.split("=").first()])
                        t = false
                        break
                    }
                }
                if (t){
                    val a = listOfMap[counter].toMutableMap()
                    a[k.split("=").first()] = 0
                    listOfMap[counter] = a
                    println(0)
                }
            }
        } else {
            if (k == "{"){
                counter++
            } else {
                listOfMap.removeAt(counter)
                counter--
            }
        }
    }
}