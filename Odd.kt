//To Print Odd Numbers Till N...

fun main(args: Array<String>)
{
var range:Int;

println("Enter The Range:");
range=readLine()!!.toInt();

var myRange=1..range step 2;

println("The Output Is:");
for(x in myRange) 
{
println(x);
}

}
