//To Find Sum Of Array Elements...

fun main(args: Array<String>)
{
var sum:Int=0;

println("Enter The Size Of Array:");
var size:Int=readLine()!!.toInt();

println("Enter The Array Elements:");

var arrayint=Array<Int>(size){readLine()!!.toInt()}

for(x in arrayint)
{
sum=sum+arrayint[x-1];
}

println("The Sum Of Array Elements Is: $sum");
}
