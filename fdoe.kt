//To Print The First Digit Of A Given Number Whether Odd Or Even...

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

if(fd%2==0)
{
println("The First Digit Is Even.");
}

else
{
println("The First Digit Is Odd.");
}
}
