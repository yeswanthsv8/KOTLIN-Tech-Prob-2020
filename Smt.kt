//To Find The Smallest Among Three Numbers...

fun main(args: Array<String>)
{
var num1:Int;
var num2:Int;
var num3:Int;

println("Enter The Number1:");
num1=readLine()!!.toInt();

println("Enter The Number2:");
num2=readLine()!!.toInt();

println("Enter The Number3:");
num3=readLine()!!.toInt();

if(num1<num2 && num1<num3)
{
println("The First Number Is Smaller Than Among Three.");
}

else if(num2<num3)
{
println("The Second Number Is Smaller Than Among Three.");
}

else
{
println("The Third Number Is Smaller Than Among Three.");
}

}