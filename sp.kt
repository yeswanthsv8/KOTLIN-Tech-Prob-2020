//To Calculate The Sum Of Multiple Numbers(Skip if user enters negative number)...

fun main(args: Array<String>)
{
var Range:Int;

println("Enter The Range:");
Range=readLine()!!.toInt();

var myRange=1..Range;
var sum=0;

println("Enter The Inputs:");
for(x in myRange)
{
var inp=readLine()!!.toInt();
if(inp>0)
{
sum=sum+inp;
}

}

println("The Total Sum Is:$sum");
}