//To Print N Natural Numbers...

fun main(args: Array<String>)
{
var range:Int;

println("Enter The Range:");
range=readLine()!!.toInt();

var myRange=1..range;

println("The Output Is:");
for(x in myRange)
{
println(x);
}

}
