
function isScore(){

    let val=Number.parseInt(document.getElementById('input').value);
    let score=Number.parseInt(document.getElementById('score').innerText);
    if(val == 9){
        
        alert("You have entered correct answer");
        score++;
        document.getElementById('score').innerHTML=score;
    }
        
    else{
        alert("You have enterd wrong answer");
        score--;
        document.getElementById('score').innerHTML=score;
    }
        
    console.log(score);

    //alert(`The form is Submitted Score is ${score}`);
    
}