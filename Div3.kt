//To Find The Given Number Is Divisible By 3...

fun main(args: Array<String>)
{
var num1:Int;

println("Enter The Number1:");
num1=readLine()!!.toInt();

if(num1%3==0)
{
println("The Given Number Is Divisible By 3.");
}

else
{
println("The Given Number Is Not Divisible By 3.");
}


}