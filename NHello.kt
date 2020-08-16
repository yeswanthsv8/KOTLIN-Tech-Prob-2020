//To Print Hello World for N Times...

fun main(args: Array<String>)
{
var range:Int;

println("Enter The Range:");
range=readLine()!!.toInt();

var myrange=1..range;

for(x in myrange)
{
println("Hello World");
}

}