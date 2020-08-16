//To Print The First Digit Of A Given Number...

fun main(args: Array<String>)
{
var num:Int;

println("Enter The Number:");
num=readLine()!!.toInt();

var fd:Int;

fd=num/10;
if(fd>10)
{
fd=fd/10;
}

println("The First Digit Of The Number Is:$fd");
}
