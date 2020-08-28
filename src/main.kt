fun main() {

    // 1 -- loop through elements and indexes
    //looping();


    // 2 -- retrieve the first and the last elements elements
    //retrieveElements();

    //3 -- sort array in asc & desc order
    //sortArray();




}

// 1 -- loop through elements and indexes
fun looping() {
    var ar2 = Array(5) { _ -> (Math.random() * 10).toInt() };
    for ((i, v) in ar2.withIndex())
        println("index : $i,  value : $v");
}

// 2 -- retrieve the first and the last elements elements
fun retrieveElements() {
    var ar = intArrayOf(1, 2, 3, 4, 5, 6, 7);
    println("the first element is : ${ar.first()}");
    println("the last element is : ${ar.last()}");
}

//3 -- sort array in asc & desc order
fun sortArray() {
    val list = listOf(8, 4, 7, 1, 2, 3, 0, 5, 6);
    println(list.sortedDescending());
    println(list.sorted());
}
