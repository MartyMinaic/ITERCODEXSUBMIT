/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.*/
class question9
{
    public static void main(String args[])
    {
        int a,b,c,p=0,q=0,r=0;
        for(a=1; a<1000; a++)
        {
            for(b=1; b<1000; b++)
            {
                c=(int)Math.sqrt(a*a+b*b);
                if((a+b+c)!=1000)
                {
                    continue;
                }
                if((Math.pow(a,2)+Math.pow(b,2))==Math.pow(c,2))
                {
                    p=a;
                    q=b;
                    r=c;
                }                
            }
        }
        System.out.print(p*q*r);
    }
}
