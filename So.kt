//To Calculate The Sum Of Odd Numbers Till N...

fun main(args: Array<String>)
{
var inp:Int;

println("Enter The Range:");
inp=readLine()!!.toInt();

var myRange=1..inp step 2;
var sum=0;

for(x in myRange)
{
sum=sum+x;
}

println("The Total Sum Is:$sum");
}