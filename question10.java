/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.*/
class question10
{
    public static void main(String[] args)
    {
        question10 ob = new question10();
        //not checking for 2 as it is already prime so it will be directly added
        long s=2;
        for(int a=3;a<2000000;a=a+2)
        {
            if(ob.checkPrime(a))
            {
                s=s+a;
            }
        }
        System.out.println("Sum = "+s);
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
