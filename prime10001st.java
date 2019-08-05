/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?*/
class prime10001st
{
    public static void main(String args[])
    {
        prime10001st ob = new prime10001st();
        int ct=1,n=1;
        boolean k=false;
        while(ct<10000)
        {
            n++;            
            k=true;
            if(n < 2) 
            k=false;
            if(n == 2 || n == 3) 
            k=true;
            if(n%2 == 0 || n%3 == 0) 
            k=false;
            long sqrtN = (long)Math.sqrt(n)+1;
            for(long i = 6L; i <= sqrtN; i += 6) 
            {
                if(n%(i-1) == 0 || n%(i+1) == 0) 
                k=false;
            } 
            if(k)
            ct++;
        }
        System.out.println(n);
    }
}
