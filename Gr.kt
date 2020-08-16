//To Find The Greatest Among Two Numbers...

fun main(args: Array<String>)
{
var num1:Int;
var num2:Int;

println("Enter The Number1:");
num1=readLine()!!.toInt();

println("Enter The Number2:");
num2=readLine()!!.toInt();

if(num1>num2)
{
println("The First Number Is Greater Than Second Number.");
}

else
{
println("The Second Number Is Greater Than First Number.");
}

}