//To Find The Last Digits Of Two Numbers Are Equal Or Not...

fun main(args: Array<String>)
{
var num1:Int;
var num2:Int;

val num1l:Int;
val num2l:Int;

println("Enter The Number1:");
num1=readLine()!!.toInt();

println("Enter The Number2:");
num2=readLine()!!.toInt();

num1l=num1%10;
num2l=num2%10;

if(num1l==jnum2l)
{
println("The Last Digits Of Two Numbers Are Equal.")
}

else
{
println("The Last Digits Of Two Numbers Are Not Equal.");
}

}