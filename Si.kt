//To Find The Simple Interest...

fun main(args: Array<String>)
{
print("Enter The Principle Amount:");
var amt=readLine()!!.toInt();

print("Enter The No.of Months:");
var nm=readLine()!!.toInt();

print("Enter The Rate of Interest:");
var rate=readLine()!!.toFloat();

var si=(amt*nm*rate)/100;

println("The Simple Interest Is: $si");
}