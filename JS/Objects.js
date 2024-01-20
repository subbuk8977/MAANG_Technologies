let student={
  Name:"MR HEMS",
  number:"R190734",
  Branch:"CSE",
  Marks:90
};

document.write(typeof student);
document.write("<br>Print Hello World from JavaScript");

document.write("<br>"+student.Name);
student.location="Prakasam";
console.log(student);

document.write(`<br>HperText Markup ${student.Name} Langugage`)

console.log(`HyperText Markup 
  ${student.location} Language`)

const obj=JSON.parse('{"name":"SUBBU","age":20}');
console.log(obj.name);