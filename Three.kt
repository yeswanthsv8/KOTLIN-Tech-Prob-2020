//To Find The Given Number Three Digit Or Not...

fun main(args: Array<String>)
{
var num1:Int;

println("Enter The Number1:");
num1=readLine()!!.toInt();

if(num1>99 && num1<999)
{
println("The Given Number Is Three-Digit.");
}

else
{
println("Not A Three-Digit Number.");
}


}