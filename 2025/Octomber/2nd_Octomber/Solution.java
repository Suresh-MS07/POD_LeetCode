class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
         int count=numBottles;
         int ex=0;
        while(numBottles>=numExchange){
        numBottles-=numExchange;
        count+=1;
        ex+=1;
        numExchange+=1;
        }
        numBottles+=ex;
        if(numBottles>=numExchange){
          numBottles-=numExchange;
          count+=1;
          ex+=1;
        }
    return count;
}
}