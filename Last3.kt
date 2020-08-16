//To Find The Last Digits Of Number Is Divisible By 3...

fun main(args: Array<String>)
{
var num1:Int;
val num1l:Int;

println("Enter The Number1:");
num1=readLine()!!.toInt();

num1l=num1%10;

if(num1l%3==0)
{
println("The Last Digits Is Divisible By 3.")
}

else
{
println("The Last Digits Is Not Divisible By 3.");
}

}