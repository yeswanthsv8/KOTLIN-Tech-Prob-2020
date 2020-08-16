//To Convert The Ascii Value To Character...

fun main(args: Array<String>)
{
println("Enter The Ascii Value:");
var inp=readLine()!!.toInt();

var out=inp.toChar();
println("The Character Is:$out");
}
