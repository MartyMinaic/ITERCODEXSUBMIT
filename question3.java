class question3
{
    public static void main(String Args[])
    {
        long s=600851475143l;
        long s_copy=s,ans=0;    
        for(int a=2;a<=Math.sqrt(s_copy);a++)
        {
            while((s%a)==0)
            {   
                ans=a;
                s=s/a;    
            }    
        }    
        System.out.print(ans);
    }
}
            
