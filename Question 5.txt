/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/
class smallestMultiple
{
    /* A number is divisible is all the numbers between 1 to 20 that means
     * the number is divisble by all of the multiples of all the numbers between 1 to 20
     * we need to take out all the factors of a number
     * when we have all the factors of the numbers between then we will multiply all the factors
     * after multiplication we get the required answer
     */
    public static void main(String args[])
    {
        //all the prime numbers between 1 to 20 which can be a possible factors in formate {<number>,<number of factors>} initially 0
        int ft[][] = {{2,0},{3,0},{5,0},{7,0},{11,0},{13,0},{17,0},{19,0}};
        for(int a=1; a<=20; a++)
        {
            int t=a;
            for(int b=0; b<8; b++)
            {
                //counter variable
                int ct=0;
                while(t%ft[b][0]==0)
                {
                    t=t/ft[b][0];
                    ct++;
                }
                if(ft[b][1]<ct)
                {
                    ft[b][1]=ct;
                }
            }
        }
        int ans=1;
        for(int a=0; a<8; a++)
        {
            ans=ans*(int)Math.pow(ft[a][0],ft[a][1]);
        }
        System.out.print("ans = "+ans);
    }
}