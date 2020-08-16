//To Find The Last Digit Of Number...

fun main(args: Array<String>)
{
println("Enter The Number:");
val num=readLine()!!.toInt();

val out=num%10;
println("The Last Digit Of Number Is:"+out);
}