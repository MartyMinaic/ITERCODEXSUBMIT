/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.*/
class palindrome
{
    public static void main(String args[])
    {
        palindrome ob = new palindrome();
        long ans=0l,t=0l;
        int a=0, b=0;
        for(a=0; a<999; a++)
        {
            for(b=0; b<999; b++)
            {
                t=a*b;
                if(ob.check(t))
                {
                    ans=t;
                }
            }
        }
        System.out.print(ans);
    }
    /*convets the long data type into string so as to take out digit one by one from the number*/
    boolean check(long a)
    {
        boolean k=false;
        String s=Long.toString(a),temp="";
        for(int b=0; b<s.length(); b++)
        {
            char ch=s.charAt(b);
            temp=ch+temp;
        }
        if(temp.equalsIgnoreCase(s))
        {
            k=true;
        }
        return k;
    }
}