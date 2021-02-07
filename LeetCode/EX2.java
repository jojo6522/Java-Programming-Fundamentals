/*
Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward. 
For example, 121 is palindrome while 123 is not.
*/



class Solution 
{
    public boolean isPalindrome(int x)
    {
        
        int capVal = x;
        
        if (x<0)
            return false;
    
        int answer = 0;  
            
        for(int i=String.valueOf(x).length() - 1; i >= 0; i--)
        {
        
            answer = answer + (x%10) * (int)(Math.pow(10,i));
            System.out.println(answer);
            x= x/10;    
        }

        System.out.println(answer);

        
        if(answer == capVal)
            return true;
        
            
        
        return false;
    
        
    }
}
