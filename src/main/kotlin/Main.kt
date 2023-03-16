fun main() {
    oddNumbers()
    var names = arrayOf("Joyce", "Ann", "Patricia", "David", "Frank", "Ahmed", "Esther")
    var count = namesLongerThanFive(names)
//    println("There are $count names longer than 5 characters in the array")
println("$count")
    serving(5)
    serving(6)
    serving(8)
    serving(15)
    serving(40)
    fizzBuzz()
}
fun oddNumbers(){
    for (o in 1..100 step 2){
        println(o)
    }
}
fun namesLongerThanFive(names:Array<String>):Int{
    var count = 0
    for (n in names){
        if (n.length > 5){
            count++
        }
    }
    return count
}
fun serving(age:Int){
    when{
        age < 6 -> println("Glass of milk.")
        age < 15 -> println("A bottle of Fanta Orange.")
        else -> println("A bottle of Cola Cola.")
    }
}
//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.
fun fizzBuzz(){
    for (a in 1..100 ){
        when{
            a % 3 == 0 -> println("Fizz")
            a % 5 == 0 -> println("Buzz")
            a % 3 == 0 && a % 5 == 0 -> println("FizzBuzz")
            else -> println(a)
        }
    }
}
