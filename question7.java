/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?*/
class question7
{
    public static void main(String args[])
    {
        question7 ob = new question7();
        int ans=3,a=3,no=2;
        while(no<10001)
        {
           a=a+2;
           ans=a;    
           if(ob.checkPrime(a))
           {
               no++;      
           } 
        }
        System.out.println(ans);
    }
    boolean checkPrime(int inp)
    {    
        if(inp%2==0)
            return false;    
        for (int a=3;a<=Math.sqrt(inp);a=a+2)
        if(inp%a==0)
        {
            return false;    
        }    
        return true;    
    }
}

