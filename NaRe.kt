//To Print N Natural Numbers In Reverse...

fun main(args: Array<String>)
{
var range:Int;

println("Enter The Range:");
range=readLine()!!.toInt();

var myRange=range.downTo(1);

println("The Output Is:");
for(x in myRange)
{
println(x);
}

}
