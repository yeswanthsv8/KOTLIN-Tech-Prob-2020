//To Print All The Elements Which Are Less Than Key Elements In The Array...

fun main(args: Array<String>)
{
println("Enter The Size Of Array:");
var size:Int=readLine()!!.toInt();

println("Enter The Array Elements:");
var arr=Array<Int>(size){readLine()!!.toInt()};

println("Enter The Element:");
var ele=readLine()!!.toInt();

println("The Output Is:");
for(x in 0..size-1)
{
 if(arr[x]<ele)
 {
  println(" "+arr[x]);   
 }

}

}
