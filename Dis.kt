//To Calculate The Discount for Purchase Above 5000...

fun main(args: Array<String>)
{
var amt:Double;
var dis:Double;

println("Enter The Price Of Product:");
val price=readLine()!!.toDouble();

println("Enter The Quantity Of Product:");
val qua=readLine()!!.toDouble();

amt=price*qua;

if(amt>5000)
{
println("The Amount After Discount Is:");
dis=amt*0.05;
amt=amt-dis;
}

println("The Total Amount Is: $amt");

}