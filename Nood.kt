//To Print N Odd Numbers...

fun main(args: Array<String>)
{
var range:Int;

println("Enter The Range:");
range=readLine()!!.toInt();

println("The Output Is:");

var myrange=1..range;
for(x in myrange)
{
println(x);
}

}