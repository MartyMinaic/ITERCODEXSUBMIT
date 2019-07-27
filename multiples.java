     /*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
    
         * Find the sum of all the multiples of 3 or 5 below 1000.
         * */
class multiples
{
    public static void main(String args[])
    {
        //total number of multiples of 3 and 5
        int mt[] = new int[532];
        boolean k=true;
        int c=0,d=1;
        //c is counter variable
        //while k is true
        while(k)
        {
            //Takes out multiples of 3
            if(3*d>1000)
            {
                k=false;
            }
            else
            {
                mt[c]=3*d;
                c++;
                d++;
            }
        }
        k=true;
        d=1;
        while(k)
        {
            //Takes out multiples of 5
            if(5*d>=1000)
            {
                k=false;
            }
            else
            {
                mt[c]=5*d;
                c++;
                d++;
            }
        }
        int sum=0;
        for(int a=1; a<=1000; a++)
        {
            for(int i=0; i<mt.length; i++)
            {
                if(mt[i]==a)
                {
                    sum=sum+a;
                }
            }
        }
        System.out.print("Sum ="+sum);
    }
}