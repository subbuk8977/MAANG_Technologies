

// while loop
let a=1;
while(a<10)
{
	//console.log(a+" ");
	document.write(a)
	a++;
}
document.write("<br>")



// for loop
for(var b=10;b>=0;b--)
{
	document.write(b+" ");
}




let obj={

	"name":"subbu",
	"age":20,
	"location":"nandyal"
};

// For-in Loops
for(let i of obj )
	console.log(obj[i]);

String str="Maang Technologies";
for(let i of str)
	console.log(i);


// For_of Loops
let arr[]=[10,20,30,40,50];
for(let i of arr)
	console.log(i);

