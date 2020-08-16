//To Calculate Celsius To Fahrenheit...

fun main(args: Array<String>)
{
println("Enter The Celsius's Temperature:");
var cel=readLine()!!.toFloat();

var fah=cel*1.8+32;

println("The Conversion To Fahrenheit Is: $fah");
}