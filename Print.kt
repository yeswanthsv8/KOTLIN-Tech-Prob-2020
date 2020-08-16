//To Get And Print The Array Elements...

fun main(args: Array<String>)
{
println("Enter The Size Of Array:");
var size:Int=readLine()!!.toInt();

println("Enter The Array Elements:");

var arrayint=Array<Int>(size){readLine()!!.toInt()}

println("The Array Elements Are:");
for(x in arrayint)
{
println(x);
}

}
