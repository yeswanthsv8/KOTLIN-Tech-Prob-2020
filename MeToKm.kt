//Get metres from user and find the kilometres...

fun main(args: Array<String>)
{
println("Enter The Metres:");
var inp1=readLine()!!.toInt();

var out=inp1/1000;

println("From Metres To Kilometres Is:"+out);
}