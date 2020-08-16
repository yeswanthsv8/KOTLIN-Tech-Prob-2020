//To Print The Given Fractional Number In 2Digit Decimal Format...

fun main(args:Array<String>)
{
println("Enter The Number:");
var num:Double=readLine()!!.toDouble();

val ans:Double=Math.round(num*100.0)/100.0;

println("The Fractional Number In 2Digit Decimal Format Is:"+ans);
}
