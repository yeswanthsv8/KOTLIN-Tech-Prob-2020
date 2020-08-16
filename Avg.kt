//To Find Both Sum And Average Of Array Elements...

fun main(args: Array<String>)
{
var sum:Double=0.0;


println("Enter The Size Of Array:");
var size:Int=readLine()!!.toInt();

println("Enter The Array Elements:");

var arrayint=Array<Int>(size){readLine()!!.toInt()}

for(x in 0..size-1)
{
sum=sum+arrayint[x];
}

var avg:Double=sum/size;

val sol:Double=Math.round(avg*100.0)/100.0;

println("The Sum Is: $sum");
println("The Average Is:$sol");
}
