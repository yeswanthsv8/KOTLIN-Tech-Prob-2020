//To Program Arithmetic Calculator Using Switch Case Statements...

fun main(args: Array<String>)
{
var ch:Char;
var num1:Int;
var num2:Int;

println("Enter The Number1:");
num1=readLine()!!.toInt();

println("Enter The Number2:");
num2=readLine()!!.toInt();

println("Enter The Character:");

ch=readLine()!![0];

when(ch)
{
'+' -> println("The Output Is: ${num1+num2}");
'-'  -> println("The Output Is: ${num1-num2}");
 '*'  ->println("The Output Is: ${num1*num2}");
'/'  -> println("The Output Is: ${num1/num2}");
'%' ->println("The Output Is: ${num1%num2}");
}

}
