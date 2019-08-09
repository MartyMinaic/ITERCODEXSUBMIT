class question3
{
    public static void main(String Args[])
    {
        long s=600851475143l;
        int t=0;
        for(int a=2; a<=s; a++)
        {
            while(true)
            {
                if(s%a==0)
                {
                    t=a;
                    s=s/a;
                }
                else
                break;
            }
        }
        System.out.print(t);
    }
}
            
