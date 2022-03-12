fun main(){
    case(arrayOf("harare","mumbai","dodooma","jakarta"))
    var y = division(40,3)
    println(y)
    var x = addition(arrayOf(1,2,3,4,5))
    println(x)
    var s = sumIntegers(arrayOf("Kenya",5,3.2,false,7,1.2))
    println(s)
    var q = sumup(arrayOf("merry", 1,2, "katana" ,false,4.5, "joy"))
    println(q)
    var r = digits(arrayOf(17,4,213,78,43,90,31,3,73,11,158,62))
    println(r)

}
fun case(cities:Array<String>){
    cities.forEach { cities ->
        println(cities.capitalize())
    }


}
fun division(a:Int,b:Int):Int{
    var modolus = a % b
    return modolus
}
//write a function that takes in an array of integers and calculates their sum without using the inbuilt
// .sum() function
fun addition(numb:Array<Int>):Int {
    var sum = 0
    numb.forEach { num ->
        sum += num
    }
    return sum
}
//create a function that takes in an array of mixed types and sums up the integers only
fun sumIntegers(medly:Array<Any>):Int{
    var sum = 0
    medly.forEach { element ->
        if (element is Int){
            sum+=element
        }
    }
    return sum
}
fun sumup(zealy:Array<Any>):String{
    var sum = ""
    zealy.forEach { ed ->
        if (ed is String){
             sum+=ed
        }
    }
    return sum
}
fun digits(numbers:Array<Int>):Int{
    var together = numbers[2] + numbers[5]
    return together
}






