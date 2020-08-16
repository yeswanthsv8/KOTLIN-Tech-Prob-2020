//To Find The Area Of Triangle...

fun main(args: Array<String>)
{
println("Enter The Base:");
var base=readLine()!!.toInt();

println("Enter The Height:");
var height=readLine()!!.toInt();

var res=0.5*base*height;

println("The Area Of Triangle Is:$res");
}
