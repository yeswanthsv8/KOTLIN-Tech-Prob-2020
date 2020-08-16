//To Perform The Grade Calculation...

fun main(args: Array<String>)
{
var mark:Int;

println("Enter The Mark:");
mark=readLine()!!.toInt();

if(mark>95&&mark<=100)
{
println("O Grade.");
}

else if(mark>90&&mark<=95)
{
println("A grade.");
}

else if(mark>80&&mark<91)
{
println("B Grade.");
}

else if(mark>70&&mark<81)
{
println("C Grade.");
}

else if(mark>60&&mark<71)
{
println("D Grade.");
}

else if(mark>49&&mark<61)
{
println("E Grade.");
}

else if(mark>=0&&mark<50)
{
println("F Grade.");
}

else
{
println("Invalid Mark.");
}

}