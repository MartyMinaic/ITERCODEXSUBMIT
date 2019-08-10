/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/
class question5
{
    public static void main()
    {
        question5 ob = new question5();
        long ans=1;
        for(long j=2l;j<=20;j++)
        {
            ans=ob.lcm(ans,j);
        }
        System.out.println(ans);
    }
    long lcm(long a,long b)
    {
        long r=a*b/hcf(a,b);  
        return r;
    }
    long hcf(long a, long b)
    {   long tmp,rt=0;
        tmp=Math.min(a,b);    
        for(int i=1; i<=tmp; i++)
        {
            if(a%i==0&&b%i==0)
            {
                rt=i;
            }
        }    
        return rt;    
    }
}
