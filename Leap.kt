//To Find The Given Number Is Leap Year Or Not...

fun main(args: Array<String>)
{
var year:Int;

println("Enter The Year:");
year=readLine()!!.toInt();

if(year%4==0)
{
println("The Given Year Is Leap Year.");
}

else
{
println("The Given Year Is Not Leap Year.");
}


}