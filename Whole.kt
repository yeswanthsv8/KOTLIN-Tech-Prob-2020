//To Print Whole Numbers Till N...

fun main(args: Array<String>)
{
var range:Int;

println("Enter The Range:");
range=readLine()!!.toInt();

var myRange=0..range;

println("The Output Is:");
for(x in myRange)
{
println(x);
}

}
