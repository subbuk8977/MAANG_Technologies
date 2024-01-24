

function isEven(a:number):boolean{

    if(a%2 == 0)
        return true;
    else
        return false;
    
}

let a=10;
console.log(`${a} is an even number ${isEven(a)}`);