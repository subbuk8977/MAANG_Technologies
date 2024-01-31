
let score=0;
function isScore(){

    let val=Number.parseInt(document.getElementById('input').value);
    if(val == 9){
        
        alert("You have entered correct answer");
        score++;
        
    }
        
    else{
        alert("You have enterd wrong answer");
        score--;
        
    }
    document.getElementById('score').innerHTML=score;
        
    console.log(score);
    
}
