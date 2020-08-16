//To Calculate The Sum Of N Given Numbers...

fun main(args: Array<String>)
{
var Range:Int;

println("Enter The Range:");
Range=readLine()!!.toInt();

var myRange=1..Range;
var sum=0;
var inp:Int;

println("Enter The Inputs:");
for(x in myRange)
{
inp=readLine()!!.toInt();
sum=sum+inp;
}

println("The Total Sum Is:$sum");
}