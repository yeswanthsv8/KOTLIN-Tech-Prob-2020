//Get Bytes from user and find the Kilobytes...

fun main(args: Array<String>)
{
println("Enter The Bytes:");
var inp1=readLine()!!.toInt();

var out=inp1/1024;

println("From Bytes To Kilobytes Is:"+out);
}