/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.*/
class question10
{
    public static void main(String[] args)
    {
        question10 ob = new question10();
        long s=0;
        for(int a=2;a<2000000;a++)
        {
            if(ob.isPrime(a))
            {
                s=s+a;
            }
        }
        System.out.println("Sum = "+s);
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
