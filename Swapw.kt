//To Swap Two Numbers Without Using Third Variables... 

fun main(args: Array<String>)
{
var num1:Int;
var num2:Int;

println("Enter The First Number:");
num1=readLine()!!.toInt();

println("Enter The Second Number:");
num2=readLine()!!.toInt();

num1=num1+num2;
num2=num1-num2;
num1=num1-num2;

println("After Swapping:");
println("The First Number Is:$num1");

println("The Second Number Is:$num2");
}
