/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?*/
class prime10001st
{
    public static void main(String args[])
    {
        prime10001st ob = new prime10001st();
        int ct=0,n=1;
        while(ct<10001)
        {
            n++;
            if(ob.isPrime(n))
            ct++;
        }
        System.out.println(n);
    }
    boolean isPrime(long n)
    {
        if(n < 2) 
        return false;
        if(n == 2 || n == 3) 
        return true;
        if(n%2 == 0 || n%3 == 0) 
        return false;
        long sqrtN = (long)Math.sqrt(n)+1;
        for(long i = 6L; i <= sqrtN; i += 6) 
        {
            if(n%(i-1) == 0 || n%(i+1) == 0) 
            return false;
        } 
        return true;
    }
}
