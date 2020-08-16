//To Swap Two Numbers With Using Third Variables... 

fun main(args: Array<String>)
{
var num1:Int;
var num2:Int;

val temp:Int;

println("Enter The First Number:");
num1=readLine()!!.toInt();

println("Enter The Second Number:");
num2=readLine()!!.toInt();

temp=num1;
num1=num2;
num2=temp;

println("After Swapping:");
println("The First Number Is:$num1");

println("The Second Number Is:$num2");
}
