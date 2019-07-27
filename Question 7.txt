/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?*/
class prime10001st
{
    public static void main(String args[])
    {
        int ct=0,n=1;
        while(ct<10001)
        {
            int t=0,a=1;
            n++;
            while(a<=n)
            {
                if(n%a==0)
                {
                    t++;
                }
                a++;
                //This has been done to reduce the execution time if t<2 => the number is not a prime number
                if(t>2)
                break;
            }
            if(t<=2)
            {
                ct++;
            }
        }
        System.out.println(n);
    }
}