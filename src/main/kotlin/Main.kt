fun main(){
    println(integers(listOf(2,4,12,8,93,34,6)))
    println(numbers(listOf("ann","moya","aniafa","angy","summy")))
//    println(integersLists(ls = listOf(2,6,9,12,1)))

    val numbers = listOf(1, 2, 2, 3, 3, 3, 4, 5, 5)
    val distinctNum = distinctNum(numbers)
    println(distinctNum)

    println( integers(listOf(23,47,89,76,35,45,24)))

    println(sumArray(45,20, 12, 42))
//var sumElement = sumArray(45,20,12,42)
    //println(sumElement)
    println(evenElements(arrayOf(45,23,4,5,67,78,345)).contentToString())
    var y= arrayOf(35,56,78,64,56)
    var z= arrayOf(56,35,45,64,2)
    var s= twoArrays(y,z)
    println(s.contentToString())




}

//Write a Kotlin function that takes an array of integers as input and returns
// the sum of all the elements in the array.
fun sumArray(num1:Int, num2:Int, num3:Int, num4:Int): Int{
    var sumElements = arrayOf(num1, num2, num3, num4)
    return sumElements.sum()
}
//Write a Kotlin function that takes two arrays of integers as input and returns a
//new array that contains the elements that are common to both input arrays.
fun twoArrays(nums:Array<Int>, num2: Array<Int>):Array<Int>{
    var x = mutableListOf<Int>()
    for (i in nums)
        if (i in num2){
            x.add(i)
        }
    return x.toTypedArray()
}
//Write a Kotlin function that takes an array of integers as input and returns a new array
//that contains only the even elements of the input array.
fun evenElements(array:Array<Int>):Array<Int>{
    var y= mutableListOf<Int>()
    for(x in array)
        if(x%2==0){
            y.add(x)
        }
    return y.toTypedArray()
}

//Write a function in Kotlin that takes a list of integers and returns the sum of
//all the even numbers in the list.
fun integers(int:List<Int>): Int{
  var sum=0
    for (y in int){
        if (y%2===0){
            sum+=y
        }
    }
    return sum

}

//Write a function in Kotlin that takes a list of strings and returns a new
//list that contains only the strings that start with the letter "a".
fun numbers(num:List<String>):List<String>{
    var filter= mutableListOf<String>()
    for (x in num){
        if (x.startsWith("a", ignoreCase = true)){
            filter.add(x)
        }
    }
    return filter
}

//Write a function in Kotlin that takes a list of integers and returns a new
//list that contains only the distinct values in the original list.
fun distinctNum(number: List<Int>): List<Int> {
    return number.toSet().toList()
}












