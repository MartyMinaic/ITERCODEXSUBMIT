/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/
public class question5
{
    public static void main(String args[])
    {
        int arr[] = new int[20];
        for(int a=2; a<=20; a++)
        {
            int t=a;
            int b=2;
            int c=0;
            while(t!=1)
            {
                if(t%b==0)
                {
                    t=t/b;
                    c++;
                }
                else
                {
                    if(arr[b-1]<c)
                    {
                        arr[b-1]=c;
                    }
                    b++;
                    c=0;
                }
            }
            if(arr[b-1]<c)
            {
                arr[b-1]=c;
            }
        }
        int ans=1;
        for(int a=0; a<20; a++)
        {
            ans=ans*(int)Math.pow((a+1),arr[a]);
        }
        System.out.println(ans);
    }
}
