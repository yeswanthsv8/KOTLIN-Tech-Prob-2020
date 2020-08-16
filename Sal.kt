fun main(args: Array<String>)
{
print("Enter The Employees Wages:");
var wages=readLine()!!.toInt();

print("Enter The No.of Days:");
var days=readLine()!!.toInt();

var basic=wages*days;
var hra=basic*0.1;
var da=basic*0.05;
var pf=basic*0.12;

println("The Basic Pay Is:$basic ");
println("The HRA Is :$hra");
println("The DA Is:$da");
println("The PF Is:$pf");



}