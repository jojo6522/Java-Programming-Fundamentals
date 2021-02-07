/* 
Given a signed 32-bit integer x, return x with its digits reversed. 
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
*/

class Solution 
{
    public int reverse(int x) 
    {
        
       int answer = 0; 
       
        
        if (x>0){
            
        
        for(int i = String.valueOf(x).length() - 1; i>=0; i-- )
        {
          answer = answer + (x%10) * (int)Math.pow(10, i);
          
          x = x/10;
        }
        }else {
            for(int i = String.valueOf(x).length() - 2; i>=0; i-- )
        {
          answer = answer +   (x%10) * (int)Math.pow(10, i);
          
          x = x/10;
        }
            
            
        }
        
        if(answer >= Math.pow(2,31)-1 || answer <= Math.pow(-2,31))
            return 0;
        
        
        return answer;
            
        
    }
}
