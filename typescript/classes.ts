class Person{

    private name :string;

    public constructor(name :string){

        this.name=name;
    }

    public getName() : string{

        return this.name;
    }

    public setName(name : string){

        this.name=name;

    }

}

let person=new Person("subbu");
console.log(person.getName());

person.setName("harshii");
console.log(person.getName());
