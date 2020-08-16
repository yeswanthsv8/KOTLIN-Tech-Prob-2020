//Get Kilobytes from user and find the bytes...

fun main(args: Array<String>)
{
println("Enter The Kilobytes:");
var inp1=readLine()!!.toInt();

var out=inp1*1024;

println("From Kilobytes To Bytes Is:"+out);
}