/*
    
    Fractional Knapsack
    
    Given weights and values of N items, we need to put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
    Note: Unlike 0/1 knapsack, you are allowed to break the item here. 



    Input:
    N = 3, W = 50
    value[] = {60,100,120}
    weight[] = {10,20,30}
    Output:
    240.000000
    Explanation:
    Take the item with value 60 and weight 10, value 100 and weight 20 and split the third item with value 120 and weight 30, to fit it into weight 20. so it becomes (120/30)*20=80, so the total weight becomes 60+100+80.0=240.0
    Thus, total maximum value of item we can have is 240.00 from the given capacity of sack.

*/







/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/



class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        Arrays.sort(arr, Comparator.comparing((Item a) -> (double)a.value / a.weight).reversed());
        double totalValue=0;
        for(Item item:arr){
            
            if(item.weight <= W){
                
                totalValue+=item.value;
                W-=item.weight;
            }
            else{
                
                totalValue+=(double)(W*item.value)/item.weight;
                break;
            }
        }
        
        return totalValue;
    }
}