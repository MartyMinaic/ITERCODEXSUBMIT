/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.*/
class palindrome 
{ 
    public static void main (String[] args)  
    { 
        palindrome ob = new palindrome();
        int ans=0,t=0;
        int a=0, b=0;
        for(a=0; a<999; a++)
        {
            for(b=0; b<999; b++)
            {
                t=a*b;
                if(ob.check(t))
                {
                    if(t>ans)
                    {
                        ans=t;
                    }
                }
            }
        }
        System.out.print(ans);
    } 
    int rev(int n, int temp) 
    { 
        // base case 
        if (n == 0) 
            return temp; 
      
        // stores the reverse 
        // of a number 
        temp = (temp * 10) + (n % 10); 
      
        return rev(n / 10, temp); 
    } 
    boolean check(int l)
    {
        if(l==rev(l,0))
        {
            return true;
        }
        return false;
    }
} 
