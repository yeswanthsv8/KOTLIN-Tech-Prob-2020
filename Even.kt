//To Print EvenNumbers Till N...

fun main(args: Array<String>)
{
var range:Int;

println("Enter The Range:");
range=readLine()!!.toInt();

var myRange=2..range step 2 ;

println("The Output Is:");
for(x in myRange) 
{
println(x);
}

}
