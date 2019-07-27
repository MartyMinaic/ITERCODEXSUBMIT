/*The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?*/
class primeFactor
{
    public static void main(String args[])
    {
        long a=600851475143l;
        long b=2l,c=0l;
        while(b<=a)
        {
            while(a%b==0)
            {
                c=b;
                a=a/b;
            }
            b++;
        }
        System.out.println(b);
    }
}