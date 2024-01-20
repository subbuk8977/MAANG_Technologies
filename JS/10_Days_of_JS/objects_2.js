/*

	Day 4: Count Objects

	Task

	Complete the function in the editor. It has one parameter: an array, a, of objects. Each object in the array has two integer properties denoted by x and y . The function must return a count of all such objects o in array a that satisfy o.x==o.y.


*/

function getCount(objects) {
    
    let count=0;
    
    for(let i in objects){
        
        if(objects[i].x == objects[i].y)
            count++;
    }
    
    return count;
}