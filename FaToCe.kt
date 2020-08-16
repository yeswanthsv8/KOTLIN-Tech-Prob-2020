//To Calculate Fahrenheit To Celsius...

fun main(args: Array<String>)
{
println("Enter The Fahrenheit's Temperature:");
var fah=readLine()!!.toFloat();

var c=(fah-32)*0.5556;

println("The Conversion To Celsius Is: $c");
}