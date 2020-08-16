//To Find The Given Difference Whether Odd Or Even...

fun main(args: Array<String>)
{
var num1:Int;
val num2:Int;
var diff:Int;

println("Enter The Number1:");
num1=readLine()!!.toInt();

println("Enter The Number2:");
num2=readLine()!!.toInt();

diff=num1-num2;

if(diff%2==0)
{
println("The Given Difference Is Even.");
}

else
{
println("The Given Difference Is Odd.");
}


}